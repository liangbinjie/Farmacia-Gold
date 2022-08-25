package farmagold;
public class Casas {
    private String nombre;
    private String paisOrigen;
    private boolean active;

    
    // constructor
    public Casas(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.active = true;
    }
    
    public Casas(){
        this.nombre="";
        this.paisOrigen="";
        this.active = false;
        
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
