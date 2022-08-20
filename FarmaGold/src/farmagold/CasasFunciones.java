package farmagold;
import javax.swing.JOptionPane;
public class CasasFunciones {
   Casas arregloCasa[]=new Casas[4];
   
   public void llenarDatosPredefinidos(){
      arregloCasa[0]=new Casas("Almacen de Salud");
      arregloCasa[1]=new Casas("Farmacia la Granja");
      arregloCasa[2]=new Casas("Las Maldivas");
      arregloCasa[3]=new Casas("Con Salud CS");
      
    }
    
    public void llenarArreglo(){
      int x;
      for(x=1;x<4;x++){
          Casas c=new Casas();
          c.setNombre(JOptionPane.showInputDialog(null,
                  "Digite el nombre de la casa fabricante: "));
          c.setPais(JOptionPane.showInputDialog(null,
                  "Digite el pais de origen de la casa fabricante: "));
          
          arregloCasa[x]=c;
      }
   }
   public void mostrarArreglo(){
      int x;
      String s="";
      for(x=0;x<4;x++){
          s=s+arregloCasa[x].getNombre()+"\n"+
              arregloCasa[x].getPais()+"\n\n";
      }         
      JOptionPane.showMessageDialog(null,
              "La casas fabricantes y sus paises de origen son: \n\n"+s);
      
   }
   public void consultarCasa(){
      int x;
      String nomb;
      nomb=JOptionPane.showInputDialog(null,
              "Digite el nombre de la casa fabricante a buscar:");
      for(x=0;x<4;x++){
          if(nomb.equals(arregloCasa[x].getNombre())){
             arregloCasa[x].setPais(arregloCasa[x].getPais()+5);
             JOptionPane.showMessageDialog(null,
               arregloCasa[x].getNombre()+
               " proviene de "+arregloCasa[x].getPais());
          }
      }
   }
}
