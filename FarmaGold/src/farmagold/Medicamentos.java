package farmagold;

public class Medicamentos {
    
    private String nombre;
    private String categoria;
    private String fecha;
    private int precio;
    
    public Medicamentos(String nombre, String categoria, String fecha, int precio) {
        this.nombre = "";
        this.categoria = "";
        this.fecha = "";
        this.precio = 0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }  
}