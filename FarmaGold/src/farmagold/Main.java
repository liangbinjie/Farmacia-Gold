package farmagold;


public class Main {

    public static void main(String[] args) {
        Empleados listaEmpleados[] = new Empleados[7]; // lista Empleados global
                // llenar los espacios en blanco
        for (int i=0; i<listaEmpleados.length; i++) {
            if (listaEmpleados[i] == null) {
                listaEmpleados[i] = new Empleados(); // llamamos al constructor para que vacie los lugares que no tiene nada
            }
        } 
        FuncionEmpleados empleado = new FuncionEmpleados();
        empleado.empleadosEstablecidos(listaEmpleados); // establecer los usuarios por default

        
        Clientes listaClientes[] = new Clientes[5]; // lista Clientes global
        listaClientes[0] = new Clientes(1, "Default", "Cliente", "cliente@gmail.com", 1); // cliente por defecto
        for (int i=listaClientes.length-1; i>=0; i--) { // los espacios en null les agregamos campos en blanco
            if (listaClientes[i] == null) {
                listaClientes[i] = new Clientes();
            }
        }
        
        
        Ventas facturas[] = new Ventas[5];
        facturas[0] = new Ventas(1, "benji", 115600413, "Default", "Nada", 0);
        for (int i=facturas.length-1; i>=0; i--) { // los espacios en null les agregamos campos en blanco
            if (facturas[i] == null) {
                facturas[i] = new Ventas();
            }
        }
        
        Medicamentos listaMedicamentos[] = new Medicamentos[100];
        Interfaz gui = new Interfaz(listaEmpleados, listaClientes, facturas, listaMedicamentos);
    }
    
}