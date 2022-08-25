package farmagold;
import javax.swing.*;
import java.time.*;


public class FuncionesVentas {
    
    // constructor
    public FuncionesVentas(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[], Medicamentos listaMedicamentos[]){
        vender(listaEmpleados, listaClientes, facturas, listaMedicamentos);
    }
    

// funciones
    
    public void vender(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[], Medicamentos listaMedicamentos[]){
        datos(listaEmpleados, listaClientes, facturas, listaMedicamentos);
    }
    
    public void datos(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[], Medicamentos listaMedicamentos[]){
        // preguntamos que quiere comprar
        // buscamos en la base de datos si esta disponible
        FuncionEmpleados empleado = new FuncionEmpleados();
        if (empleado.iniciarSesion(listaEmpleados)==true){         // iniciamos sesion

            FuncionesClientes cliente = new FuncionesClientes();   
            long idCliente = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del cliente"));// preguntamos el id del cliente, busca el nombre del cliente
            if(cliente.infoCliente(idCliente, listaClientes) == true) {
                // obtenemos la informacion del cliente
                ventaMedicamentos(idCliente, listaMedicamentos, facturas, listaClientes);
            }
        }
    }
    
    
    public void ventaMedicamentos(long idCliente, Medicamentos listaMedicamentos[], Ventas facturas[], Clientes listaClientes[]) {
        String compra = "";
        double montoFinal = 0;
        
        String[] botones = {"Agregar", "Finalizar"};
        JPanel panelCompra = new JPanel();
        panelCompra.add(new JLabel("Nombre o codigo del medicamento"));
        JTextField medicamento = new JTextField(10);
        panelCompra.add(medicamento);
        panelCompra.add(new JLabel("Cantidad"));
        JTextField cantidad = new JTextField(10);
        panelCompra.add(cantidad);
        
        while (true) {
            int result = JOptionPane.showOptionDialog(null, panelCompra, "Compra de medicamento",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, botones, null);
        
            if (result == JOptionPane.YES_OPTION){
                boolean found = verificarMedicamento(medicamento.getText(), Integer.parseInt(cantidad.getText()), listaMedicamentos);
                
                
                if (found==true) {
                    compra += buscarMedicamento(medicamento.getText(), listaMedicamentos) + ": " + cantidad.getText() + "\n";
                    montoFinal += monto(medicamento.getText(), Integer.parseInt(cantidad.getText()), listaMedicamentos);
               
                    medicamento.setText("");
                    cantidad.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Medicamento no encontrado o cantidad no disponible");
                }
            }
            
            if (result == JOptionPane.NO_OPTION){
                break;
            }
        }
        // Agregar el objeto al arreglo de facturas
        String cliente = "";
        for (int i=0; i<listaClientes.length; i++) {
            if (listaClientes[i].getIdentificacion() == idCliente) {
                cliente = listaClientes[i].getNombre() + " " + listaClientes[i].getApellidos();
            }
        }
        int id_factura = agregarFactura(cliente, idCliente, montoFinal, facturas, compra);
        String invoice = "No Factura: " + id_factura +"\n--------------------------------------" 
                +"\nCliente: " + cliente + "\nID Cliente: " + idCliente + "\n--------------------------------------"+
                "\nCompra:\n" + compra+"--------------------------------------" +
                "\nMonto: " + montoFinal;
        JOptionPane.showMessageDialog(null, invoice);
        System.out.println(compra + "\nMonto: " + montoFinal);
        
    }
    
    public boolean verificarMedicamento(String medicamento, int cantidad, Medicamentos listaMedicamentos[]){
        boolean verificado = false;
        for(int i=0;i<listaMedicamentos.length;i++){
            if (medicamento.equals(listaMedicamentos[i].getNombre()) || medicamento.equals(listaMedicamentos[i].getCodigo()) && cantidad<=listaMedicamentos[i].getCantidad()){
                listaMedicamentos[i].setCantidad(listaMedicamentos[i].getCantidad()-cantidad);
                verificado = true;
            }
        }
        return verificado;
}
    
    public double monto(String medicamento, int cantidad, Medicamentos listaMedicamentos[]) {
        double monto = 0 * cantidad;
        for(int i=0; i<listaMedicamentos.length; i++) {
            if (listaMedicamentos[i].getNombre().equals(medicamento) || listaMedicamentos[i].getCodigo().equals(medicamento)) {
                monto = cantidad * listaMedicamentos[i].getPrecio();
            }
        }
        
        return monto;
    }
    
    public int agregarFactura(String cliente, long idCliente, double monto, Ventas facturas[], String compra) {
        int indice = facturas.length - 1;
        int indice_agregar = 0;
        
        for (int i=indice; i>=0; i--) {
            if (facturas[i].isActive() == false) {
                facturas[i] = new Ventas();
                indice--;
            } else {
                indice_agregar = indice + 1;
                // agregamos los datos al arreglo de objeto
                facturas[indice_agregar].setIdFactura(indice_agregar);
                facturas[indice_agregar].setNombreCliente(cliente);
                facturas[indice_agregar].setClienteID(idCliente);
                facturas[indice_agregar].setCompra(compra);
                facturas[indice_agregar].setMonto(monto);
                facturas[indice_agregar].setActive(true);
                
            }
        }
        System.out.println("Factura agregada");
        return indice_agregar;
    }
    
    public String buscarMedicamento(String medicamento, Medicamentos listaMedicamentos[]) {
        String nombre = "";
        for (int i=0; i<listaMedicamentos.length; i++) {
            if (listaMedicamentos[i].getCodigo().equals(medicamento) || listaMedicamentos[i].getNombre().equals(medicamento)) {
                nombre = listaMedicamentos[i].getNombre();
            }
        }
        
        return nombre;
    }
}
