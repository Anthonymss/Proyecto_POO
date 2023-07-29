package Controlador;
import Conexion.Conexion;
import Persona.Empleado;
import Vista.FAutenticacion;
import Vista.FMenuAdmin;
import Vista.FMenuEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorIngreso {
    private boolean valido;
    public boolean isValido() {
        return valido;}
    private List<Object> resultado(String sql) throws SQLException {
    Connection conexion = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
    Conexion con = new Conexion();
    conexion = con.getConexion();
    System.out.println("Conexion exitosa");
    List<Object> retorno = new ArrayList<>();
    con.conectar();
    ps = conexion.prepareStatement(sql);
    rs = ps.executeQuery();
    if (rs.next()){
        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
            retorno.add(rs.getObject(i));
        }
    }
    return retorno;
    } finally {
        if (rs != null) {rs.close();}
        if (ps != null){ps.close();}
        if (conexion != null) {conexion.close();}
    }
}
    public boolean validarUsusario(String usuario, String contrasena) throws SQLException {  
        List<Object> lista = resultado(String.format("SELECT TipoEmpleado,idempleado FROM Empleados WHERE usuario='%s' AND pass='%s'", usuario, contrasena));
        Empleado empleado = new Empleado();
        if (lista.size() > 0) {
            String tipoEmpleado = (String) lista.get(0);
            int idempleado = (int) lista.get(1);
            empleado.setId(idempleado);
            if (tipoEmpleado.equalsIgnoreCase("Empleado")) {
                empleado.setTipoempleado("Empleado");
                new FMenuEmpleado().setVisible(true);
            } else {
                empleado.setTipoempleado("Administrador");
                new FMenuAdmin().setVisible(true);
            }
            valido = true;
            System.out.println("TIPO: " + empleado.getTipoempleado() + " ID: " + idempleado);
            ActualizarEstado(empleado.getId());
        } else {
            valido = false;
        }
        return valido;
    }
    public void ActualizarEstado(int idempleado) {
        PreparedStatement ps = null;
        Connection conexion = null;
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            System.out.println("USUARIO EN LINEA : " + idempleado);
            ps = conexion.prepareStatement("update Empleados set Estado=1 where idempleado=?");
            ps.setInt(1, idempleado);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Error: " + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }
    }
    public void apagarEstados() {
        try (Connection conexion = new Conexion().getConexion();
            PreparedStatement ps = conexion.prepareStatement("UPDATE Empleados SET Estado = 0")) {
            System.out.println("Conexion exitosa");
            ps.executeUpdate();
            System.out.println("Estados de empleados apagados correctamente.");
        } catch (Exception e) {
            System.err.println("Error al apagar estados de empleados: " + e.getMessage());
        }
    }
    public static String UsuarioActivo() {
        String tipoempleado = null;
        PreparedStatement ps = null;
        Connection conexion = null;
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            ps = conexion.prepareStatement("select TipoEmpleado from Empleados where Estado=1");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoempleado = (rs.getString("TipoEmpleado"));
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }
        return tipoempleado;
    }
    public static String DatosEmpleado() {
    String nombre = null, apellido = null;
    try (Connection conexion = new Conexion().getConexion();
         PreparedStatement ps = conexion.prepareStatement("SELECT nome, apem FROM Empleados WHERE Estado = 1");
         ResultSet rs = ps.executeQuery()) {
        if (rs.next()) {
            nombre = rs.getString("nome");
            apellido = rs.getString("apem");
            System.out.println("Usuario: "+nombre+" "+apellido);
        }
        
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
    return nombre + " " + apellido;
}

}
