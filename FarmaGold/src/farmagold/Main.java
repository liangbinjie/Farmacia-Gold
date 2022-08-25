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

        
        Clientes listaClientes[] = new Clientes[100]; // lista Clientes global
        listaClientes[0] = new Clientes(1, "Default", "Cliente", "cliente@gmail.com", 1); // cliente por defecto
        for (int i=listaClientes.length-1; i>=0; i--) { // los espacios en null les agregamos campos en blanco
            if (listaClientes[i] == null) {
                listaClientes[i] = new Clientes();
            }
        }
        
        
        Ventas facturas[] = new Ventas[100];
        for (int i=0; i<facturas.length; i++) { // los espacios en null les agregamos campos en blanco
            if (facturas[i] == null) {
                facturas[i] = new Ventas();
            }
        }
        facturas[0] = new Ventas(0, 1, "Default", "", 0);
        
        Medicamentos listaMedicamentos[] = new Medicamentos[100];
        for (int i=0; i<listaMedicamentos.length; i++) {
            if (listaMedicamentos[i] == null) {
                listaMedicamentos[i] = new Medicamentos();
            }
        }
        listaMedicamentos[0] = new Medicamentos("Aspirina", "SA001", "Salicilato", 1200, 54);
        listaMedicamentos[1] = new Medicamentos("Acetaminofen", "AA001", "Analgesicos", 1500, 65);
        
        
        
        Casas listaCasas[] = new Casas[100];
        
        for (int i=0; i<listaCasas.length; i++) {
            listaCasas[i] = new Casas();
        }
        
        listaCasas[0]=new Casas("Medicantrix","Mexico");
        listaCasas[1]=new Casas("Vaccined","Inglaterra");

        Interfaz gui = new Interfaz(listaEmpleados, listaClientes, facturas, listaMedicamentos, listaCasas);
    }
    
}