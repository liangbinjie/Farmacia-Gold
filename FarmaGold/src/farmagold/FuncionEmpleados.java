package farmagold;
import javax.swing.*;


public class FuncionEmpleados {

    // La farmacia tiene un total de 10 empleados

    // Constructores
    public FuncionEmpleados(Empleados listaEmpleados[]) {
        empleadosEstablecidos(listaEmpleados);
        nuevoEmpleado(listaEmpleados);
        
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea realizar? \n(1) Mostrar empleados\n(2) Mostrar lista de empleados\n(3) Agregar nuevo empleado\n(4) Salir"));
       
            if (opcion == 1) {
                mostrarEmpleados(listaEmpleados);
                break;
            } else if (opcion == 2) {
                mostrarLista(listaEmpleados);
                break;
            } else if (opcion == 4) {
                break;
            }
        }
    }

    // Funciones

    public void empleadosEstablecidos(Empleados listaEmpleados[]) {
        // Funcion para definir los usuarios/empleados establecidos
        listaEmpleados[0] = new Empleados(115600413, "benji", "admin12345", "Binjie", "Liang", (byte)19, "San Jose", "100 mts este de la iglesia", "mailandresliang@gmail.com", 86651234);
        listaEmpleados[1] = new Empleados(987654321, "ajbustos", "ajB12345", "Aaron", "Bustos Peralta", (byte)18, "San Jose", "200 mts este de la iglesia", "mailandresliang@gmail.com", 85655324);
        listaEmpleados[2] = new Empleados(123456734, "jxazof", "azof0987", "Jimena", "Azofeifa Porras", (byte)19, "Heredia", "100 mts norte de la iglesia", "mailandresliang@gmail.com", 86674543);
        listaEmpleados[3] = new Empleados(132115642, "aleon", "leon2023", "Andres", "Leon Jimenez", (byte)21, "Cartago", "100 mts sur de la iglesia", "mailandresliang@gmail.com", 83554421);
    }
    public void nuevoEmpleado(Empleados listaEmpleados[]) {
        for(int i=4; i<listaEmpleados.length; i++) {
            listaEmpleados[i] = new Empleados();
        }
    }
    public void mostrarLista(Empleados listaEmpleados[]) {
        String lista = "";
        for (int i=0; i<listaEmpleados.length;i++) {
            lista += (i+1) + listaEmpleados[i].getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void mostrarEmpleados(Empleados listaEmpleados[]) {
        for(int i=0; i<listaEmpleados.length; i++) {
            String info = "";
            String encrypt_pass = encriptar(listaEmpleados[i].getPassword());
            info += "Identificacion: " + listaEmpleados[i].getIdentificacion() + "\nNombre usuario: " + listaEmpleados[i].getNickname()
                    + "\nContraseña: " + encrypt_pass + "\n- - - - - - - - - - - - - - - - - - - - -" + "\nNombre: " + listaEmpleados[i].getNombre() + " " + listaEmpleados[i].getApellidos()
                    + "\nEdad: " + listaEmpleados[i].getEdad() + "\nCiudad: " + listaEmpleados[i].getCiudad() + "\nDireccion: " + listaEmpleados[i].getDireccion()
                    + "\nEmail: " + listaEmpleados[i].getEmail() + "\nTelefono: " + listaEmpleados[i].getTelefono() + "\nEstatus: " + listaEmpleados[i].isActive();
            JOptionPane.showMessageDialog(null, info);
        }

    }

    // Encriptacion de contrasena
    public String encriptar(String password) {
        int pass_len = password.length();
        String pass_encrypt = "";
        for (int i=0; i<pass_len; i++) {
            pass_encrypt += "*";
        }
        return pass_encrypt;
    }
}
