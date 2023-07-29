package Producto;
import java.util.*;
public class Categoria {
    public Categoria() {
    }
    private int CodigoC;
    private String Nombre;
    private String Descripcion;

    public Categoria(int CodigoC, String Nombre, String Descripcion) {
        this.CodigoC = CodigoC;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getCodigoC() {
        return CodigoC;
    }

    public void setCodigoC(int CodigoC) {
        this.CodigoC = CodigoC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    

}