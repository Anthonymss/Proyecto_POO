package Controlador;
import Conexion.Conexion;
import Persona.Empleado;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
public class ControladorEmpleado2 extends ControladorBase<Empleado>{
    public Connection getConexion() {
        return conexion;
    }
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    @Override
    public PreparedStatement PSInsertar(Empleado empleado) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        if (conexion != null) {
            ps = getConexion().prepareStatement("INSERT INTO Empleados (idempleado, nome, apem, direce, correm, telefono, usuario, pass, TipoEmpleado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, empleado.getId());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getApep());
            ps.setString(4, empleado.getDirec());
            ps.setString(5, empleado.getCorreo());
            ps.setInt(6, empleado.getTelefono());
            ps.setString(7, empleado.getUsuario());
            ps.setString(8, empleado.getContraseña());
            ps.setString(9, empleado.getTipoempleado());
        } else {
            System.err.println("No se estableció la conexion a la base de datos");
        }
        return ps;
    }

    @Override
    public PreparedStatement PSModificar(Empleado empleado) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
        if (conexion != null) {
        ps = getConexion().prepareStatement(
            "UPDATE Empleados SET nome=?, apem=?, direce=?, correm=?, telefono=?,usuario=?,pass=?,TipoEmpleado=? WHERE idempleado=?");
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApep());
            ps.setString(3, empleado.getDirec());
            ps.setString(4, empleado.getCorreo());
            ps.setInt(5, empleado.getTelefono());
            ps.setString(6, empleado.getUsuario());
            ps.setString(7, empleado.getContraseña());
            ps.setString(8, empleado.getTipoempleado());
            ps.setInt(9, empleado.getId());
        } else {
            System.err.println("No se establecio la conexion a la base de datos");
        }
        return ps;
    }

    @Override
    public PreparedStatement PSEliminar(int id) throws SQLException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
         ps = getConexion().prepareStatement("delete from Empleados where idempleado=?");
                ps.setInt(1, id);
                return ps; 
    }

    @Override
    public Empleado buscarPorId(int id) {
        Empleado empleado=null;
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            ps = conexion.prepareStatement("SELECT idempleado, nome, apem, direce, correm, telefono, usuario, pass,TipoEmpleado FROM Empleados WHERE idempleado = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                empleado=new Empleado();
                empleado.setId(rs.getInt("idempleado"));
                empleado.setNombre(rs.getString("nome"));
                empleado.setApep(rs.getString("apem"));
                empleado.setDirec(rs.getString("direce"));
                empleado.setCorreo(rs.getString("correm"));
                empleado.setTelefono(rs.getInt("telefono"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setContraseña(rs.getString("pass"));
                empleado.setTipoempleado(rs.getString("TipoEmpleado"));
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
        return empleado;
    }

    @Override
    public String getNombreTabla() {
        return "Empleados";
    }
    
    
}
