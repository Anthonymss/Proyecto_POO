package Producto;


public class ProductoNUEVOS extends Producto{
    int cantidad;
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public ProductoNUEVOS() {
    }

    public ProductoNUEVOS(int NumeroSerie, Categoria categoria, String Nombre, String Descripcion, double Precio, int Stock) {
        super(NumeroSerie, categoria, Nombre, Descripcion, Precio, Stock);
    }

    public ProductoNUEVOS(int NumeroSerie, Categoria categoria, String nombreCat, String Nombre, String Descripcion, double Precio, int Stock) {
        super(NumeroSerie, categoria, nombreCat, Nombre, Descripcion, Precio, Stock);
    }
    @Override
    public double igvPorducto() {
        double igv=0.0;
        igv=getPrecio()*getCantidad()*18/100;
        return igv;  
    }
    @Override
    public double SubtotalProducto(double precio, int cantidad) {
        setPrecio(precio);
        setCantidad(cantidad);
        double subtotal=getPrecio()*getCantidad()+igvPorducto();
        return subtotal;
    }
}
