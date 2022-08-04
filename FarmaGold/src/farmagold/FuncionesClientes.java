package farmagold;
import javax.swing.*;

public class FuncionesClientes {
    
    
    // Constructores
    public FuncionesClientes() {
        
    }
    public FuncionesClientes(Clientes listaClientes[]) {

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea realizar? \n(1) Mostrar clientes\n(2) Agregar nuevo cliente\n(3) Buscar cliente\n(4) Salir"));
       
            if (opcion == 1) {
                mostrarListaClientes(listaClientes);
            } else if (opcion == 2) {
                agregarCliente(listaClientes);
            } else if (opcion == 3) {
                buscarClienteID(listaClientes);
            } else if (opcion == 4) {
                break;
            }
        }
    }
    
    
    // Funciones

    public void agregarCliente(Clientes listaClientes[]) {
        int index = listaClientes.length - 1;
        int new_client = 0;
        for(int i=index; i>=0; i--) {
            if (listaClientes[i] == null || listaClientes[i].isActive() == false) {
                index--;
                listaClientes[i] = new Clientes();
                
            } else {
                
                new_client = index+1;
                listaClientes[new_client].setIdentificacion(Long.parseLong(JOptionPane.showInputDialog("Ingrese la identificacion: ")));
                listaClientes[new_client].setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                listaClientes[new_client].setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos: "));
                listaClientes[new_client].setEmail(JOptionPane.showInputDialog("Ingrese el email: "));
                listaClientes[new_client].setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero telefonico: ")));
                listaClientes[new_client].setActive(true);
            }
        }
    }
    
    public void mostrarListaClientes(Clientes listaClientes[]) {
        for (int i=0; i<listaClientes.length; i++) {
            if (listaClientes[i].isActive() == true) {
                String info = "";
                info += listaClientes[i].getNombre();

                JOptionPane.showMessageDialog(null, info);
            }
        }
    }
    
    
    // Funcion para buscar cliente por identificacion
    public void buscarClienteID(Clientes listaClientes[]) {
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
    }
    
    
    // Funcion para buscar cliente por ID y obtener nombre
    public void infoCliente(Clientes listaClientes[]) {
        long identificacion = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la identificacion del cliente"));
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
    }
}