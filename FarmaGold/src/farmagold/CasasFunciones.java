package farmagold;
import javax.swing.JOptionPane;
public class CasasFunciones {
    
   private Casas casa[]=new Casas[5];
   private int opcion;
   
   
   public void mostrarMenu(){
        CasasFunciones cf=new CasasFunciones(); 
      while(opcion!=3){
         opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   ***CATALOGO DE CASAS FABRICANTES***
                                                                   
                                                                   1. Llenar Informacion
                                                                   2. Mostrar Informacion
                                                                   3. Salir
                                                                   
                                                                   Digite su opcion: """));
                         
         switch(opcion){
             case 1 -> {
                cf.predefinirCasas();
                cf.llenarArreglo();
             }
             case 2 -> {
                cf.mostrarArreglo();
             }
             case 3 -> {
                System.exit(0);
             }
             default -> {
                JOptionPane.showMessageDialog(null,
                        "OPCION INCORRECTA!");
             }
         }
      }
   }
      
      
public void predefinirCasas(){
        casa[0]=new Casas("Medicantrix","Mexico",32);
        casa[1]=new Casas("Vaccined","Inglaterra",16);
        
    }
    
    public void llenarArreglo(){
        int x;
        for(x=2;x<5;x++){
            Casas cf=new Casas();
            
            cf.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre de la casa fabricante: "));
            cf.setPaisOrigen(JOptionPane.showInputDialog(null, "Digite el pais de origen de la casa fabricante: "));
            cf.setEdadAntiguedad(Long.parseLong(JOptionPane.showInputDialog(null, "Digite la edad de antiguedad de la casa fabricante: ")));
            casa[x]=cf;
            
        }
    }
    public void mostrarArreglo(){
        int x;
        String s="";
        for(x=0;x<5;x++){
            s=s+casa[x].getNombre()+" "+casa[x].getPaisOrigen()+" "+casa[x].getEdadAntiguedad()+"\n";
            
        }
        JOptionPane.showMessageDialog(null,"Los datos de las casas fabricantes son: \n"+s);
    }
}
