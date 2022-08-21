package farmagold;
import javax.swing.*;

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
        if (empleado.iniciarSesion(listaEmpleados, facturas)==true){         // iniciamos sesion
            System.out.println(facturas[0].getUsuario());
            FuncionesClientes cliente = new FuncionesClientes();        // preguntamos el id del cliente, busca el nombre del cliente
            if(cliente.infoCliente(listaClientes) == true) {
                // obtenemos la informacion del cliente
                ventaMedicamentos(listaMedicamentos);
            }
        }
    }
    
    
    public void ventaMedicamentos(Medicamentos listaMedicamentos[]) {
        String compra = "";
        
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
                boolean found = false;
                for (int i=0; i<listaMedicamentos.length; i++) {
                    if (medicamento.getText() == listaMedicamentos[i].getNombre()) {
                        found = true;
                    }
                }
                
                if (found==true) {
                    compra += medicamento.getText() + ": " + cantidad.getText() + "\n";
               
                    medicamento.setText("");
                    cantidad.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Medicamentos no encontrado");
                }

                
            }
            
            if (result == JOptionPane.NO_OPTION){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, compra);
        System.out.println(compra);
        
    }
}
