package farmagold;
import javax.swing.*;

public class Modificadores {
    
    public void modificarEmpleado(Empleados listaEmpleados[]) {
        while(true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea modificar?\n(1) Identificacion\n(2) Nombre\n(3) Nombre usuario\n(4) Contrasena\n(5) Estatus"));
            if (opcion == 1) {
                // identificacion
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del empleado a modificar"));
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaEmpleados.length; i++) {
                    if (listaEmpleados[i].getIdentificacion() == identificacion) {
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true) {
                    // modificamos
                    long nueva_identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la nueva identificacion del empleado a modificar"));
                    listaEmpleados[index].setIdentificacion(nueva_identificacion);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    break;
                }
            } else if (opcion == 2) {
                // nombre y apellido
                // identificacion
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del empleado a modificar"));
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaEmpleados.length; i++) {
                    if (listaEmpleados[i].getIdentificacion() == identificacion) {
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true) {
                    // modificamos
                    String nombre = JOptionPane.showInputDialog(null, "Digite el nombre del empleado a modificar");
                    listaEmpleados[index].setNombre(nombre);
                    String apellidos = JOptionPane.showInputDialog(null, "Digite el apellido del empleado a modificar");
                    listaEmpleados[index].setApellidos(apellidos);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    break;
                }
            } else if (opcion == 3) {
                // nombre usuario
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del empleado a modificar"));
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaEmpleados.length; i++) {
                    if (listaEmpleados[i].getIdentificacion() == identificacion) {
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true) {
                    // modificamos
                    String nickname = JOptionPane.showInputDialog(null, "Digite el nuevo nombre de usuario del empleado a modificar");
                    listaEmpleados[index].setNickname(nickname);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    break;
                }
            } else if (opcion == 4) {
                // contrasena
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del empleado a modificar"));
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaEmpleados.length; i++) {
                    if (listaEmpleados[i].getIdentificacion() == identificacion) {
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true) {
                    // modificamos
                    String contrasena = JOptionPane.showInputDialog(null, "Digite la contrasena nueva del empleado a modificar");
                    listaEmpleados[index].setPassword(contrasena);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    break;
                } 
            } else if (opcion == 5) {
                // estatus
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del empleado a modificar"));
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaEmpleados.length; i++) {
                    if (listaEmpleados[i].getIdentificacion() == identificacion) {
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true) {
                    // modificamos
                    if (listaEmpleados[index].getEstado() == Empleados.Estados.Activo) {
                        listaEmpleados[index].setEstado(Empleados.Estados.Inactivo);
                    } else {
                        listaEmpleados[index].setEstado(Empleados.Estados.Activo);
                    }
                    break;
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    break;
                } 
            } else if (opcion == 6) {
                break; 
            }
        }

        
    
    }
    
