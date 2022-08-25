package farmagold;

public class Medicamentos {
    
    private String nombre;
    private String codigo;
    private String categoria;
    private int precio;
    private int cantidad;
    
    public Medicamentos() {
        this.nombre = "";
        this.codigo = "";
        this.categoria = "";
        this.precio = 0;
        this.cantidad = 0;
    }
    
    public Medicamentos(String nombre, String codigo, String categoria, int precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }  

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}