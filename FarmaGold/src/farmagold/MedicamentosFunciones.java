package farmagold;
import javax.swing.JOptionPane;
public class MedicamentosFunciones {
    // constructor
    
    public MedicamentosFunciones(Medicamentos listaMedicamentos[], Casas listaCasas[]) {
        mostrarMenu(listaMedicamentos, listaCasas);
    }

    
    public void mostrarMenu(Medicamentos listaMedicamentos[], Casas listaCasas[]){
        boolean running = true;
          while(running){
             int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                       ***CATALOGO DE MEDICAMENTOS***

                                                                       1. Agregar medicamento
                                                                       2. Mostrar Medicamentos
                                                                       3. Modificar informacion
                                                                       4. Salir

                                                                       Digite su opcion: """));

             switch(opcion){
                 case 1 -> {
                    agregarMedicamento(listaMedicamentos, listaCasas);
                 }
                 case 2 -> {
                    mostrarMedicamentos(listaMedicamentos);
                 }
                 
                 case 3 -> {
                     Modificadores modifiers = new Modificadores();
                     modifiers.modificarMedicinas(listaMedicamentos);
                 }
                 case 4 -> {
                    running = false;
                 }
                 default -> {
                    JOptionPane.showMessageDialog(null,
                            "OPCION INCORRECTA!");
                 }
             }
          }
       }

    public void agregarMedicamento(Medicamentos listaMedicamentos[], Casas listaCasas[]) {
        int indice = listaMedicamentos.length - 1;
        int indice_agregar = 0;
        for(int x=indice;x>=0;x--){
            if (listaMedicamentos[x].getNombre() == "") {
                indice--;
            } else {
                indice_agregar = indice + 1;
                // revisar si la casa existe
                String casa = JOptionPane.showInputDialog(null, "Ingrese el nombre de la casa farmaceutica del medicamento");
                if (verificarCasa(listaCasas, casa) == true) {
                    listaMedicamentos[indice_agregar].setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del medicamento: "));
                    listaMedicamentos[indice_agregar].setCodigo(JOptionPane.showInputDialog(null, "Digite el codigo del medicamento: "));
                    listaMedicamentos[indice_agregar].setCategoria(JOptionPane.showInputDialog(null, "Digite la categoria del medicamento"));
                    listaMedicamentos[indice_agregar].setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad del medicamento: ")));
                    listaMedicamentos[indice_agregar].setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del medicamento: ")));
                    JOptionPane.showMessageDialog(null, "Se agrego el medicamento: " + listaMedicamentos[indice_agregar].getNombre());
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Casa farmaceutica no registrada");
                    break;
                }
                
            }
        }

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
    
    public String buscarMedicamento(String medicamento, Medicamentos listaMedicamentos[]) {
        String nombre = "";
        for (int i=0; i<listaMedicamentos.length; i++) {
            if (listaMedicamentos[i].getCodigo().equals(medicamento) || listaMedicamentos[i].getNombre().equals(medicamento)) {
                nombre = listaMedicamentos[i].getNombre();
            }
        }
        
        return nombre;
    }
    
    public boolean verificarCasa(Casas listaCasas[], String nombre) {
        boolean verificado = false;
        for (int i=0; i<listaCasas.length; i++) {
            if (listaCasas[i].getNombre().equals(nombre)) {
                verificado = true;
            }
        }
        
        return verificado;
    }
}

