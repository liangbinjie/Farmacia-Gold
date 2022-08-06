package farmagold;
import javax.swing.*;

public class Interfaz {

    public String opciones = "Digite la opcion que requiere realizar \n(1) Vender\n(2) Base de datos\n(3) Salir";
    public Interfaz(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[]) {
        
        
    while (true) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, opciones));
        if (opcion == 1) {
            FuncionesVentas ventas = new FuncionesVentas(listaEmpleados, listaClientes, facturas);
        } else if (opcion == 2) {
            BaseDatos dataBase = new BaseDatos(listaEmpleados, listaClientes);
        } else if (opcion == 3) {
            break;
        }
    }
    }
    
}
//Parte de Medicamentos
public static void main(String[] args) {
        Medicamentos array[] = new Medicamentos[5];
        
        
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "(1) Enter to Database\n(2) Quit"));
            
            if (opcion == 1) {
                MedicamentosFunction callingMedicamentosConstructor = new MedicamentosFunction(array);
            } else if (opcion == 2) {
                break;
            }
        }
    }

