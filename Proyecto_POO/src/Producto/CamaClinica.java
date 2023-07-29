package Producto;
import Interfaz.Idescuentable;
import java.util.*;
public class CamaClinica extends Producto implements Idescuentable{
    int cantidad;
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public CamaClinica() {
    }

    public CamaClinica(int NumeroSerie, Categoria categoria, String Nombre, String Descripcion, double Precio, int Stock) {
        super(NumeroSerie, categoria, Nombre, Descripcion, Precio, Stock);
    }

    public CamaClinica(int NumeroSerie, Categoria categoria, String nombreCat, String Nombre, String Descripcion, double Precio, int Stock) {
        super(NumeroSerie, categoria, nombreCat, Nombre, Descripcion, Precio, Stock);
    }
    @Override
    public double igvPorducto() {
        double igv=0.0;
        igv=apply(getPrecio(),getCantidad())*18/100;
        return igv;  
    }
    @Override
    public double SubtotalProducto(double precio, int cantidad) {
        setPrecio(precio);
        setCantidad(cantidad);
        double subtotal=apply(getPrecio(),getCantidad())+igvPorducto()-descuentoPordia(getPrecio(), getCantidad());
        return subtotal;
    }
    @Override
    public double descuentoPordia(double precio, int cantidad){
        double descuentoPordia=0.0;
        if(diaSemana().equalsIgnoreCase("Tuesday"))
        {
        descuentoPordia= apply(getPrecio(),getCantidad())*(0.04);
        }
       return descuentoPordia;
    }
    
}