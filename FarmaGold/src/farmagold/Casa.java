package farmagold;
public class Casa {
    private String nombre;
    private String pais;
    
    
    public Casa(){
       this.nombre="";
       this.pais="";
       
    }
    
    public Casa(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        
    }

    Casa(String almacen_de_Salud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}