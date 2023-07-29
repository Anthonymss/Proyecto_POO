package Vista;
import Producto.Categoria;
import Controlador.ControladorCategoria2;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class FMCategoriasActualizado extends javax.swing.JFrame {
    ControladorCategoria2 controlador =new ControladorCategoria2();
    Categoria categoria=new Categoria();
    public FMCategoriasActualizado() {
        initComponents();
        cargartable();
        estilostabla();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCategorias = new javax.swing.JPanel();
        lblimageCasa = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategorias = new javax.swing.JTable();
        btnCargarTabla = new javax.swing.JButton();
        lblCodigo2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo2 = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblIMAGEFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panCategorias.setBackground(new java.awt.Color(45, 141, 166));
        panCategorias.setForeground(new java.awt.Color(0, 0, 0));

        lblimageCasa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\casa.png"));
        lblimageCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimageCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageCasaMouseClicked(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("Código: ");

        txtCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tCategorias.setBackground(new java.awt.Color(0, 0, 0));
        tCategorias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tCategorias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tCategorias.setForeground(new java.awt.Color(255, 255, 255));
        tCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        tCategorias.setGridColor(new java.awt.Color(0, 0, 0));
        tCategorias.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tCategorias.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tCategorias.setShowGrid(false);
        tCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCategorias);

        btnCargarTabla.setBackground(new java.awt.Color(0, 0, 0));
        btnCargarTabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarTabla.setText("Buscar Categoria");
        btnCargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaActionPerformed(evt);
            }
        });

        lblCodigo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo2.setText("Código:");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre: ");

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripción:");

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setSelectedTextColor(new java.awt.Color(0, 153, 153));

        txtCodigo2.setBackground(new java.awt.Color(0, 0, 0));
        txtCodigo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo2.setSelectedTextColor(new java.awt.Color(0, 153, 153));

        btnInsertar.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\clean.png"));
        btnClean.setBorder(null);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        txtDescripcion.setToolTipText("");
        txtDescripcion.setCaretColor(new java.awt.Color(255, 102, 102));
        txtDescripcion.setDisabledTextColor(new java.awt.Color(153, 255, 0));
        txtDescripcion.setSelectedTextColor(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(txtDescripcion);

        lblIMAGEFONDO.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\fondoCategoria.jpg"));

        javax.swing.GroupLayout panCategoriasLayout = new javax.swing.GroupLayout(panCategorias);
        panCategorias.setLayout(panCategoriasLayout);
        panCategoriasLayout.setHorizontalGroup(
            panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCategoriasLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCategoriasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCategoriasLayout.createSequentialGroup()
                                    .addComponent(lblCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCodigo2))
                                .addGroup(panCategoriasLayout.createSequentialGroup()
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panCategoriasLayout.createSequentialGroup()
                                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInsertar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(panCategoriasLayout.createSequentialGroup()
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimageCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIMAGEFONDO, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
        );
        panCategoriasLayout.setVerticalGroup(
            panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCategoriasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCargarTabla))
                    .addComponent(lblimageCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCategoriasLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo2)
                            .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsertar)
                                .addComponent(btnModificar)
                                .addComponent(btnEliminar))
                            .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(panCategoriasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(panCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblIMAGEFONDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cargartable(){
    DefaultTableModel modeloTabla = new DefaultTableModel();
    tCategorias.setModel(modeloTabla);
    String campo = txtCodigo.getText();
    try {
        controlador.cargarTabla(tCategorias, campo,"", categoria);
        System.out.println("Tabla cargada correctamente");
    } catch (Exception e) {
        System.err.println("Error al cargar la tabla: " + e);
    }
    }
    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
    cargartable();
    }//GEN-LAST:event_btnCargarTablaActionPerformed
    private void estilostabla(){
    JTableHeader header = tCategorias.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink);
             jScrollPane1.getViewport().setBackground(Color.black);
            return component;}});
    }
    private void tCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCategoriasMouseClicked
        try {
        int fila = tCategorias.getSelectedRow();
        String codigo = tCategorias.getValueAt(fila, 0).toString();
        categoria = controlador.buscarPorId(Integer.parseInt(codigo));
        if (categoria != null) {
            txtCodigo2.setText(String.valueOf(categoria.getCodigoC()));
            txtNombre.setText(categoria.getNombre());
            txtDescripcion.setLineWrap(true);
            txtDescripcion.setWrapStyleWord(true);
            txtDescripcion.setText(categoria.getDescripcion());
        }
    } catch (Exception e) {
        System.err.println("Error: " + e);
    }
    }//GEN-LAST:event_tCategoriasMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        categoria.setCodigoC(Integer.parseInt(txtCodigo2.getText()));
        categoria.setNombre(txtNombre.getText());
        categoria.setDescripcion(txtDescripcion.getText());
        controlador.insertar(categoria);
        cargartable();
        

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        categoria.setCodigoC(Integer.parseInt( txtCodigo2.getText()));
        categoria.setNombre(txtNombre.getText());
        categoria.setDescripcion(txtDescripcion.getText());
        controlador.modificar(categoria);
        cargartable();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int codigo=Integer.parseInt( txtCodigo2.getText());
        controlador.eliminar(codigo);
        cargartable();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void lblimageCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageCasaMouseClicked
        new FMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblimageCasaMouseClicked

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtCodigo2.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FMCategoriasActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMCategoriasActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMCategoriasActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMCategoriasActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMCategoriasActualizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIMAGEFONDO;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblimageCasa;
    private javax.swing.JPanel panCategorias;
    private javax.swing.JTable tCategorias;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
