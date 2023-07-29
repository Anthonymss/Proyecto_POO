package Vista;
import Producto.Categoria;
import Producto.Producto;
import Controlador.ControladorProductos;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class FMProductosActualizado extends javax.swing.JFrame {
    ControladorProductos controlador=new ControladorProductos();
    Producto producto=new Producto();
    private List<Categoria> listaCategorias = controlador.consultaCategorias();
    public FMProductosActualizado() {
        initComponents();
        cargartabla();
        comboboxcargar();
        estilostabla();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panProductos = new javax.swing.JPanel();
        lblimageCasa = new javax.swing.JLabel();
        txtNroSerie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProductos = new javax.swing.JTable();
        btnCargarTabla = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNroSerie1 = new javax.swing.JLabel();
        txtNroSerie2 = new javax.swing.JTextField();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        lblImageFondo = new javax.swing.JLabel();
        imageCATE = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        cbxBusqueda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panProductos.setBackground(new java.awt.Color(45, 141, 166));
        panProductos.setPreferredSize(new java.awt.Dimension(900, 690));

        lblimageCasa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\casa.png"));
        lblimageCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimageCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageCasaMouseClicked(evt);
            }
        });

        txtNroSerie.setBackground(new java.awt.Color(0, 0, 0));
        txtNroSerie.setForeground(new java.awt.Color(255, 255, 255));

        tProductos.setBackground(new java.awt.Color(0, 0, 0));
        tProductos.setForeground(new java.awt.Color(255, 255, 255));
        tProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nro. Serie", "Nombre", "Precio", "Stock", "Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tProductos.setGridColor(new java.awt.Color(0, 0, 0));
        tProductos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProductos);

        btnCargarTabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarTabla.setText("Buscar");
        btnCargarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarTablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarTablaMouseExited(evt);
            }
        });
        btnCargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre: ");

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripción:");

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        txtPrecio.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Precio:");

        txtStock.setBackground(new java.awt.Color(0, 0, 0));
        txtStock.setForeground(new java.awt.Color(255, 255, 255));

        lblStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 0, 0));
        lblStock.setText("Stock:");

        lblCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("Categoría:");

        btnInsertar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblNroSerie1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNroSerie1.setForeground(new java.awt.Color(0, 0, 0));
        lblNroSerie1.setText("Nro. Serie:");

        txtNroSerie2.setBackground(new java.awt.Color(0, 0, 0));
        txtNroSerie2.setForeground(new java.awt.Color(255, 255, 255));
        txtNroSerie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroSerie2ActionPerformed(evt);
            }
        });

        ComboBoxCategoria.setBackground(new java.awt.Color(0, 0, 0));
        ComboBoxCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ComboBoxCategoria.setForeground(new java.awt.Color(255, 255, 255));
        ComboBoxCategoria.setMaximumRowCount(20);
        ComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoriaActionPerformed(evt);
            }
        });

        txtdescripcion.setBackground(new java.awt.Color(0, 0, 0));
        txtdescripcion.setColumns(20);
        txtdescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtdescripcion.setRows(5);
        txtdescripcion.setSelectedTextColor(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(txtdescripcion);

        lblImageFondo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\fondoProducto.jpg"));

        btnClean.setBackground(new java.awt.Color(13, 113, 204));
        btnClean.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\clean.png"));
        btnClean.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        cbxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nro.Serie", "Categoria" }));

        javax.swing.GroupLayout panProductosLayout = new javax.swing.GroupLayout(panProductos);
        panProductos.setLayout(panProductosLayout);
        panProductosLayout.setHorizontalGroup(
            panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosLayout.createSequentialGroup()
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cbxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)))
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblimageCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panProductosLayout.createSequentialGroup()
                                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panProductosLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNroSerie1)
                                            .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                                .addComponent(lblStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(lblNombre))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(ComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtStock)
                                    .addComponent(txtNombre)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(imageCATE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                                    .addComponent(txtNroSerie2))
                                .addGap(15, 15, 15))
                            .addGroup(panProductosLayout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(33, 33, 33))))
            .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImageFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );
        panProductosLayout.setVerticalGroup(
            panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarTabla)
                    .addComponent(cbxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(97, 97, 97))
            .addGroup(panProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimageCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroSerie2)
                    .addComponent(lblNroSerie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(imageCATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panProductosLayout.createSequentialGroup()
                        .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
            .addGroup(panProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImageFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void comboboxcargar(){
        ComboBoxCategoria.removeAllItems();
        //lambda
        listaCategorias.forEach(categoria -> ComboBoxCategoria.addItem(categoria.getNombre()));
        /*for (Categoria categoria : listaCategorias) {
        ComboBoxCategoria.addItem(categoria.getNombre());
            }*/
    } 
    private void cargartabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tProductos.setModel(modeloTabla);
        String campo = txtNroSerie.getText();
        String tipobusqueda = String.valueOf(cbxBusqueda.getSelectedItem());
        try {
            
            controlador.cargarTabla(tProductos, campo,tipobusqueda, producto);
            System.out.println("Tabla cargada correctamente");
        } catch (Exception e) {
            System.err.println("Error al cargar la tabla: " + e);
        }
    }
    private void estilostabla(){
        JTableHeader header = tProductos.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink);
             jScrollPane1.getViewport().setBackground(Color.black);
            return component;}});
    }
    private boolean validarCampos(){
    boolean f=false;
    if(!"".equals(txtNroSerie2.getText())&&!"".equals(txtNombre.getText())&&!"".equals(txtPrecio.getText())&&!"".equals(txtdescripcion.getText())&&!"".equals(txtStock.getText())){
    f=true;
    }
    return f;
    }
    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
       cargartabla();
    }//GEN-LAST:event_btnCargarTablaActionPerformed

    private void tProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductosMouseClicked
        try {
            int fila = tProductos.getSelectedRow();
            String serie = tProductos.getValueAt(fila, 0).toString();
            producto = controlador.buscarPorId(Integer.parseInt(serie));

            if (producto != null) {
                txtNroSerie2.setText(String.valueOf(producto.getNumeroSerie()));
                txtNombre.setText(producto.getNombre());
                txtPrecio.setText(String.valueOf(producto.getPrecio()));
                txtStock.setText(String.valueOf(producto.getStock()));
                txtdescripcion.setLineWrap(true);
                txtdescripcion.setWrapStyleWord(true);
                txtdescripcion.setText(producto.getDescripcion());
                ComboBoxCategoria.setSelectedItem(producto.getCategoria().getNombre());
            }else{System.out.println("Aqui el error");}
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }//GEN-LAST:event_tProductosMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if(validarCampos()){
        producto.setNumeroSerie(Integer.parseInt(txtNroSerie2.getText().trim()));
        producto.setNombre(txtNombre.getText());
        producto.setDescripcion(txtdescripcion.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
        producto.setNombreCat(ComboBoxCategoria.getSelectedItem().toString());
        controlador.insertar(producto);
        cargartabla();}else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtNroSerie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroSerie2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroSerie2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        producto.setNumeroSerie(Integer.parseInt(txtNroSerie2.getText().trim()));
        producto.setNombre(txtNombre.getText());
        producto.setDescripcion(txtdescripcion.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
        producto.setNombreCat(ComboBoxCategoria.getSelectedItem().toString());
        controlador.modificar(producto);
        cargartabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int codigo=Integer.parseInt(txtNroSerie2.getText().trim());
        controlador.eliminar(codigo);
        cargartabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoriaActionPerformed
        String CATEimagen;
        switch (ComboBoxCategoria.getSelectedItem().toString()) {
        case "Camilla":
            CATEimagen = "camilla.jpg";
            break;
        case "Andador":
            CATEimagen = "andador.jpg";
            break;
        case "Silla de Ruedas":
            CATEimagen = "silla.jpg";
            break;
        case "Cama clinica":
            CATEimagen = "cama.jpg";
            break;
        case "Rehabilitacion":
            CATEimagen = "muletass.png";
            break;
        default:
            CATEimagen = "";
    }
    //  System.out.println(CATEimagen);
    imageCATE.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\resoucers\\img\\" + CATEimagen));
   
    }//GEN-LAST:event_ComboBoxCategoriaActionPerformed

    private void lblimageCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageCasaMouseClicked
        new FMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblimageCasaMouseClicked

    private void btnCargarTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseEntered
        if(!"".equals(txtNroSerie.getText())){
            btnCargarTabla.setBackground(Color.BLACK);
            btnCargarTabla.setForeground(Color.pink);
            btnCargarTabla.setText("Buscar Serie");
        }
    }//GEN-LAST:event_btnCargarTablaMouseEntered

    private void btnCargarTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseExited
            btnCargarTabla.setBackground(null);
            btnCargarTabla.setForeground(Color.black);
            btnCargarTabla.setText("Buscar");
    }//GEN-LAST:event_btnCargarTablaMouseExited

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtNroSerie2.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtdescripcion.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

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
            java.util.logging.Logger.getLogger(FMProductosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMProductosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMProductosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMProductosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMProductosActualizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCategoria;
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxBusqueda;
    private javax.swing.JLabel imageCATE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImageFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNroSerie1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblimageCasa;
    private javax.swing.JPanel panProductos;
    private javax.swing.JTable tProductos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroSerie;
    private javax.swing.JTextField txtNroSerie2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
