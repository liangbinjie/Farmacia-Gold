package farmagold;
import javax.swing.*;


public class FuncionEmpleados {

    // La farmacia tiene un total de 10 empleados

    // Constructores
    public FuncionEmpleados(){
        
    }
    public FuncionEmpleados(Empleados listaEmpleados[]) {

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Estas en la base de datos de los empleados\n- - - - - - - - - - - - - - - -"
                    + "\nQue desea realizar? \n(1) Mostrar empleados\n(2) Mostrar lista de empleados"
                    + "\n(3) Agregar nuevo empleado\n(4) Buscar Empleado\n(5) Modificar datos del empleado\n(6) Salir"));

            if (opcion == 1) {
                mostrarEmpleados(listaEmpleados);

            } else if (opcion == 2) {
                mostrarLista(listaEmpleados);

            } else if (opcion == 3) {
                agregarNuevoEmpleado(listaEmpleados);
            } else if (opcion == 4) {
                consultarEmpleado(listaEmpleados);


            } else if (opcion == 5) {
                Modificadores modifiers = new Modificadores();
                modifiers.modificarEmpleado(listaEmpleados);
            } else if (opcion == 6) {
                break;
            }
        }
    }

    // Funciones
    public void empleadosEstablecidos(Empleados listaEmpleados[]) {
        // Funcion para definir los usuarios/empleados establecidos
        listaEmpleados[0] = new Empleados(115600413, "benji", "admin12345", "Binjie", "Liang", (byte)19, "San Jose", "100 mts este de la iglesia", "mailandresliang@gmail.com", 87234511);
        listaEmpleados[1] = new Empleados(119010685, "ajbustos", "ajB12345", "Aaron", "Bustos Peralta", (byte)18, "San Jose", "200 mts este de la iglesia", "aaronj.bustos@gmail.com", 71708049);
        listaEmpleados[2] = new Empleados(118860981, "jxazof", "azof0987", "Jimena", "Azofeifa Porras", (byte)19, "Heredia", "100 mts norte de la iglesia", "jazofeifa60981@ufide.ac.cr", 84933443);
        listaEmpleados[3] = new Empleados(119020919, "aleon", "leon2023", "Andres", "Leon Jimenez", (byte)21, "Cartago", "100 mts sur de la iglesia", "andrescrcs04@gmail.com", 85057877);
    }
    
    public void agregarNuevoEmpleado(Empleados listaEmpleados[]) {
        int indice = listaEmpleados.length - 1;
        int append_index = 0;

        for (int i=indice; i>=0; i--) {
            if (listaEmpleados[i].isActive() == false) {
                indice--;

            } else {
                append_index = indice+1;
                boolean registered = false;
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion"));
                for (int x=0; x<listaEmpleados.length; x++) {
                    if(identificacion == listaEmpleados[x].getIdentificacion()) {
                        registered = true;
                    }
                }
                if (registered == true) {
                    JOptionPane.showMessageDialog(null, "Este usuario ya esta registrado");
                    break;
                } else {
                    listaEmpleados[append_index].setIdentificacion(identificacion);
                    listaEmpleados[append_index].setNickname(JOptionPane.showInputDialog(null, "Digite el nombre de usuario a crear"));
                    listaEmpleados[append_index].setPassword(JOptionPane.showInputDialog(null, "Digite la contraseña a crear"));
                    listaEmpleados[append_index].setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del empleado"));
                    listaEmpleados[append_index].setApellidos(JOptionPane.showInputDialog(null, "Digite los apellidos del empleado"));
                    listaEmpleados[append_index].setEdad(By…