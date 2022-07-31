package farmagold;


public class Main {

    public static void main(String[] args) {
        Empleados listaEmpleados[] = new Empleados[7]; // lista Empleados global
        Clientes listaClientes[] = new Clientes[5]; // lista Clientes global
        Interfaz gui = new Interfaz(listaEmpleados, listaClientes);
    }
    
}