    public void modificarClientes(Clientes listaClientes[]) {
        while(true){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea modificar?\n(1) Identificación\n(2) Nombre\n(3) Email\n(4) Telefono\n(5) Estatus"));
            if (opcion == 1) {
                //Identificacion
                long identifiacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificación actual del cliente que desea modificar: "));
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaClientes.length; i++) {
                    if (listaClientes[i].getIdentificacion()==identifiacion) {
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true){
                    //modificamos
                    long nueva_identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la nueva identificacion del cliente a modificar: "));
                    listaClientes[index].setIdentificacion(nueva_identificacion);
                    break;
                }else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    break;
                }
            }else if (opcion == 2) {
                //Nombre y Apellido
                //Identificacion
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificación del cliente a modificar"));
                boolean encontrado =false;
                int index =0;
                for (int i=0; i<listaClientes.length; i++){
                    if (listaClientes[i].getIdentificacion()== identificacion){
                        encontrado = true;
                        index = i;
                        
                    }
                }
                
                if(encontrado == true){
                    //modificamos el nombre y el apellido 
                    String nombre = JOptionPane.showInputDialog(null, "Digite el nombre nuevo del cliente a modificar: ");
                    listaClientes[index].setNombre(nombre);
                    String apellido = JOptionPane.showInputDialog(null, "Digite los apellidos nuevo del cliente a modificar: ");
                    listaClientes[index].setApellidos(apellido);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, " Cliente no encontrado");
                    break; 
                }
 
            }else if (opcion == 3){
                //email
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificación del cliente a modificar: "));
                boolean encontrado = false;
                int index =0;
                for (int i=0;i<listaClientes.length;i++){
                    if (listaClientes[i].getIdentificacion()== identificacion){
                        encontrado = true;
                        index = i;
                        
                    }
                }
                
                if (encontrado == true){
                    //modificamos el email
                    String email = JOptionPane.showInputDialog(null,"Digite el email nuevo del cliente a modificar: " );
                    listaClientes[index].setEmail(email);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    break;
                
            }
            }else if (opcion == 4){
                //Telefono
                long identificacion =Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificación del cliente a modificar: "));
                boolean encontrado = false;
                int index = 0;
                for (int i=0;i<listaClientes.length;i++){
                    if (listaClientes[i].getIdentificacion()== identificacion){
                        encontrado = true;
                        index = i;
                    }
                }
                
                if (encontrado == true){
                    //modificamos el numero
                    long telefono =Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono del cliente a modificar:"));
                    listaClientes[index].setTelefono(telefono);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    break;
                }
                
            }else if (opcion == 5){
                //Estado
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificación del cliente a modificar: "));
                boolean encontrado = false;
                int index = 0;
                for (int i=0;i<listaClientes.length;i++){
                    if (listaClientes[i].getIdentificacion()== identificacion){
                        encontrado =true;
                        index = i;
                    }
                }
                
                if (encontrado == true){
                    //Modificamos el Estatus
                    if (listaClientes[index].getEstado()== Clientes.Estados.Activo){
                        listaClientes[index].setEstado(Clientes.Estados.Inactivo);
                    }else{
                        listaClientes[index].setEstado(Clientes.Estados.Activo);
                    }
                    break;
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    break;
                }
            } else if (opcion == 6) {
                break;
            }
            
                
            }
    

        
    }  
    
    public void modificarMedicinas(Medicamentos listaMedicamentos[]){
        while(true){
             int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea modificar?\n (1)Nombre\n(2) Codigo\n(3) Precio\n(4) Categoría\n(5) Cantidad "));
            if (opcion == 1){
                //codigo del medicamento
                String codigo = JOptionPane.showInputDialog(null, " Ingrese el codigo del medicamento que desea modificar: ");
                boolean encontrado =false;
                int index = 0;
                for (int i=0;i<listaMedicamentos.length;i++){
                    if (listaMedicamentos[i].getCodigo()== codigo){
                        encontrado = true;
                        index = i;
                    }
                }
                if (encontrado == true){
                    //modificamos el nombre
                    String nuevo_nombre = JOptionPane.showInputDialog(null, " Ingrese el nuevo nombre del medicamento que desea modificar: ");
                    listaMedicamentos[index].setNombre(nuevo_nombre);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Codigo del medicamento invalido");
                    break;
                }
            }else if (opcion == 2){
                //codigo del medicamento
                String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo del medicamento que desea modificar: ");
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaMedicamentos.length;i++){
                    if (listaMedicamentos[i].getCodigo() == codigo){
                        index = i;
                    }
                }
                if (encontrado == true){
                    //Modificamos el codigo del medicamento
                    String nuevo_codigo = JOptionPane.showInputDialog(null, " Ingrese el codigo nuevo para el medicamento que desea modificar");
                    listaMedicamentos[index].setCodigo(nuevo_codigo);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,"Codigo del medicamento invalido");
                    break;
                }
                        
                
            }else if(opcion == 3){
                //codigo del medicamento
                String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo del medicamento que desea modificar: ");
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaMedicamentos.length;i++){
                    if (listaMedicamentos[i].getCodigo() == codigo){
                        index =i;
                    }
                }
                if (encontrado ==  true){
                    //Modificamos el precio del medicamento
                    int nuevo_precio =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del medicamento que desea modificar: "));
                    listaMedicamentos[index].setPrecio(nuevo_precio);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Codigo del medicamento invalido");
                    break;
                }
                
                
            }else if(opcion == 4){
                //codigo del medicamento
                String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo para el  medicamento que desea modificar: ");
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaMedicamentos.length;i++){
                    if (listaMedicamentos[i].getCodigo() == codigo){
                        index = i;
                    }
                }
                if (encontrado == true){
                    //Modificamos la categoria del medicamento 
                    String nueva_categoria = JOptionPane.showInputDialog(null, " Ingrese la categoría para el medicamento que desea modificar: ");
                    listaMedicamentos[index].setCategoria(nueva_categoria);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, " Codigo del medicamento no valido");
                    
                    break;
                }
            }else if(opcion == 5){
                //Codigo del medicamento
                //codigo del medicamento
                String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo para el  medicamento que desea modificar: ");
                boolean encontrado = false;
                int index = 0;
                for (int i=0; i<listaMedicamentos.length;i++){
                    if (listaMedicamentos[i].getCodigo() == codigo){
                        index = i;
                    }
                }
            if (encontrado == true){
                //modificamos la cantidad del medicamento
                int nueva_cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese la nueva cantidad para el medicamento que desea modificar"));
                listaMedicamentos[index].setCantidad(nueva_cantidad);
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Codigo del medicamento no valido");
                break;
                        
            }
            }
            
            
        }
    }
        }
        
