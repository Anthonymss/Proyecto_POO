package Controlador;
import Conexion.Conexion;
import Producto.Andadores;
import Producto.CamaClinica;
import Producto.Camillas;
import Producto.Producto;
import Producto.ProductoNUEVOS;
import Producto.Rehabilitacion;
import Producto.SillaRuedas;
import Venta.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ControladorRegistrarVenta { 
    public static int RegistrarVenta(Venta venta) {
    PreparedStatement ps = null;
    Connection conexion = null;
    int idVentaGenerado=0;
    try {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        System.out.println("Conexion exitosa");
        String query = "INSERT INTO Ventas (cliente, idempleado, Nroventa, fecha) VALUES (?, ?, ?, datetime('now'))";
        ps = conexion.prepareStatement(query);
        ps.setInt(1, venta.getCliente());
        ps.setInt(2, venta.getIdEmpleado());
        ps.setInt(3, venta.getNroVenta());
        ps.executeUpdate();
        ResultSet generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) {
            idVentaGenerado = generatedKeys.getInt(1);
            System.out.println("Se genero la venta con ID: " + idVentaGenerado);
        }

        JOptionPane.showMessageDialog(null, "Se Realizo la venta correctamente.");
    } catch (Exception e) {
        System.err.println("Error: " + e);
    } finally {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        return idVentaGenerado;
}
    public static boolean insertarProductosEnLaVenta(int idventa,int serie, int cantidad) {
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        ResultSet rs=null;
        Connection conexion = null;
        double igv=0.0;
        double subtotal=0.0;
        int TIPOCAT=0;
        double precio=0.0;
        double desc=0.0;
        boolean validacion=false;
    try {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        System.out.println("Conexion exitosa");
        ps1=conexion.prepareStatement("select id_cat,precio from Productos where serie = ?");
        ps1.setInt(1, serie);
        rs = ps1.executeQuery();
        if(rs.next()){
            TIPOCAT= rs.getInt("id_cat");
            precio=rs.getDouble("precio");
            System.out.println("TIPO CATEGORIA IDCAT: "+TIPOCAT+"=============================");
        }
        switch(TIPOCAT){
            case 1:
                Producto camilla=new Camillas();
                subtotal=camilla.SubtotalProducto(precio,cantidad);
                igv=camilla.igvPorducto();
                Camillas camillacasteada=(Camillas) camilla;
                desc=camillacasteada.descuentoPordia(precio, cantidad);
            break;
            case 2:
                Producto andador=new Andadores();
                subtotal=andador.SubtotalProducto(precio,cantidad);
                igv=andador.igvPorducto();
                Andadores andadoresCasteado = (Andadores) andador;
                desc=andadoresCasteado.descuentoPordia(precio,cantidad);
            break;
            case 3:
                Producto cama=new CamaClinica();
                subtotal=cama.SubtotalProducto(precio,cantidad);
                igv=cama.igvPorducto();
                CamaClinica camaC=(CamaClinica)cama;
                desc=camaC.descuentoPordia(precio, cantidad);
            break;
            case 4:
                Producto reah=new Rehabilitacion();
                subtotal=reah.SubtotalProducto(precio,cantidad);
                igv=reah.igvPorducto();
                Rehabilitacion reahC=(Rehabilitacion)reah;
                desc=reahC.descuentoPordia(precio, cantidad);
            break;
            case 6:
                Producto silla=new SillaRuedas();
                subtotal=silla.SubtotalProducto(precio,cantidad);
                igv=silla.igvPorducto();
                SillaRuedas sillac = (SillaRuedas) silla;
                desc=sillac.descuentoPordia(precio,cantidad);
            break;
            default:
                //categoria agregada no definida
                Producto nuevos=new ProductoNUEVOS();
                subtotal=nuevos.SubtotalProducto(precio,cantidad);
                igv=nuevos.igvPorducto();
        }
        ps = conexion.prepareStatement(
            "INSERT INTO PRO_VENTA (idventa, serie, cantidad,igv,subtotal,descuentos) VALUES (?, ?, ?, ?, ?, ?)");
        ps.setInt(1, idventa);
        ps.setInt(2, serie);
        ps.setInt(3, cantidad);
        ps.setDouble(4, igv);
        ps.setDouble(5, subtotal);
        ps.setDouble(6, desc);
        ps.executeUpdate();
        ps.close();
        conexion.close();
        System.out.println("DESCUENTOOOOOO"+desc);
        validacion=true;
    } catch (Exception e) {
        System.err.println("Error: " + e);
    }finally {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        return validacion;
}
    public static void actualizarStock(int serie, int stock) {
        Connection conexion = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            ps1 = conexion.prepareStatement("SELECT stock FROM Productos WHERE serie = ?");
            ps1.setInt(1, serie);
            rs = ps1.executeQuery();
            if (rs.next()) {
                int stockActualizado = rs.getInt("stock") - stock;
                ps = conexion.prepareStatement("UPDATE Productos SET stock = ? WHERE serie = ?");
                ps.setInt(1, stockActualizado);
                ps.setInt(2, serie);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Se actualizo el stock");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (ps1 != null) {
                    ps1.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar los recursos: " + e);
            }
        }
        
    }
    public static int obtenerIdEmpleadoActivo() {
    int idEmpleado = 0;
    Connection conexion = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        System.out.println("Conexion exitosa");
        
        ps = conexion.prepareStatement("SELECT idempleado FROM Empleados WHERE Estado = 1");
        rs = ps.executeQuery();
        
        if (rs.next()) {
            idEmpleado = rs.getInt("idempleado");
        }
    } catch (Exception e) {
        System.err.println("Error: " + e);
    } finally {
        // Cerrar los recursos
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar los recursos: " + e);
        }
    }
    
    return idEmpleado;
}
    public static void ventaTerminada(int idventa) {
    PreparedStatement ps = null;
    PreparedStatement ps1 = null;
    ResultSet rs = null;
    Connection conexion = null;
    double totalIgv = 0;
    double totalPrecio = 0;
    double descT=0.0;
    try {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        System.out.println("Conexion exitosa");

        ps = conexion.prepareStatement("select sum(igv), sum(subtotal), sum(descuentos) from PRO_VENTA where idventa=?");
        ps.setInt(1, idventa);
        rs = ps.executeQuery();

        if (rs.next()) {
            totalIgv = rs.getDouble("sum(igv)");
            totalPrecio = rs.getDouble("sum(subtotal)");
            descT=rs.getDouble("sum(descuentos)");
        }

        ps1 = conexion.prepareStatement("INSERT INTO RegistroVenta (idventa, igv, totalPagar,descuentosTotal) VALUES (?, ?, ?,?)");
        ps1.setInt(1, idventa);
        ps1.setDouble(2, totalIgv);
        ps1.setDouble(3, totalPrecio);
        ps1.setDouble(4, descT);   
        ps1.executeUpdate();

        System.out.println("Registro venta COMPLETADO");
    } catch (Exception e) {
        System.err.println("Error: " + e);
    } finally {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps1 != null) {
            try {
                ps1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
}