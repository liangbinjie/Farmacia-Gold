package farmagold;
import javax.swing.JOptionPane;
public class MedicamentosFunciones {
   private Medicamentos medicamentos[]=new Medicamentos[5];
   private int opcion;
   
   
   public void mostrarMenu(){
        MedicamentosFunciones mf=new MedicamentosFunciones(); 
      while(opcion!=3){
         opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   ***CATALOGO DE MEDICAMENTOS***
                                                                   
                                                                   1. Llenar Informacion
                                                                   2. Mostrar Informacion
                                                                   3. Salir
                                                                   
                                                                   Digite su opcion: """));
                         
         switch(opcion){
             case 1 -> {
                mf.predefinirMedicamentos();
                mf.llenarArreglo();
             }
             case 2 -> {
                mf.mostrarArreglo();
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
      
      
public void predefinirMedicamentos(){
        medicamentos[0]=new Medicamentos("PepoBismol","Analgesico","12/12/12",100);
        medicamentos[1]=new Medicamentos("Isoface","Otro","12/12/23",160);
        
    }
    
    public void llenarArreglo(){
        int x;
        for(x=2;x<5;x++){
            
            Medicamentos mf=new Medicamentos();
            
            mf.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del medicamento: "));
            mf.setCategoria(JOptionPane.showInputDialog(null, "Digite la categoria del medicamento;\n-Analgesico\n-Antibiotico\nOtro\n->"));
            mf.setFecha(JOptionPane.showInputDialog(null, "Digite la fecha de caducacion del medicamento: "));
            mf.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del medicamento: ")));
            medicamentos[x]=mf;
            
        }
    }
    public void mostrarArreglo(){
        int x;
        String s="";
        for(x=0;x<5;x++){
            s=s+medicamentos[x].getNombre()+" "+medicamentos[x].getCategoria()+" "+medicamentos[x].getFecha()+medicamentos[x].getPrecio()+"\n";
            
        }
        JOptionPane.showMessageDialog(null,"Los datos de las casas fabricantes son: \n"+s);
    }
}

