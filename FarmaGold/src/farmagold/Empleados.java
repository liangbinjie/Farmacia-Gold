package farmagold;

public class Empleados {
    
    public enum Estados {
        Activo,
        Inactivo
    }
    
    private long identificacion;
    private String nickname;
    private String password;
    private String nombre;
    private String apellidos;
    private byte edad;
    private String ciudad;
    private String direccion;
    private String email;
    private long telefono;
    private Estados estado;
    private boolean active;

    // Constructors
    public Empleados(long identificacion, String nickname, String password, String nombre, String apellido, byte edad, String ciudad, String direccion, String email, long telefono) {
        this.identificacion = identificacion;
        this.nickname = nickname;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = Estados.Activo;
        this.active = true;
    }

    public Empleados() {
        this.identificacion = 0;
        this.nickname = "";
        this.password = "";
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.ciudad = "";
        this.direccion = "";
        this.email = "";
        this.telefono = 0;
        this.estado = Estados.Inactivo;
        this.active = false;
    }
    
    
    // Getters and setters

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
