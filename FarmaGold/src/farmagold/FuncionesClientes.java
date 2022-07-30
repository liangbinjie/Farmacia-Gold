package farmagold;
import javax.swing.*;

public class FuncionesClientes {
    
    // Definimos un arreglo de 100 clientes por dia
    public Clientes listaClientes[] = new Clientes[5];
    
    
    // COnstructores
    public FuncionesClientes() {
        clienteEstab();
        agregarCliente();
        mostrarListaClients();
    }
    
    
    // Funciones
    
    public void clienteEstab() {
        listaClientes[0] = new Clientes(11121212, "Isaac", "Lopez", "ilopez@gmail.com", 87654325);
    }
    public void agregarCliente() {
        int index = listaClientes.length - 1;
        int new_client = 0;
        for(int c=index; c>=0; c--) {
            if (listaClientes[c] == null || listaClientes[c].isActive() == false) {
                index--;
                listaClientes[c] = new Clientes();
                
            } else {
                
                new_client = index+1;
                listaClientes[new_client].setIdentificacion(Long.parseLong(JOptionPane.showInputDialog("Ingrese la identificacion: ")));
                listaClientes[new_client].setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                listaClientes[new_client].setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos: "));
                listaClientes[new_client].setEmail(JOptionPane.showInputDialog("Ingrese el email: "));
                listaClientes[new_client].setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero telefonico: ")));
                listaClientes[new_client].setActive(true);
                break;
                
            }
        }
    }
    
    public void mostrarListaClients() {
        for (int c=0; c<listaClientes.length; c++) {
            String info = "";
            info += listaClientes[c].getNombre();
            
            JOptionPane.showMessageDialog(null, info);
        }
    }
}
