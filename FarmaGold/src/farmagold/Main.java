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
        Interfaz gui = new Interfaz(listaEmpleados, listaClientes);
    }
    
}
