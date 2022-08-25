package farmagold;
import javax.swing.*;

public class Cajas {
    
    public Cajas(Ventas facturas[]) {
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opcion que desea realizar\n(1) Buscar factura\n(2) Anular factura\n(3) Salir"));
            
            if (opcion == 1) {
                // buscar factura
                long id = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero de factura que desea buscar"));
                buscarFactura(id, facturas);
                break;
            } else if (opcion == 2) {
                long id = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero de factura que desea anular"));
                anularFactura(id, facturas);
                break;
            } else {
                break;
            }
        }
    }
    
    public void buscarFactura(long id, Ventas facturas[]) {
        boolean found = false;
        int found_index = 0;
        for (int i=0; i<facturas.length; i++) {
            if (facturas[i].getIdFactura() == id) {
                found = true;
                found_index = i;
            }
        }

        if (found == true) {
            String info ="";
            info+="No factura: "+facturas[found_index].getIdFactura()+"\nCliente ID: "+facturas[found_index].getClienteID()+"\nCliente: "+
                    facturas[found_index].getNombreCliente()+"\nCompra: \n"+facturas[found_index].getCompra()+"\nMonto: "+facturas[found_index].getMonto();
            JOptionPane.showMessageDialog(null, info);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la factura");
        }
        
    }
    
    
    public void anularFactura(long id, Ventas facturas[]) {
        boolean found = false;
        int found_index = 0;
        for (int i=0; i<facturas.length; i++) {
            if (facturas[i].getIdFactura() == id) {
                found = true;
                found_index = i;
            }
        }

        if (found == true) {
            facturas[found_index].setActive(false);
            JOptionPane.showMessageDialog(null, "La factura No " + facturas[found_index].getIdFactura() + " se ha anulado");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la factura");
        }
    }
    
}
