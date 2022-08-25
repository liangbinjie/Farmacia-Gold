package farmagold;
import javax.swing.*;

public class Interfaz {

    public String opciones = "*********Digite la opcion que requiere realizar********* \n(1) Vender\n(2) Base de datos\n(3) Cajas y Estadisticas\n(4) Salir";
    public Interfaz(Empleados listaEmpleados[], Clientes listaClientes[], Ventas facturas[], Medicamentos listaMedicamentos[], Casas listaCasas[]) {
    
        
    while (true) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, opciones));
        if (opcion == 1) {
            FuncionesVentas ventas = new FuncionesVentas(listaEmpleados, listaClientes, facturas, listaMedicamentos);
        } else if (opcion == 2) {
            BaseDatos dataBase = new BaseDatos(listaEmpleados, listaClientes, listaMedicamentos, listaCasas);
        } else if (opcion == 3) {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "(1) Para cajas\n(2) Para estadisticas\n(3) Salir"));
            if (op == 1) {
                Cajas cj = new Cajas(facturas);
            } else if (op == 2) {
                Estadistica st = new Estadistica(facturas);
            } 
        } else if (opcion == 4) {
            break;
        }
    }
    }
    
}