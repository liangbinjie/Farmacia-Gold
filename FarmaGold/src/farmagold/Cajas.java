package farmagold;
public class Cajas {
    private String cliente;
    private float ingreso;

    
    // construvtor
    public Cajas() {
        this.cliente = "";
        this.ingreso = 0;
}
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }

    public Cajas(String cliente, float ingreso) {
        this.cliente = cliente;
        this.ingreso = ingreso;
        
    }

    public float getIngresos() {
        return ingreso;
    }

    public void setIngresos(float ingresos) {
        this.ingreso= ingresos;
    }
    
}
