package Vista;

import Controlador.ControladorMostrarVentas;
import java.awt.Color;
import java.awt.Component;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class FProductosVendidos extends javax.swing.JFrame {
    ControladorMostrarVentas table =new ControladorMostrarVentas();
    private int contador=0;
    //diccionario
    private  Map<String, Integer> diccionarioMes = new LinkedHashMap<>();//mantiene el orden de insercion 
    public FProductosVendidos() {
        initComponents();
        cargartabla();
        estilostablas();
        this.setLocationRelativeTo(null);
        cbxAÑO.setVisible(false);
        cbxMes.setVisible(false);
        cbxDIA.setVisible(false);
        diccionarioMes.put("Enero", 1);
        diccionarioMes.put("Febrero", 2);
        diccionarioMes.put("Marzo", 3);
        diccionarioMes.put("Abril", 4);
        diccionarioMes.put("Mayo", 5);
        diccionarioMes.put("Junio", 6);
        diccionarioMes.put("Julio", 7);
        diccionarioMes.put("Agosto", 8);
        diccionarioMes.put("Septiembre", 9);
        diccionarioMes.put("Octubre", 10);
        diccionarioMes.put("Noviembre", 11);
        diccionarioMes.put("Diciembre", 12);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panProductosVendidos = new javax.swing.JPanel();
        cbxAÑO = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatosVenta = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProductosVendidos = new javax.swing.JTable();
        imagencasa = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        lblTITULO = new javax.swing.JLabel();
        btntBUscarFecha = new javax.swing.JToggleButton();
        cbxDIA = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();
        cbxMes = new javax.swing.JComboBox<>();
        cbxTipobusqueda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panProductosVendidos.setBackground(new java.awt.Color(45, 141, 166));
        panProductosVendidos.setForeground(new java.awt.Color(0, 0, 0));
        panProductosVendidos.setPreferredSize(new java.awt.Dimension(1210, 500));

        jScrollPane1.setBackground(new java.awt.Color(102, 255, 102));

        tDatosVenta.setBackground(new java.awt.Color(0, 0, 0));
        tDatosVenta.setForeground(new java.awt.Color(255, 255, 255));
        tDatosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdVENTA", "IdCliente", "Nombres", "Apellido", "Fecha", "IGV Total", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDatosVenta.setGridColor(new java.awt.Color(0, 0, 0));
        tDatosVenta.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tDatosVenta.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tDatosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDatosVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tDatosVenta);

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tProductosVendidos.setBackground(new java.awt.Color(0, 0, 0));
        tProductosVendidos.setForeground(new java.awt.Color(255, 255, 255));
        tProductosVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "IGV", "Descuento", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProductosVendidos.setGridColor(new java.awt.Color(0, 0, 0));
        tProductosVendidos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tProductosVendidos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tProductosVendidos);

        imagencasa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\casa.png"));
        imagencasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagencasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagencasaMouseClicked(evt);
            }
        });

        lblTITULO.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lblTITULO.setForeground(new java.awt.Color(0, 0, 0));
        lblTITULO.setText("Historial de Ventas");

        btntBUscarFecha.setBackground(new java.awt.Color(0, 0, 0));
        btntBUscarFecha.setForeground(new java.awt.Color(255, 255, 255));
        btntBUscarFecha.setText("Buscar por Fecha");
        btntBUscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntBUscarFechaActionPerformed(evt);
            }
        });

        fondo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\FondoEmpleados.jpg"));
        fondo.setPreferredSize(new java.awt.Dimension(1210, 500));

        cbxMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActionPerformed(evt);
            }
        });

        cbxTipobusqueda.setBackground(new java.awt.Color(0, 0, 0));
        cbxTipobusqueda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxTipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbxTipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDVenta", "IDCliente", "Nombre", "Apellido" }));

        javax.swing.GroupLayout panProductosVendidosLayout = new javax.swing.GroupLayout(panProductosVendidos);
        panProductosVendidos.setLayout(panProductosVendidosLayout);
        panProductosVendidosLayout.setHorizontalGroup(
            panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cbxTipobusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntBUscarFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxDIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAÑO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(imagencasa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE))
        );
        panProductosVendidosLayout.setVerticalGroup(
            panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosVendidosLayout.createSequentialGroup()
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAÑO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntBUscarFecha)
                            .addComponent(lblTITULO)
                            .addComponent(cbxTipobusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosVendidosLayout.createSequentialGroup()
                        .addComponent(imagencasa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panProductosVendidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panProductosVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tDatosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDatosVentaMouseClicked
        try {
            int fila = tDatosVenta.getSelectedRow();
            int id =  Integer.parseInt( tDatosVenta.getValueAt(fila, 0).toString());
            
            cargartablaProductos_de_Venta(id);
            
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }//GEN-LAST:event_tDatosVentaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cargartabla();
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void estilostablas(){
        JTableHeader header = tDatosVenta.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink);
             jScrollPane1.getViewport().setBackground(Color.black);
            return component;}});
        JTableHeader header1 = tProductosVendidos.getTableHeader();
        header1.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table1, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component1 = super.getTableCellRendererComponent(table1, value, isSelected, hasFocus, row, column);
            component1.setBackground(Color.DARK_GRAY); 
            component1.setForeground(Color.pink); 
            jScrollPane2.getViewport().setBackground(Color.black);
            return component1;}});
    
    }
    private void imagencasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagencasaMouseClicked
        if(Controlador.ControladorIngreso.UsuarioActivo().equals("Administrador")){
        new FMenuAdmin().setVisible(true);
        this.dispose();
        }else{
        new FMenuEmpleado().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_imagencasaMouseClicked

    private void btntBUscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntBUscarFechaActionPerformed
        contador++;
        if(contador%2!=0){
        btntBUscarFecha.setBackground(Color.cyan);
        btntBUscarFecha.setForeground(Color.BLACK);
        btntBUscarFecha.setText("Ocultar");
        cbxAÑO.setVisible(true);
        cbxMes.setVisible(true);
        cbxDIA.setVisible(true);
        cargarcomboBOxs();
        }else{
        btntBUscarFecha.setBackground(Color.black);
        btntBUscarFecha.setForeground(Color.WHITE);
        btntBUscarFecha.setText("Buscar por Fecha");
        cbxAÑO.setVisible(false);
        cbxMes.setVisible(false);
        cbxDIA.setVisible(false);
        cbxAÑO.removeAllItems();
        cbxMes.removeAllItems();
        cbxDIA.removeAllItems();
            System.out.println("nose que va a pasar: "+cbxDIA.getSelectedItem());//devuelve null esta bien :)
        }
    }//GEN-LAST:event_btntBUscarFechaActionPerformed
    private void  cargarcomboBOxs(){
        String arrayAÑO[]={"2023","2024","2025","2026","2027","2028"};
        for(Map.Entry<String, Integer> meses : diccionarioMes.entrySet()){
            cbxMes.addItem(String.valueOf( meses.getKey()));
        }
        for(String arrayAÑOS:arrayAÑO){
            cbxAÑO.addItem(arrayAÑOS);
        }
        
    }
    private void cbxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActionPerformed
        int cantidadDIAs=0;
        cbxDIA.removeAllItems();
        if(cbxMes.getSelectedItem()!=null){
        switch (cbxMes.getSelectedItem().toString()) {
            case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> cantidadDIAs=31;
            case "Febrero" -> cantidadDIAs=28;
            case "Abril", "Junio", "Septiembre", "Noviembre" -> cantidadDIAs=30;
        }
        for (int i = 1; i <= cantidadDIAs; i++) {
            cbxDIA.addItem(String.valueOf(i));
        }}
    }//GEN-LAST:event_cbxMesActionPerformed
    
    private void cargartabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tDatosVenta.setModel(modeloTabla);
        String Tipo = txtDato.getText();
        String sentenciafecha="";
        String TipoBusqueda=String.valueOf(cbxTipobusqueda.getSelectedItem());
        System.out.println("TIPO DE BUSQUEDA :"+TipoBusqueda);
        //verifica el numero de caracteres de el mes y el dia
        int Nmes = String.valueOf(diccionarioMes.get(cbxMes.getSelectedItem())).trim().length();
        int Ndia=String.valueOf(cbxDIA.getSelectedItem()).trim().length();
        String mesF = "";
        String diaF = "";
        //Si son de 1 caracter le agregamos el 0 adelante para realizar bien la consuta y se guarda en mesF y diaF
        if(Nmes==1){mesF="0"+diccionarioMes.get(cbxMes.getSelectedItem());}else{mesF=String.valueOf(diccionarioMes.get(cbxMes.getSelectedItem()));}
        if(Ndia==1){diaF="0"+cbxDIA.getSelectedItem();}else{diaF=String.valueOf(cbxDIA.getSelectedItem());}
        if(cbxAÑO.getSelectedItem()!=null&&cbxMes.getSelectedItem()!=null&&cbxDIA.getSelectedItem()!=null){
        sentenciafecha=cbxAÑO.getSelectedItem()+"-"+mesF+"-"+diaF;
        }
        try {
            table.cargartabla(tDatosVenta, Tipo,TipoBusqueda,sentenciafecha);
            System.out.println("Tabla cargada correctamente");
        } catch (Exception e) {
            System.err.println("Error al cargar la tabla: " + e);
        }
    }
    private void cargartablaProductos_de_Venta(int idventa){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tProductosVendidos.setModel(modeloTabla);
        
        try {
            table.cargartablaProductos(tProductosVendidos, idventa);
            System.out.println("Tabla cargada correctamente");
        } catch (Exception e) {
            System.err.println("Error al cargar la tabla: " + e);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FProductosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FProductosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FProductosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FProductosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FProductosVendidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JToggleButton btntBUscarFecha;
    private javax.swing.JComboBox<String> cbxAÑO;
    private javax.swing.JComboBox<String> cbxDIA;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxTipobusqueda;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagencasa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JPanel panProductosVendidos;
    private javax.swing.JTable tDatosVenta;
    private javax.swing.JTable tProductosVendidos;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
