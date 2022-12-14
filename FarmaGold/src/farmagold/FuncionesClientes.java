package farmagold;
import javax.swing.*;

public class FuncionesClientes {
    
    
    // Constructores
    public FuncionesClientes() {
        
    }
    public FuncionesClientes(Clientes listaClientes[]) {

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea realizar? \n(1) Mostrar clientes\n(2) Agregar nuevo cliente"
                    + "\n(3) Buscar cliente\n(4) Modificar Informacion\n(5) Salir"));
       
            if (opcion == 1) {
                mostrarListaClientes(listaClientes);
            } else if (opcion == 2) {
                agregarNuevoCliente(listaClientes);
            } else if (opcion == 3) {
                buscarClienteID(listaClientes);
            } else if (opcion == 4) {
                Modificadores modifiers = new Modificadores();
                modifiers.modificarClientes(listaClientes);
            } else if (opcion == 5) {
                break;
            }
        }
    }
    
    
    // Funciones para agregar a algun cliente que no esta en la base de datos

    public void agregarNuevoCliente (Clientes listaClientes[]){
        int indice = listaClientes.length-1;
        int new_client_index = 0;
        
        for(int i=indice; i>=0; i--) {
            if (listaClientes[i].isActive()== false){
                indice--;
                
            }else {
                new_client_index = indice+1;
                boolean registered = false;
                long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del cliente nuevo"));
                for (int x=0; x<listaClientes.length; x++){
                    if(identificacion == listaClientes[x].getIdentificacion()){
                        registered = true;
                    }
                }
                
                if(registered == true) {
                    JOptionPane.showMessageDialog(null, "Este cliente ya esta registrado");
                    break;
                
                }else {
                    listaClientes[new_client_index].setIdentificacion(identificacion);
                    listaClientes[new_client_index].setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                    listaClientes[new_client_index].setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos: "));
                    listaClientes[new_client_index].setEmail(JOptionPane.showInputDialog("Ingrese el email: "));
                    listaClientes[new_client_index].setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero telefonico: ")));
                    listaClientes[new_client_index].setEstado(Clientes.Estados.Activo);
                    listaClientes[new_client_index].setActive(true);
                    
                    
                    
                    
                }
                
       
            }
        }
    }
    
    public void mostrarListaClientes(Clientes listaClientes[]) {
        for (int i=0; i<listaClientes.length; i++) {
            if (listaClientes[i].isActive() == true) {
                String info = "";
                info +="**Informaci??n de Clientes**" + "\nNombre Cliente: "+ listaClientes[i].getNombre()+" "+listaClientes[i].getApellidos()+"\nIdentificacion: "+listaClientes[i].getIdentificacion()+
                        "\nCorreo Electronico: "+listaClientes[i].getEmail()+"\nNumero Telefonico: "+listaClientes[i].getTelefono()+"\nEstatus: "+listaClientes[i].getEstado();
                        

                JOptionPane.showMessageDialog(null, info);
            }

        
    }    
    }
    
    
    // Funcion para buscar cliente por identificacion
    public int buscarClienteID(Clientes listaClientes[]) {
        Long search_id = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
        
        int found_index = 0;
        boolean found = false;
        for (int i=0; i<listaClientes.length; i++) {

            if (listaClientes[i].getIdentificacion() == search_id) {
                found_index = i;
                found = true;
            }  
        }
        if (found == true) {
            String info = "";
            info += "Identificacion: " + listaClientes[found_index].getIdentificacion() + "\nNombre: " + listaClientes[found_index].getNombre() + " " + listaClientes[found_index].getApellidos()
                + "\nEmail: " + listaClientes[found_index].getEmail() + "\nTelefono: " + listaClientes[found_index].getTelefono();
            JOptionPane.showMessageDialog(null, info);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
        }
        
        return found_index;
    }
    
    
    // Funcion para buscar cliente por ID y obtener nombre (Funcion usada en las funciones de ventas
    public boolean infoCliente(long identificacion, Clientes listaClientes[]) {
        boolean found = false;
        int index = 0;
        for(int i=0; i<listaClientes.length; i++) {
            if(identificacion == listaClientes[i].getIdentificacion()){
                found = true; // si se encuentra la identificacion, pone el estado de found en true
                index = i;
            }
        }
        
        if (found==true){
            System.out.println("Cliente: " + listaClientes[index].getNombre() + " " + listaClientes[index].getApellidos() + "\nIndentificacion del cliente: " + listaClientes[index].getIdentificacion());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
        }
        
        return found;
    }
    
        // Funcion para modificar estado de empleado
    public void modificarEstatus(Clientes listaClientes[]) {
        int index = buscarClienteID(listaClientes);
        if(index==-1){
            System.out.print("Nada");
        } else {
            
            JOptionPane.showMessageDialog(null, "Cliente: " + listaClientes[index].getIdentificacion() + " - Se le ha desactivado su estatus de " + listaClientes[index].isActive());
            listaClientes[index].setActive(!listaClientes[index].isActive());
        }
    }
}