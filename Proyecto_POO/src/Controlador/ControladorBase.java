package Controlador;

import Conexion.Conexion;
import Persona.Cliente;
import Persona.Empleado;
import Producto.Categoria;
import Producto.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class ControladorBase<T> {
    protected PreparedStatement ps = null;
    protected Connection conexion = null;
    protected ResultSet rs = null; 
    public abstract PreparedStatement PSInsertar(T objeto) throws SQLException;

    public abstract PreparedStatement PSModificar(T objeto) throws SQLException;

    public abstract PreparedStatement PSEliminar(int id) throws SQLException;
    
    public abstract T buscarPorId(int id);
    
    public void cargarTabla(JTable tabla, String campo,String TipoBusqueda,T objeto) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        String where = "";    
        String Busqueda="";
        //Clientes
        if ( objeto instanceof Cliente){
            switch(TipoBusqueda){
                case"DNI":
                    Busqueda="idcliente";
                    break;
                case"Nombre":
                    Busqueda="nomc";
                    break;
                case"Apellido":
                    Busqueda="Apec";
                    break;
                case"Distrito":
                    Busqueda="distrito";
                    break;                
            }
            if (!"".equals(campo)){
            System.out.println("Tipo busqueda  "+TipoBusqueda);
            where = "where "+Busqueda+" = '" + campo + "'";}
            System.out.println("Consulta "+where);
            try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            ps = conexion.prepareStatement("select idcliente,nomc,Apec,direcc,distrito,correoc,celular from Clientes " + where);
            rs = ps.executeQuery();
            modeloTabla.addColumn("DNI");
            modeloTabla.addColumn("Nombres");
            modeloTabla.addColumn("Apellidos");
            modeloTabla.addColumn("Dirección");
            modeloTabla.addColumn("Distrito");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Celular");
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            int anchos[] = {150, 150, 250, 200, 200, 300, 200};
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila.add(rs.getObject(i + 1));
}              modeloTabla.addRow(fila);}
        } catch (Exception e) {
            System.err.println("Error: " + e);}
            //Productos
        }else if(objeto instanceof Producto){
            if (!"".equals(campo)) {
            if (TipoBusqueda.equalsIgnoreCase("Categoria")){
            Busqueda="Categoria.nomcat";
        }else{
           Busqueda="serie";
        }
            where = "where "+ Busqueda+"='" + campo + "'";}
            
            try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            String query = "SELECT serie, Categoria.nomcat, nompro, precio, stock FROM Productos "
                + "INNER JOIN Categoria ON Productos.id_cat = Categoria.idcat " + where;
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            modeloTabla.addColumn("N°Serie");
            modeloTabla.addColumn("Categoria");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("Stock");

                while (rs.next()) {
            Vector<Object> fila = new Vector<>();
            fila.add(rs.getInt("serie"));
            fila.add(rs.getString("nomcat"));
            fila.add(rs.getString("nompro"));
            fila.add(rs.getDouble("precio"));
            fila.add(rs.getInt("stock"));
            modeloTabla.addRow(fila);
             }
            int[] anchos = { 60, 120, 200, 60, 30};
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        //CATEGORIA
        }else if(objeto instanceof Categoria){
            if (!"".equals(campo)) {
        where = "where idcat='" + campo + "'";}
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("Conexion exitosa");
            ps = conexion.prepareStatement("select idcat,nomcat from Categoria "+where);
            rs = ps.executeQuery();
            modeloTabla.addColumn("Codigo");
            modeloTabla.addColumn("Nombre");
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            
            int anchos [] = {150,150};
            for(int i=0;i<cantidadColumnas;i++){
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while(rs.next()){
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }     
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        //EMPLEADO
        }else if(objeto instanceof Empleado){
            switch (TipoBusqueda) {
                case "Codigo":
                    Busqueda="idempleado";
                    break;
                case "Nombre":
                    Busqueda="nome";
                    break;
                case"Apellido":
                    Busqueda="apem";
                    break;
                case"Tipo":
                    Busqueda="TipoEmpleado";
                    break;
            }
            if (!"".equals(campo)) {
            where = "WHERE "+ Busqueda+" ='" + campo + "'";}
            try {
                Conexion con = new Conexion();
            conexion = con.getConexion();
            ps = conexion.prepareStatement("SELECT idempleado, nome, apem, direce, correm, telefono, usuario,TipoEmpleado FROM Empleados " + where);
            rs = ps.executeQuery();

            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Dirección");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Teléfono");
            modeloTabla.addColumn("Usuario");
            modeloTabla.addColumn("Tipo");

            while (rs.next()) {
            Vector<Object> fila = new Vector<>();
            fila.add(rs.getInt("idempleado"));
            fila.add(rs.getString("nome"));
            fila.add(rs.getString("apem"));
            fila.add(rs.getString("direce"));
            fila.add(rs.getString("correm"));
            fila.add(rs.getInt("telefono"));
            fila.add(rs.getString("usuario"));
            fila.add(rs.getString("TipoEmpleado"));
            modeloTabla.addRow(fila);
        }
                int[] anchos = { 90, 110, 110, 200, 200, 100, 110,110 };
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
                }
            
        }
    
    public void insertar(T objeto) {
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            System.out.println("CONEXION EXITOSA");
            ps = PSInsertar(objeto);
            int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Registro insertado correctamente en la tabla " + getNombreTabla());
            } else {
                System.out.println("No se pudo insertar el registro en la tabla " + getNombreTabla());
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar el registro en la tabla " + getNombreTabla() + ": " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void modificar(T objeto) {
        try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            ps = PSModificar(objeto);
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Registro Modificado  correctamente en la tabla " + getNombreTabla());
            } else {
                System.out.println("No se encontro el registro en la tabla " + getNombreTabla() + " para modificar");
            }
        } catch (SQLException e) {
            System.err.println("Error al modificar el registro en la tabla " + getNombreTabla() + ": " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void eliminar(int id) {
        try {
            ps = PSEliminar(id);
            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Registro eliminado correctamente de la tabla " + getNombreTabla());
            } else {
                System.out.println("No se encontro el registro en la tabla " + getNombreTabla() + " para eliminar");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar el registro de la tabla " + getNombreTabla() + ": " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public abstract String getNombreTabla();
}

