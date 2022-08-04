package farmagold;
import javax.swing.*;

public class FuncionesVentas {
    
    // constructor
    public FuncionesVentas(Empleados listaEmpleados[], Clientes listaClientes[]){
        vender(listaEmpleados, listaClientes);
    }
    // funciones
    
    public void vender(Empleados listaEmpleados[], Clientes listaClientes[]){
        // iniciamos sesion
        // preguntamos el id del cliente, busca el nombre del cliente
        // preguntamos que quiere comprar
        // buscamos en la base de datos si esta disponible
        FuncionEmpleados empleado = new FuncionEmpleados();
        empleado.iniciarSesion(listaEmpleados);
        
        
    }
}
