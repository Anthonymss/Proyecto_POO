package Venta;

import java.time.LocalDateTime;
public class Venta {
    public Venta() {
    }
    private int cliente;
    private int idEmpleado;
    private int nroVenta;
    public Venta(int cliente, int idEmpleado, int nroVenta, LocalDateTime fecha) {
        this.cliente = cliente;
        this.idEmpleado = idEmpleado;
        this.nroVenta = nroVenta;
    }
        public int getCliente() {
        return cliente;
    }
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }
}