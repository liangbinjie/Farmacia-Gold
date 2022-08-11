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
    }
    
    public void datos(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[]){
        // preguntamos que quiere comprar
        // buscamos en la base de datos si esta disponible
        FuncionEmpleados empleado = new FuncionEmpleados();
        if (empleado.iniciarSesion(listaEmpleados, facturas)==true){         // iniciamos sesion
            System.out.println(facturas[0].getUsuario());
            FuncionesClientes cliente = new FuncionesClientes();        // preguntamos el id del cliente, busca el nombre del cliente
            if(cliente.infoCliente(listaClientes) == true) {
                // obtenemos la informacion del cliente
                ventaMedicamentos();
            }
        }
    }
    
    
    public void ventaMedicamentos() {
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
                compra += medicamento.getText() + ": " + cantidad.getText() + "\n";
                medicamento.setText("");
                cantidad.setText("");
            }
            
            if (result == JOptionPane.NO_OPTION){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, compra);
        System.out.println(compra);
        
    }
}
