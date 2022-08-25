package farmagold;


public class Ventas {
    private long idFactura;
    private long clienteID;
    private String nombreCliente;
    private String compra;
    private double monto;
    private boolean active;
    
    
    // constructor 
    public Ventas() {
        this.idFactura = 0;
        this.clienteID = 0;
        this.nombreCliente = "";
        this.compra = "";
        this.monto = 0;
        this.active = false;
    }
    
    public Ventas(long idFactura, long clienteID, String nombreCliente, String compra, int monto){
        this.idFactura = idFactura;
        this.clienteID = clienteID;
        this.nombreCliente = nombreCliente;
        this.compra = compra;
        this.monto = monto;
        this.active = true;
    }
    
    
    // Introducimos los getters y los setters del constructor de ventas 

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    

    
    
}
