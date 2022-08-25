package farmagold;
public class Casas {
    private String nombre;
    private String paisOrigen;

    
    // constructor
    public Casas(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }
    
    public Casas(){
        this.nombre="";
        this.paisOrigen="";
        
    }
    
    
    // Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
