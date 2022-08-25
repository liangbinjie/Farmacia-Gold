package farmagold;
import javax.swing.*;
public class Estadistica {
    
    public Estadistica(Ventas facturas[]) {
        
        double montoDiario = 0;
            // arreglo de ventas diarias 
        double ventasDiaria[] = new double[100];
        for (int i=0; i<ventasDiaria.length; i++) {
            ventasDiaria[i] = 0;
        }
        
        
        int clientes = -1;
        for (int i=0; i<facturas.length; i++) {
            if (facturas[i].isActive() == true) {
                ventasDiaria[i] = facturas[i].getMonto();
                
            }
            
            if (facturas[i].getClienteID() != 0) {
                clientes ++;
            }
        }
        JOptionPane.showMessageDialog(null, "Se atendieron un total de " + clientes + " clientes");
        
        for (int i=0; i<ventasDiaria.length; i++) {
            montoDiario += ventasDiaria[i];
        }
        
        JOptionPane.showMessageDialog(null, "Se recaudo $" + montoDiario + " el dia de hoy");
    }
}
