package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
public class Conexion {
    private String url;
    private Connection conexion;
    
    public Conexion() throws SQLException{
        url="jdbc:sqlite:VENTAS.db";
    //url="jdbc:sqlite:C:/Users/gonza/Downloads/ProyectoPOO_ver_1.0/sqlitedb/VENTAS";
    //String url ="jdbc:sqlite:C:\\Users\\Anthony_mss\\Desktop\\Taller POO/VENTAS";
    conectar();
        
    }
    public void conectar() {
    try {
        this.conexion = DriverManager.getConnection(url);
        if (!this.conexion.isClosed()) {
            System.out.println("Conectado");
        }
    } catch (SQLException ex) {
        System.err.println("Error al conectar a la base: " + ex.getMessage());
        ex.printStackTrace();
    }
}


    public void cerrar() throws SQLException {
    if (conexion != null && !conexion.isClosed()) {
        conexion.close();
        System.out.println("Conexion cerrada");
    }
}


    public Connection getConexion() {
        return conexion;
    }
    
}
