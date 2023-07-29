
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorMostrarVentas {
    
    private PreparedStatement ps = null;
    private Connection conexion = null;
    private ResultSet rs = null; 
    public void cargartabla(JTable tabla, String campo,String tipobusqueda, String senticiafecha){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        System.out.println(campo);
        String where = "";
        String whereFecha="";
        String filtro="";
        if (!"".equals(campo)) {
            switch (tipobusqueda) {
                case "IDVenta":
                    where = " Ventas.idventa=" + campo;
                    break;
                case "IDCliente":
                    where = " Clientes.idcliente=" + campo;
                    break;
                case "Nombre":
                    where = " Clientes.nomc= '" + campo+"'";
                    break;
                case "Apellido":
                    where = " Clientes.Apec= '" + campo+"'";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR EL DATO(Posible campo invalido)");
            }
        }
        
        if(!"".equals(senticiafecha)){
        whereFecha=" Ventas.fecha BETWEEN '"+senticiafecha+" 00:00:00' and '"+senticiafecha+" 23:59:59'";
        System.out.println("Sentencia de fecha"+whereFecha);
        }
        if(!"".equals(where)&&!"".equals(whereFecha)){
        filtro=" where "+where+" and "+whereFecha;
        }
        else if(!"".equals(where)){
        filtro=" where "+where;
        }
        else if(!"".equals(whereFecha)){
        filtro=" where "+whereFecha;
        }
            try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            ps = conexion.prepareStatement("select ventas.idventa,Ventas.idempleado, Clientes.idcliente,Clientes.nomc,Clientes.Apec,Ventas.fecha,RegistroVenta.igv, RegistroVenta.descuentosTotal, RegistroVenta.totalPagar from Ventas inner join Clientes\n" +
"on Clientes.idcliente=Ventas.cliente inner join RegistroVenta\n" +
"on RegistroVenta.idventa=Ventas.idventa " + filtro);
            rs = ps.executeQuery();
            modeloTabla.addColumn("ID_Venta");
            modeloTabla.addColumn("Empleado");
            modeloTabla.addColumn("ID_Cliente");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Fecha");
            modeloTabla.addColumn("Igv");
            modeloTabla.addColumn("Descuentos");
            modeloTabla.addColumn("Precio Total");
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            int anchos[] = {70, 70,80, 90, 110, 160, 70,50,120};
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila.add(rs.getObject(i + 1));
                }       
                modeloTabla.addRow(fila);}
        } catch (Exception e) {
            System.err.println("Error: " + e);}          
}
    public void cargartablaProductos(JTable tabla, int id){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);

            try {
            Conexion con = new Conexion();
            conexion = con.getConexion();
            ps = conexion.prepareStatement("select Productos.nompro, PRO_VENTA.cantidad,PRO_VENTA.igv,PRO_VENTA.descuentos,PRO_VENTA.subtotal from PRO_VENTA inner join Productos\n" +
"on PRO_VENTA.serie=Productos.serie\n" +
"WHERE  PRO_VENTA.idventa=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            modeloTabla.addColumn("Productos");
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Igv");
            modeloTabla.addColumn("Descuento");
            modeloTabla.addColumn("Subtotal");
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            int anchos[] = {200, 90, 60,70, 90};
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila.add(rs.getObject(i + 1));
                }       
                modeloTabla.addRow(fila);}
        } catch (Exception e) {
            System.err.println("Error: " + e);}
            
            
           
}
}
