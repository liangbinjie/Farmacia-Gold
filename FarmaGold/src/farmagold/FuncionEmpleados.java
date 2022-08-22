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
                agregarNuevoEmpleado(listaEmpleados);;
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
                    listaEmpleados[append_index].setEdad(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite la edad del empleado")));
                    listaEmpleados[append_index].setCiudad(JOptionPane.showInputDialog(null, "Digite la ciudad de residencia del empleado"));
                    listaEmpleados[append_index].setDireccion(JOptionPane.showInputDialog(null, "Digite la direccion de residencia del empleado"));
                    listaEmpleados[append_index].setEmail(JOptionPane.showInputDialog(null, "Digite el email del empleado"));
                    listaEmpleados[append_index].setTelefono(Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero telefonico del empleado")));
                    listaEmpleados[append_index].setActive(true);
                    break;
                }       
            }
        }
    }
    
    public void mostrarLista(Empleados listaEmpleados[]) {
        String lista = "";
        for (int i=0; i<listaEmpleados.length;i++) {
            lista += (i+1) + ". " + listaEmpleados[i].getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void mostrarEmpleados(Empleados listaEmpleados[]) {
        for(int i=0; i<listaEmpleados.length; i++) {
            if (listaEmpleados[i].isActive() == true) {
                String info = "";
                String encrypt_pass = encriptar(listaEmpleados[i].getPassword());
                info += "Identificacion: " + listaEmpleados[i].getIdentificacion() + "\nNombre usuario: " + listaEmpleados[i].getNickname()
                        + "\nContraseña: " + encrypt_pass + "\n- - - - - - - - - - - - - - - - - - - - -" + "\nNombre: " + listaEmpleados[i].getNombre() + " " + listaEmpleados[i].getApellidos()
                        + "\nEdad: " + listaEmpleados[i].getEdad() + "\nCiudad: " + listaEmpleados[i].getCiudad() + "\nDireccion: " + listaEmpleados[i].getDireccion()
                        + "\nEmail: " + listaEmpleados[i].getEmail() + "\nTelefono: " + listaEmpleados[i].getTelefono() + "\nEstatus: " + listaEmpleados[i].getEstado();
                JOptionPane.showMessageDialog(null, info);
            }

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

    // Funcion para buscar empleado por numero de identificacion
    public int buscarEmpleadoID(Empleados listaEmpleados[]) {
        Long search_id = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));

        int found_index = -1;
        boolean found = false;
        for (int i=0; i<listaEmpleados.length; i++) {

            if (listaEmpleados[i].getIdentificacion() == search_id) {
                found_index = i;
                found = true;
            }
        }
        if (found == true) {
            String info = "";
            String encrypt_pass = encriptar(listaEmpleados[found_index].getPassword());
            info += "Identificacion: " + listaEmpleados[found_index].getIdentificacion() + "\nNombre usuario: " + listaEmpleados[found_index].getNickname()
                + "\nContraseña: " + encrypt_pass + "\n- - - - - - - - - - - - - - - - - - - - -" + "\nNombre: " + listaEmpleados[found_index].getNombre() + " " + listaEmpleados[found_index].getApellidos()
                + "\nEdad: " + listaEmpleados[found_index].getEdad() + "\nCiudad: " + listaEmpleados[found_index].getCiudad() + "\nDireccion: " + listaEmpleados[found_index].getDireccion()
                + "\nEmail: " + listaEmpleados[found_index].getEmail() + "\nTelefono: " + listaEmpleados[found_index].getTelefono() + "\nEstatus: " + listaEmpleados[found_index].isActive();
            JOptionPane.showMessageDialog(null, info);
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
        }
        
        return found_index;
    }
    
    // Funcion para buscar empleado por nombre de usuario
    public void buscarEmpleadoUser(Empleados listaEmpleados[]) {
        String search_user = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario a buscar: ");
        int found_index = 0;
        boolean found = false;

        for (int i=0; i<listaEmpleados.length; i++) {
            if (listaEmpleados[i].getNickname().equals(search_user)) {
                found_index = i;
                found = true;
                System.out.println("True");
            }
        }
        if (found == true) {
            String info = "";
            String encrypt_pass = encriptar(listaEmpleados[found_index].getPassword());
            info += "Identificacion: " + listaEmpleados[found_index].getIdentificacion() + "\nNombre usuario: " + listaEmpleados[found_index].getNickname()
                + "\nContraseña: " + encrypt_pass + "\n- - - - - - - - - - - - - - - - - - - - -" + "\nNombre: " + listaEmpleados[found_index].getNombre() + " " + listaEmpleados[found_index].getApellidos()
                + "\nEdad: " + listaEmpleados[found_index].getEdad() + "\nCiudad: " + listaEmpleados[found_index].getCiudad() + "\nDireccion: " + listaEmpleados[found_index].getDireccion()
                + "\nEmail: " + listaEmpleados[found_index].getEmail() + "\nTelefono: " + listaEmpleados[found_index].getTelefono() + "\nEstatus: " + listaEmpleados[found_index].isActive();
            JOptionPane.showMessageDialog(null, info);
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado o datos incorrectos");
        }
    }
    
    // Funcion para modificar estado de empleado
    public void modificarEstatus(Empleados listaEmpleados[]) {
        int index = buscarEmpleadoID(listaEmpleados);
        if(index==-1){
            System.out.print("Nada");
        } else {
            
            JOptionPane.showMessageDialog(null, "Empleado: " + listaEmpleados[index].getIdentificacion() + " - Se le ha desactivado su estatus de " + listaEmpleados[index].isActive());
            listaEmpleados[index].setActive(!listaEmpleados[index].isActive());
        }
    }
    
    // Funcion para iniciar sesion (usado en las funciones de ventas
    public boolean iniciarSesion(Empleados listaEmpleados[], Ventas facturas[]) {
        JTextField user = new JTextField(15);
        JPasswordField pass = new JPasswordField(15);

        JPanel signInPanel = new JPanel();
        signInPanel.setLayout(new BoxLayout(signInPanel,BoxLayout.Y_AXIS));
        signInPanel.add(new JLabel("Usuario"));
        signInPanel.add(user);
        signInPanel.add(new JLabel("Contrasena"));
        signInPanel.add(pass);

        int result = JOptionPane.showConfirmDialog(null, signInPanel,
                 "Autenticacion de empleado", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        String usuario = user.getText();
        String password = String.valueOf(pass.getPassword());
        
        
        boolean encontrado = false;
        int found_index = 0;
        for(int i=0; i<listaEmpleados.length; i++){
            if(listaEmpleados[i].getNickname().equals(usuario) && listaEmpleados[i].getPassword().equals(password)){
                encontrado = true;
                System.out.println("Usuario ingresado");
                facturas[0].setUsuario(listaEmpleados[i].getNickname());
            }
        }
        
        if (result == JOptionPane.CANCEL_OPTION || encontrado==false ) {
            encontrado = false;
            JOptionPane.showMessageDialog(null, "Empleado no encontrado"); 
        }
        
        return encontrado;
    }
  
    public void agregarFactura(Ventas facturas[]) {
        int index = facturas.length -1;
        int agregar_index = 0;
        
        for(int i=index; i>=0; i--){
            if (facturas[i].getIdFactura() == 0 || facturas[i] == null){
                facturas[i] = new Ventas();
                index--;
            } else {
                agregar_index = index + 1;
                facturas[agregar_index].setIdFactura(agregar_index);
            }
        }
        
    }
    
    public void consultarEmpleado(Empleados listaEmpleados[]) {
        int consulta = Integer.parseInt(JOptionPane.showInputDialog(null, "Si desea buscar por identificacion, digite 1\nSi desea buscar por nombre de usuario, digite 2"));
        if (consulta == 1) {
            buscarEmpleadoID(listaEmpleados);
        } else if (consulta == 2) {
            buscarEmpleadoUser(listaEmpleados);
        }
        
        
    }
}
