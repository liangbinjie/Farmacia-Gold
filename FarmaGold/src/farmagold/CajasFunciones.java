package farmagold;
import javax.swing.JOptionPane;
public class CajasFunciones {
   private Cajas caja[]=new Cajas[5];
   private int opcion;
   private double suma;
   
   
   public void mostrarMenu(){
        CajasFunciones cf=new CajasFunciones(); 
      while(opcion!=3){
         opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   ***CATALOGO DE CASAS FABRICANTES***
                                                                   
                                                                   1. Llenar Informacion
                                                                   2. Mostrar Informacion
                                                                   3. Salir
                                                                   
                                                                   Digite su opcion: """));
                         
         switch(opcion){
             case 1 -> {
                cf.predefinirCajas();
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
   
   public void predefinirCajas(){
       caja[0]=new Cajas("Juan",100);
       caja[1]=new Cajas("Maria",200);
   }
   
   public void llenarArreglo(){
        int x;
        for(x=2;x<5;x++){
            Cajas c=new Cajas();
            
            c.setCliente(JOptionPane.showInputDialog(null,"Digite el nombre del cliente: "));
            c.setIngreso(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el ingreso economico realizado por el cliente: ")));
            caja[x]=c;
            
        }
    }
   public void sumarIngresos(){
        int x;
        suma=0;
        for(x=0;x<caja.length;x++){
            suma=suma+caja[x].getIngreso();
        }
        JOptionPane.showMessageDialog(null, "La suma de los costos seria: \n"+suma);
   }
   public void mostrarArreglo(){
       int x;
        String s="";
        for(x=0;x<5;x++){
            s=s+caja[x].getCliente()+" "+caja[x].getIngreso()+"\n";
            
        }
        JOptionPane.showMessageDialog(null,"Los datos son: \n"+s);
    }
   }

