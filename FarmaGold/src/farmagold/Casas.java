package farmagold;
public class Casas {

    public Casas(String nombre, String paisOrigen, long edadAntiguedad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.edadAntiguedad = edadAntiguedad;
    }
    
    private String nombre;
    private String paisOrigen;
    private long edadAntiguedad;
    
    public Casas(){
        this.nombre="";
        this.paisOrigen="";
        this.edadAntiguedad=0;
        
    }

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

    public long getEdadAntiguedad() {
        return edadAntiguedad;
    }

    public void setEdadAntiguedad(long edadAntiguedad) {
        this.edadAntiguedad = edadAntiguedad;
    }
}
