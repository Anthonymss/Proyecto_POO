package Controlador;
import Conexion.Conexion;
import Producto.Categoria;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ControladorCategoria2 extends ControladorBase<Categoria>{
    public Connection getConexion() {
        return conexion;
    }
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public PreparedStatement PSInsertar(Categoria categoria) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        if (conexion != null) {
            ps = getConexion().prepareStatement("insert into Categoria (idcat, nomcat, descat) values (?, ?, ?)");
            ps.setInt(1, categoria.getCodigoC());
            ps.setString(2, categoria.getNombre());
            ps.setString(3, categoria.getDescripcion());
        } else {
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
    }

    @Override
    public PreparedStatement PSModificar(Categoria categoria) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        if (conexion != null) {
        ps = getConexion().prepareStatement(
        "update Categoria set nomcat=?,descat=? where idcat=?");
            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getCodigoC());
        } else {
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
    }

    @Override
    public PreparedStatement PSEliminar(int id) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        ps = getConexion().prepareStatement("delete from Categoria where idcat=?");
                ps.setInt(1, id);
                return ps; 
    }

    @Override
    public Categoria buscarPorId(int id) {
            Categoria categoria=null;
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            ps = conexion.prepareStatement("select idcat,nomcat,descat from Categoria where idcat=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                categoria= new Categoria();
                categoria.setCodigoC(rs.getInt("idcat"));
                categoria.setNombre(rs.getString("nomcat"));
                categoria.setDescripcion(rs.getString("descat"));}
        } catch (SQLException e) {
            System.err.println("NOse encontro el Id: " + e.getMessage());
        } finally {if (rs != null) {
                try {rs.close();} 
                catch (SQLException e) {e.printStackTrace();}}
            if (ps != null) {
                try {ps.close();} 
                catch (SQLException e) {e.printStackTrace();}
            }}
        return categoria;
    }

    @Override
    public String getNombreTabla() {
    return "Categoria";}
    }

    
    
