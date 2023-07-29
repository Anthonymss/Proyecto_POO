package Producto;

import static Interfaz.Idescuentable.OperacionM;
import java.time.LocalDate;

public class Producto {
    public Producto() {
    }
    private int NumeroSerie;
    private Categoria categoria;
    private String nombreCat;
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private int Stock;


    public Producto(int NumeroSerie, Categoria categoria, String Nombre, String Descripcion, double Precio, int Stock) {
        this.NumeroSerie = NumeroSerie;
        this.categoria = categoria;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
    }
    //prueba Beta

    public Producto(int NumeroSerie, Categoria categoria, String nombreCat, String Nombre, String Descripcion, double Precio, int Stock) {
        this.NumeroSerie = NumeroSerie;
        this.categoria = categoria;
        this.nombreCat = nombreCat;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
    }
    

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
    
    //fin prueba beta
    public int getNumeroSerie() {return NumeroSerie;}
    public void setNumeroSerie(int NumeroSerie) {this.NumeroSerie = NumeroSerie;}
    public Categoria getCategoria() {return categoria;}
    public void setCategoria(Categoria categoria) {this.categoria = categoria;}
    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    public String getDescripcion() {return Descripcion;}
    public void setDescripcion(String Descripcion) {this.Descripcion = Descripcion;}
    public double getPrecio() {return Precio;}
    public void setPrecio(double Precio) {this.Precio = Precio;}
    public int getStock() {return Stock;}
    public void setStock(int Stock) {this.Stock = Stock;}
    public double SubtotalProducto(double precio ,int cantidad){
        double subtotal=0;
        return subtotal;
    }

    public double igvPorducto(){
    double igv=0.0;
    return igv;
    }
    public String diaSemana(){
    LocalDate fechaActual = LocalDate.now();
    String diaSemana = fechaActual.getDayOfWeek().name();
    System.out.println("fecha"+fechaActual+" dia "+diaSemana);
    return diaSemana;
    }
        public Double apply(Double t, Integer u) {
        return OperacionM.apply(t, u);
    }
}