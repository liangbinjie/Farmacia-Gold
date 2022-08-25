package farmagold;
import javax.swing.JOptionPane;
public class CasasFunciones {
    
    // constructor
    public CasasFunciones(Casas listaCasas[]) {
        mostrarMenu(listaCasas);
    }
   
   public void mostrarMenu(Casas listaCasas[]){
       boolean running = true;
      while(running){

         int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   ***CATALOGO DE CASAS FABRICANTES***
                                                                   
                                                                   1. Agregar Casa farmaceutica
                                                                   2. Mostrar Casas farmaceuticas
                                                                   3. Salir
                                                                   
                                                                   Digite su opcion: """));
                         
         switch(opcion){
             case 1 -> {
                 // agregar
                 agregarCasa(listaCasas);
             }
             case 2 -> {
                 // mostrar
                 mostrarCasas(listaCasas);
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
   
   
   // funciones
   public void agregarCasa(Casas listaCasas[]) {
       int indice = listaCasas.length - 1;
       int indice_agregar = 0;
       
       for (int i = indice; i>=0; i--) {
           if (listaCasas[i].isActive() == false) {
               indice--;
           } else {
                indice_agregar = indice + 1;
                listaCasas[indice_agregar].setNombre(JOptionPane.showInputDialog(null, "Digite el nombre de la casa Farmaceutica a agregar"));
                listaCasas[indice_agregar].setPaisOrigen(JOptionPane.showInputDialog(null, "Digite el pais de origen de la casa farmaceutica"));
                listaCasas[indice_agregar].setActive(true);
           }
       }
   }
   
   public void mostrarCasas(Casas listaCasas[]) {
       for (int i=0; i<listaCasas.length; i++) {
           String s = "";
           
           if (listaCasas[i].isActive() == true ) {
               s += "Nombre de la casa farmaceutica: " + listaCasas[i].getNombre() + "\nPais de origen: " + listaCasas[i].getPaisOrigen();
               JOptionPane.showMessageDialog(null, s);
           }
       }
   }
      
    
}
