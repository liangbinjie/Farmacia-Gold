package farmagold;
import javax.swing.*;

public class BaseDatos {
    
    // constructor
    public BaseDatos(Empleados listaEmpleados[], Clientes listaClientes[], Medicamentos listaMedicamentos[], Casas listaCasas[]) {
        String opciones = "*********Has entrado a la base de datos*********\n- - - - - - - - - - - - - - - - - - \nQue desea modificar? \n(1) Empleados"
                + "\n(2) Clientes\n(3) Medicamentos\n(4) Casas Farmaceuticas\n(5) Salir";
        
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, opciones));
            
            if (opcion == 1) {
                FuncionEmpleados empleados = new FuncionEmpleados(listaEmpleados);
            } else if (opcion == 2) {
                FuncionesClientes clientes = new FuncionesClientes(listaClientes);
            } else if (opcion == 3) {
                MedicamentosFunciones medicamentos = new MedicamentosFunciones(listaMedicamentos);
            } else if (opcion == 4) {
                CasasFunciones casasFarma = new CasasFunciones(listaCasas);
            } else if (opcion == 5) {
                break;
            }
        }
    }
        
}
