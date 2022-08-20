package farmagold;
import javax.swing.JOptionPane;
public class MenuCasaFabricante {
   private int opcion;
   
   public void mostrarMenu(){
      CasasFunciones r=new CasasFunciones(); 
      while(opcion!=3){
         opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   ***CATALOGO DE CASAS FABRICANTES***
                                                                   
                                                                   1. Llenar Informacion
                                                                   2. Mostrar Informacion
                                                                   3. Consultar Informacion
                                                                   4. Salir
                                                                   
                                                                   Digite su opcion:"""));
                         
         switch(opcion){
             case 1:{
                r.llenarArreglo();
                break;
             }
             case 2:{
                r.mostrarArreglo();
                break;
             }
             case 3:{
                r.consultarCasa();
                break;
             }
             case 4:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,
                        "OPCION INCORRECTA!");
             }
         }
      }
   }
}
