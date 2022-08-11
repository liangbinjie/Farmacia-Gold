package farmagold;
import javax.swing.*;

public class BaseDatos {
    
    // constructor
    public BaseDatos(Empleados listaEmpleados[], Clientes listaClientes[], Medicamentos listaMedicamentos[]) {
        String opciones = "Has entrado a la base de datos\n- - - - - - - - - - - - - - - - - - \nQue desea modificar? \n(1) Empleados"
                + "\n(2) Clientes\n(3) Medicamentos\n(4) Salir";
        
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, opciones));
            
            if (opcion == 1) {
                FuncionEmpleados empleados = new FuncionEmpleados(listaEmpleados);
            } else if (opcion == 2) {
                FuncionesClientes clientes = new FuncionesClientes(listaClientes);
            } else if (opcion == 3) {
                MedicamentosFuncion medicamentos = new MedicamentosFuncion(listaMedicamentos);
            } else if (opcion == 4) {
                break;
            }
        }
    }
        
}
