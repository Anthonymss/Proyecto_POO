package Vista;
import Persona.Cliente;
import javax.swing.table.DefaultTableModel;
import Controlador.ControladorCliente2;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;



public class FMClientesActualizado extends javax.swing.JFrame {
    ControladorCliente2 controlador=new ControladorCliente2();
    Cliente cliente=new Cliente();
    public FMClientesActualizado() {
        initComponents();
        cargartabla();
        estilostabla();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblimagefondo = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tClientes = new javax.swing.JTable();
        btnCargarTabla = new javax.swing.JButton();
        lblDni2 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDni2 = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        lblDistrito = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblimagehouse = new javax.swing.JLabel();
        lblsugerenciadni2 = new javax.swing.JLabel();
        lblIMAGEclean = new javax.swing.JLabel();
        cbxtipobusqueda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 141, 166));

        lblimagefondo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\fondocliente.jpg"));

        txtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDniMouseExited(evt);
            }
        });
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        tClientes.setForeground(new java.awt.Color(0, 0, 0));
        tClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Dirección", "Distrito", "Correo", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tClientes.setGridColor(new java.awt.Color(0, 0, 0));
        tClientes.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tClientes.setSelectionForeground(new java.awt.Color(255, 204, 204));
        tClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tClientes);

        btnCargarTabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarTabla.setText("Buscar Cliente");
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

        lblDni2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDni2.setForeground(new java.awt.Color(0, 0, 0));
        lblDni2.setText("DNI:");

        lblNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("Nombres: ");

        lblCelular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 0, 0));
        lblCelular.setText("Celular:");

        txtNombres.setBackground(new java.awt.Color(0, 0, 0));
        txtNombres.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));

        txtDni2.setBackground(new java.awt.Color(0, 0, 0));
        txtDni2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDni2.setForeground(new java.awt.Color(255, 255, 255));
        txtDni2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDni2MouseExited(evt);
            }
        });
        txtDni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDni2ActionPerformed(evt);
            }
        });

        lblApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("Apellidos:");

        txtApellidos.setBackground(new java.awt.Color(0, 0, 0));
        txtApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));

        txtDireccion.setBackground(new java.awt.Color(0, 0, 0));
        txtDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Dirección:");

        txtDistrito.setBackground(new java.awt.Color(0, 0, 0));
        txtDistrito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDistrito.setForeground(new java.awt.Color(255, 255, 255));

        lblDistrito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDistrito.setForeground(new java.awt.Color(0, 0, 0));
        lblDistrito.setText("Distrito:");

        lblCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(0, 0, 0));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtCelular.setBackground(new java.awt.Color(0, 0, 0));
        txtCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(255, 255, 255));

        btnInsertar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertarMouseExited(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblimagehouse.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\casa.png"));
        lblimagehouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimagehouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimagehouseMouseClicked(evt);
            }
        });

        lblsugerenciadni2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblsugerenciadni2.setForeground(new java.awt.Color(102, 153, 0));
        lblsugerenciadni2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblIMAGEclean.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\clean.png"));
        lblIMAGEclean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIMAGEclean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIMAGEcleanMouseClicked(evt);
            }
        });

        cbxtipobusqueda.setBackground(new java.awt.Color(0, 0, 0));
        cbxtipobusqueda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxtipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbxtipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellido", "Distrito" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxtipobusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIMAGEclean, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtApellidos))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDireccion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombres))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCelular)
                                        .addComponent(txtCorreo))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblsugerenciadni2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblimagehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblimagefondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblsugerenciadni2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblimagehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni2)
                            .addComponent(txtDni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidos)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDistrito)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIMAGEclean, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsertar)
                                .addComponent(btnModificar)
                                .addComponent(btnEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarTabla)
                            .addComponent(cbxtipobusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblimagefondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void estilostabla(){
    JTableHeader header = tClientes.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink);
            jScrollPane1.getViewport().setBackground(Color.black);
            return component;}});
    }
    private boolean verificarCampos(){
        boolean f=false;
        if(!"".equals(txtApellidos.getText())&&!"".equals(txtDni2.getText())&&!"".equals(txtDireccion.getText())&&!"".equals(txtDistrito.getText())&&!"".equals(txtCorreo.getText())&&!"".equals(txtCelular.getText())){
        f=true;}
        return f;
    }
    private void txtDni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDni2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDni2ActionPerformed
    private void cargartabla() {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    tClientes.setModel(modeloTabla);
    String campo = txtDni.getText();
    String tipobusqueda=String.valueOf(cbxtipobusqueda.getSelectedItem());
    try {
        controlador.cargarTabla(tClientes, campo,tipobusqueda, cliente);
        System.out.println("Tabla cargada correctamente");
    } catch (Exception e) {
        System.err.println("Error al cargar la tabla: " + e);
    }
}


    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
    cargartabla();
    }//GEN-LAST:event_btnCargarTablaActionPerformed

    private void tClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClientesMouseClicked
        try {
        int fila = tClientes.getSelectedRow();
        String dni = tClientes.getValueAt(fila, 0).toString();
        cliente = controlador.buscarPorId(Integer.parseInt(dni));

        if (cliente != null) {
            txtDni2.setText(cliente.getDNI());
            txtNombres.setText(cliente.getNombre());
            txtApellidos.setText(cliente.getApellidos());
            txtDireccion.setText(cliente.getDireccion());
            txtDistrito.setText(cliente.getDistrito());
            txtCorreo.setText(cliente.getCorreo());
            txtCelular.setText(cliente.getTelefono());
        }
    } catch (Exception e) {
        System.err.println("Error: " + e);
    }
    }//GEN-LAST:event_tClientesMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
    if(verificarCampos()){
    cliente.setDNI(txtDni2.getText());
    cliente.setNombre(txtNombres.getText());
    cliente.setApellidos(txtApellidos.getText());
    cliente.setDireccion(txtDireccion.getText());
    cliente.setDistrito(txtDistrito.getText());
    cliente.setCorreo(txtCorreo.getText());
    cliente.setTelefono(txtCelular.getText());
    if (txtDni2.getText().length() != 8) {
        lblsugerenciadni2.setText("Recuerda que los DNI tienen 8 caracteres");
        lblsugerenciadni2.setOpaque(true);
        lblsugerenciadni2.setBackground(Color.BLACK);
        lblsugerenciadni2.setForeground(Color.RED);
    } else {
        controlador.insertar(cliente);
    }
    cargartabla();}else{
        JOptionPane.showMessageDialog(null, "Complete todos los campos!");
    }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    cliente.setDNI(txtDni2.getText());
    cliente.setNombre(txtNombres.getText());
    cliente.setApellidos(txtApellidos.getText());
    cliente.setDireccion(txtDireccion.getText());
    cliente.setDistrito(txtDistrito.getText());
    cliente.setCorreo(txtCorreo.getText());
    cliente.setTelefono(txtCelular.getText());
    controlador.modificar(cliente);
    cargartabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idCliente = Integer.parseInt(txtDni2.getText());
        controlador.eliminar(idCliente);
        cargartabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed

    }//GEN-LAST:event_txtDniActionPerformed

    private void btnCargarTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseEntered
            if(!(txtDni.getText().equals(""))){
            btnCargarTabla.setText("Cargar Datos");
            btnCargarTabla.setForeground(Color.green);
            btnCargarTabla.setBackground(Color.black);
        }
    }//GEN-LAST:event_btnCargarTablaMouseEntered

    private void btnCargarTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseExited
            btnCargarTabla.setText("Buscar Cliente");
            btnCargarTabla.setForeground(Color.black);
            btnCargarTabla.setBackground(Color.white);
        
    }//GEN-LAST:event_btnCargarTablaMouseExited

    private void txtDniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMouseExited
    }//GEN-LAST:event_txtDniMouseExited

    private void btnInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseEntered
        btnInsertar.setForeground(Color.GREEN);
        btnInsertar.setBackground(Color.black);
    }//GEN-LAST:event_btnInsertarMouseEntered

    private void btnInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseExited
        btnInsertar.setForeground(Color.white);
        btnInsertar.setBackground(Color.DARK_GRAY);
        lblsugerenciadni2.setOpaque(false);
        lblsugerenciadni2.setForeground(null);
    }//GEN-LAST:event_btnInsertarMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setForeground(Color.GREEN);
        btnModificar.setBackground(Color.black);    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setForeground(Color.white);
        btnModificar.setBackground(Color.darkGray);     }//GEN-LAST:event_btnModificarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setForeground(Color.GREEN);
        btnEliminar.setBackground(Color.black);    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setForeground(Color.white);
        btnEliminar.setBackground(Color.DARK_GRAY);     }//GEN-LAST:event_btnEliminarMouseExited

    private void txtDni2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDni2MouseExited
        if(txtDni2.getText().length()==0){
        lblsugerenciadni2.setText("");
        }else if(txtDni2.getText().length()!=8){
        lblsugerenciadni2.setText("Recuerda que los DNI tienen 8 caracteres");
        }else{
        lblsugerenciadni2.setText("");
        }
    }//GEN-LAST:event_txtDni2MouseExited

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void lblimagehouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimagehouseMouseClicked
       if(Controlador.ControladorIngreso.UsuarioActivo().equalsIgnoreCase("Administrador")){
       new FMenuAdmin().setVisible(true);
       this.dispose();
       }else{
       new FMenuEmpleado().setVisible(true);
       this.dispose();
       }
          
    }//GEN-LAST:event_lblimagehouseMouseClicked

    private void lblIMAGEcleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIMAGEcleanMouseClicked
        txtDni2.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        txtDistrito.setText("");
        txtDireccion.setText("");
    }//GEN-LAST:event_lblIMAGEcleanMouseClicked

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
            java.util.logging.Logger.getLogger(FMClientesActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMClientesActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMClientesActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMClientesActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMClientesActualizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxtipobusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDistrito;
    private javax.swing.JLabel lblDni2;
    private javax.swing.JLabel lblIMAGEclean;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblimagefondo;
    private javax.swing.JLabel lblimagehouse;
    private javax.swing.JLabel lblsugerenciadni2;
    private javax.swing.JTable tClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDni2;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
