package farmagold;


public class Clientes {
    
    public enum Estados {
        Activo,
        Inactivo
    }
    
    private long identificacion;
    private String nombre;
    private String apellidos;
    private String email;
    private long telefono;
    private Estados estado;
    private boolean active;

    // Constructores
    public Clientes() {
        this.identificacion = 0;
        this.nombre = "";
        this.apellidos = "";
        this.email = "";
        this.telefono = 0;
        this.estado = Estados.Inactivo;
        this.active = false;
    }
    
    public Clientes(long identificacion, String nombre, String apellidos, String email, long telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.estado = Estados.Activo;
        this.active = true;
    }


    // Getters and setters

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}




































































































