package farmagold;
import javax.swing.*;

public class FuncionesVentas {
    
    // constructor
    public FuncionesVentas(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[]){
        vender(listaEmpleados, listaClientes, facturas);
    }
    // funciones
    
    public void vender(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[]){
        datos(listaEmpleados, listaClientes, facturas);
        ventaMedicamentos();
//        String compra = "";
        
//        while (true) {
//            String buscar = JOptionPane.showInputDialog(null, "Digite el nombre o codigo de producto");
        //    encontrado = false;
        //    index = 0;
//            for(int i=0; listaMedicamentos.length; i++){
//                if(buscar[i].getNombre().equals(buscar)) {
//                    encontrado = true;
//                    index = i;
//                }
//            }
//            if (encontrado == true){
//                int cantidad = Integer.parseInt(JOptionPane.show)
//        }
        
    }
    
    public void datos(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[]){
        // preguntamos que quiere comprar
        // buscamos en la base de datos si esta disponible
        FuncionEmpleados empleado = new FuncionEmpleados();
        if (empleado.iniciarSesion(listaEmpleados, facturas)==true){         // iniciamos sesion
            System.out.println(facturas[0].getUsuario());
            FuncionesClientes cliente = new FuncionesClientes();        // preguntamos el id del cliente, busca el nombre del cliente
            cliente.infoCliente(listaClientes); // obtenemos la informacion del cliente
            
        }
    }
    
    
    public void ventaMedicamentos() {
        String compra = "";
        
        String[] botones = {"Agregar", "Continuar"};
        JPanel panelCompra = new JPanel();
        panelCompra.add(new JLabel("Ingrese nombre o codigo del medicamento"));
        JTextField medicamento = new JTextField(10);
        panelCompra.add(medicamento);
        JTextField cantidad = new JTextField(10);
        panelCompra.add(cantidad);
        
        while (true) {
            int result = JOptionPane.showOptionDialog(null, panelCompra, "Compra de medicamento",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, botones, null);
        
            if (result == JOptionPane.YES_OPTION){
                compra += medicamento.getText() + ": " + cantidad.getText();
            }
            
            if (result == JOptionPane.NO_OPTION){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, compra);
        
    }
}
