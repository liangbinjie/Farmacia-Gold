package farmagold;


public class Ventas {
    private long idFactura;
    private String usuario;
    private long clienteID;
    private String nombreCliente;
    private String compra;
    private int monto;
    
    
    // constructor 
    public Ventas() {
        this.idFactura = 0;
        this.usuario = "";
        this.clienteID = 0;
        this.clienteID = 0;
        this.compra = "";
        this.monto = 0;
    }
    
    
    // Getters and setters 

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public long getClienteID() {
        return clienteID;
    }

    public void setClienteID(long clienteID) {
        this.clienteID = clienteID;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
}
