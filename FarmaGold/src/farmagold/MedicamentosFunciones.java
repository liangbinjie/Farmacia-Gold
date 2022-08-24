package farmagold;
import javax.swing.JOptionPane;
public class MedicamentosFunciones {
    // constructor
    
    public MedicamentosFunciones(Medicamentos listaMedicamentos[]) {
        mostrarMenu(listaMedicamentos);
    }

    
    public void mostrarMenu(Medicamentos listaMedicamentos[]){
        boolean running = true;
          while(running){
             int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                       **CATALOGO DE MEDICAMENTOS**

                                                                       1. Llenar Informacion
                                                                       2. Mostrar Informacion
                                                                       3. Salir

                                                                       Digite su opcion: """));

             switch(opcion){
                 case 1 -> {
                    agregarMedicamento(listaMedicamentos);
                 }
                 case 2 -> {
                    mostrarMedicamentos(listaMedicamentos);
                 }
                 case 3 -> {
                    running = false;
                 }
                 default -> {
                    JOptionPane.showMessageDialog(null,
                            "OPCION INCORRECTA!");
                 }
             }
          }
       }

    public void agregarMedicamento(Medicamentos listaMedicamentos[]) {
        int indice = listaMedicamentos.length - 1;
        int indice_agregar = 0;
        for(int x=indice;x>=0;x--){
            if (listaMedicamentos[x].getNombre() == "") {
                indice--;
            } else {
                indice_agregar = indice + 1;
                listaMedicamentos[indice_agregar].setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del medicamento: "));
                listaMedicamentos[indice_agregar].setCategoria(JOptionPane.showInputDialog(null, "Digite la categoria del medicamento"));
                listaMedicamentos[indice_agregar].setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del medicamento: ")));
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Se agrego el medicamento: " + listaMedicamentos[indice_agregar].getNombre());
    }


    public void mostrarMedicamentos(Medicamentos listaMedicamentos[]){
        for(int x=0;x<listaMedicamentos.length;x++){
            String s="";
            if (listaMedicamentos[x].getNombre() != "") {
                s += "Nombre medicamento " + listaMedicamentos[x].getNombre() + "\nCategoria: " + listaMedicamentos[x].getCategoria() + "\nPrecio: " + listaMedicamentos[x].getPrecio()
                        + "\nCantidad disponible: " + listaMedicamentos[x].getCantidad();
                JOptionPane.showMessageDialog(null,s);
            } else {
                break;
            }
        }
    }
}