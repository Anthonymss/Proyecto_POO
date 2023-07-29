package Controlador;
import Conexion.Conexion;
import Producto.Categoria;
import Producto.Producto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ControladorProductos extends ControladorBase<Producto>{
    public Connection getConexion() {
        return conexion;
    }
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    @Override
    public PreparedStatement PSInsertar(Producto producto) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        PreparedStatement statement = null;
        if (conexion != null) {
            try{
        statement = getConexion().prepareStatement("SELECT idcat FROM Categoria WHERE nomcat = ?");
        statement.setString(1, producto.getNombreCat());
         rs = statement.executeQuery();
        int idcat = 0;
        if (rs.next()) {
            idcat = rs.getInt("idcat");
        } else {
            System.out.println("No se encontro ninguna categoría con el nombre especificado.");
        }
        ps = getConexion().prepareStatement("INSERT INTO Productos (serie, id_cat, nompro, despro, precio, stock) VALUES (?, ?, ?, ?, ?, ?)");
        ps.setInt(1, producto.getNumeroSerie());
        ps.setInt(2, idcat);
        ps.setString(3, producto.getNombre());
        ps.setString(4, producto.getDescripcion());
        ps.setDouble(5, producto.getPrecio());
        ps.setInt(6, producto.getStock());  
        } catch (SQLException e) {
            System.err.println("Error al modificar el registro en la tabla Productos: " + e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
        } else {
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
    }
    
    @Override
    public PreparedStatement PSModificar(Producto producto) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion(); 
        PreparedStatement statement = null;
        if (conexion != null) {
            try{
        statement = conexion.prepareStatement("SELECT idcat FROM Categoria WHERE nomcat = ?");
        statement.setString(1, producto.getNombreCat());
        rs = statement.executeQuery();
        int idcat = 0;
        if (rs.next()) {
            idcat = rs.getInt("idcat");
        } else {
            System.out.println("No se encontró ninguna categoría con el nombre especificado.");
        }
        ps = getConexion().prepareStatement("UPDATE Productos SET id_cat=?, nompro=?, despro=?, precio=?, stock=? WHERE serie=?");
        ps.setInt(1, idcat);
        ps.setString(2, producto.getNombre());
        ps.setString(3, producto.getDescripcion());
        ps.setDouble(4, producto.getPrecio());
        ps.setInt(5, producto.getStock());
        ps.setInt(6, producto.getNumeroSerie());
        } catch (SQLException e) {
            System.err.println("Error al modificar el registro en la tabla Productos: " + e.getMessage());
        } finally {
            if (statement != null) {statement.close();}
        }
        }else{
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
    }

    @Override
    public PreparedStatement PSEliminar(int id) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        ps = getConexion().prepareStatement("delete from Productos where serie=?");
                ps.setInt(1, id);
                return ps;
    }

    @Override
    public Producto buscarPorId(int id) {
        Producto producto=null;
        try{
        Conexion con = new Conexion();
        conexion = con.getConexion();
        System.out.println("Conexion exitosa");  
        ps = conexion.prepareStatement("SELECT serie, Categoria.idcat,Categoria.nomcat,Categoria.descat, nompro, precio, stock,despro FROM Productos "
                + "INNER JOIN Categoria ON Productos.id_cat = Categoria.idcat WHERE serie = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto();
                producto.setNumeroSerie(rs.getInt("serie"));
                producto.setCategoria(new Categoria(rs.getInt("idcat"),rs.getString("nomcat"),rs.getString("descat")));
                producto.setNombre(rs.getString("nompro"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setDescripcion(rs.getString("despro"));

            }
        } catch (SQLException e) {
            System.err.println("NOse encontro el IdProcuto(serie): " + e.getMessage());
        } finally {if (rs != null) {
                try {rs.close();} 
                catch (SQLException e) {e.printStackTrace();}}
            if (ps != null) {
                try {ps.close();} 
                catch (SQLException e) {e.printStackTrace();}
            }}
        return producto;
    }

    @Override
    public String getNombreTabla() {
        return "Productos";
    }
    public List<Categoria> consultaCategorias() {
    List<Categoria> listaCategorias = new ArrayList<>();
    try {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        System.out.println("Conexion exitosa");
        ps = conexion.prepareStatement("SELECT * FROM categoria");
        rs = ps.executeQuery();

        while (rs.next()) {
            Categoria categoria = new Categoria();
            categoria.setCodigoC(rs.getInt("idcat"));
            categoria.setNombre(rs.getString("nomcat"));
            categoria.setDescripcion(rs.getString("descat"));
            listaCategorias.add(categoria);
        }
    } catch (SQLException e) {
        System.err.println("Error: " + e);
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e);
        }
    }
    return listaCategorias;
}
}
