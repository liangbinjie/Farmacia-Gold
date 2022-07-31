package farmagold;
import javax.swing.*;

public class Interfaz {

    public String opciones = "Digite la opcion que requiere realizar \n(1) Vender\n(2) Base de datos\n(3) Salir";
    public Interfaz(Empleados listaEmpleados[], Clientes listaClientes[]) {
        
        
    while (true) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, opciones));
        if (opcion == 1) {
            System.out.println("vender");
        } else if (opcion == 2) {
            BaseDatos dataBase = new BaseDatos(listaEmpleados, listaClientes);
        } else if (opcion == 3) {
            break;
        }
    }
    }
    
}
