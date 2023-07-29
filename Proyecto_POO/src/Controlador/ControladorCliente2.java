package Controlador;
import Conexion.Conexion;
import Persona.Cliente;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;


public class ControladorCliente2 extends ControladorBase<Cliente>{
    public Connection getConexion() {
        return conexion;
    }
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    @Override
    public PreparedStatement PSInsertar(Cliente cliente) throws SQLException {
            Conexion con = new Conexion();
            conexion = con.getConexion();
        if (conexion != null) {
            ps = getConexion().prepareStatement(
                    "INSERT INTO Clientes (idcliente, nomc, Apec, direcc, distrito, correoc, celular) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(cliente.getDNI()));
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getDistrito());
            ps.setString(6, cliente.getCorreo());
            ps.setInt(7, Integer.parseInt(cliente.getTelefono()));
            
        } else {
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
        
    }

    @Override
    public PreparedStatement PSModificar(Cliente cliente) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        if (conexion != null) {
        ps = getConexion().prepareStatement(
                "UPDATE Clientes SET nomc=?, Apec=?, direcc=?, distrito=?, correoc=?, celular=? WHERE idcliente=?");
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getApellidos());
        ps.setString(3, cliente.getDireccion());
        ps.setString(4, cliente.getDistrito());
        ps.setString(5, cliente.getCorreo());
        ps.setInt(6, Integer.parseInt(cliente.getTelefono()));
        ps.setInt(7, Integer.parseInt(cliente.getDNI()));
        } else {
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
    }

    @Override
    public PreparedStatement PSEliminar(int id) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
         ps = getConexion().prepareStatement("DELETE FROM Clientes WHERE idcliente=?");
                ps.setInt(1, id);
                return ps;    
    }

    @Override
    public String getNombreTabla() {
        return "Clientes";
    }

    @Override
    public Cliente buscarPorId(int id) {
        Cliente cliente = null;
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            ps = conexion.prepareStatement("select idcliente, nomc, Apec, direcc, distrito,correoc, celular from Clientes where idcliente = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setDNI(rs.getString("idcliente"));
                cliente.setNombre(rs.getString("nomc"));
                cliente.setApellidos(rs.getString("Apec"));
                cliente.setDireccion(rs.getString("direcc"));
                cliente.setDistrito(rs.getString("distrito"));
                cliente.setCorreo(rs.getString("correoc"));
                cliente.setTelefono(rs.getString("celular"));
            }
        } catch (SQLException e) {
            System.err.println("NOse encontro el Id: " + e.getMessage());
        } finally {if (rs != null) {
                try {rs.close();} 
                catch (SQLException e) {e.printStackTrace();}}
            if (ps != null) {
                try {ps.close();} 
                catch (SQLException e) {e.printStackTrace();}
            }}
        return cliente;
    }
    

}

