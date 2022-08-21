package farmagold;
import javax.swing.JOptionPane;

public class MedicamentosFuncion {
    public MedicamentosFuncion(Medicamentos array[]) {
        
        array[0] = new MedicamentosFuncion("Aspirina");
        
        
        while (true) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, "(1) Mostrar medicamentos\n(2) Agregar medicamento\n(3) Salir"));
            
            if (option == 1) {
                mostrarMedicamentos(array);
            } else if(option == 2) {
                agregarMedicamentos(array);
            } else if (option == 3) {
                break;
            }    
        }
    }
    
    public void agregarMedicamentos(Medicamentos array[]) { 
        int index = array.length - 1;
        int append_index = 0;
        for (int i=index; i>=0; i--) { 
                
                append_index = index+1;
                    array[append_index].setNombre(JOptionPane.showInputDialog(null, "Ingrese un medicamento: "));
                array[append_index].setCategoria(JOptionPane.showInputDialog(null,"Ingrese la categoria del medicamento ingresado:"
                    + "\nVacuna \nAntibiotico \nAnalgesico \n->"));
                    array[append_index].setFecha(JOptionPane.showInputDialog(null, "Ingrese la fecha del medicamento ingresado: "));
                    array[append_index].setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del medicamento ingresado: ")));
                    
                break;
            }
        }

    private void mostrarMedicamentos(Medicamentos[] array) {
        String list = "";
        for (int i=0; i<array.length; i++) {
            list += array[i].getNombre()+array[i].getCategoria()+array[i].getFecha()+array[i].getPrecio+ "\n";
            JOptionPane.showMessageDialog(null, list);
        }
    }
}
   
    
    