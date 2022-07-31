package farmagold;
import javax.swing.*;

public class FuncionesClientes {
    
    
    // Constructores
    public FuncionesClientes(Clientes listaClientes[]) {
        clienteEstab(listaClientes);
        
        
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea realizar? \n(1) Mostrar clientes\n(2) Agregar nuevo cliente\n(3) Buscar cliente\n(4) Salir"));
       
            if (opcion == 1) {
                mostrarListaClientes(listaClientes);
            } else if (opcion == 2) {
                agregarCliente(listaClientes);
            } else if (opcion == 3) {
                System.out.println("Buscar cliente");
            } else if (opcion == 4) {
                break;
            }
        }
    }
    
    
    // Funciones
    
    public void clienteEstab(Clientes listaClientes[]) {
        listaClientes[0] = new Clientes(11121212, "Isaac", "Lopez", "ilopez@gmail.com", 87654325);
        for (int i=listaClientes.length-1; i>=0; i--) {
            if (listaClientes[i] == null) {
                listaClientes[i] = new Clientes();
            }
        }
    }
    
    public void agregarCliente(Clientes listaClientes[]) {
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
    
    public void mostrarListaClientes(Clientes listaClientes[]) {
        for (int c=0; c<listaClientes.length; c++) {
            String info = "";
            info += listaClientes[c].getNombre();
            
            JOptionPane.showMessageDialog(null, info);
        }
    }
}