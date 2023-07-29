package Vista;

import java.awt.Color;

public class FMenuAdmin extends javax.swing.JFrame {
    private int xmouse,ymouse;
    public FMenuAdmin() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblimageuser = new javax.swing.JLabel();
        lbluseremple = new javax.swing.JLabel();
        lblimageproductos = new javax.swing.JLabel();
        lblimageventas = new javax.swing.JLabel();
        lblimagecategoria = new javax.swing.JLabel();
        lblventas = new javax.swing.JLabel();
        lblimageconsultar = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();
        lblimageaute = new javax.swing.JLabel();
        lblclientes = new javax.swing.JLabel();
        lblempleados = new javax.swing.JLabel();
        lblproductos = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        panelMoverVentana = new javax.swing.JPanel();
        lblinfomenu = new javax.swing.JLabel();
        lblimageESC = new javax.swing.JLabel();
        imagenajustes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 400));

        lblimageuser.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\circle-user-solid.png"));

        lbluseremple.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\users-solid.png"));

        lblimageproductos.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\notes-medical-solid.png"));

        lblimageventas.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\cart-plus-solid.png"));

        lblimagecategoria.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\gears-solid.png"));

        lblventas.setBackground(new java.awt.Color(0, 0, 0));
        lblventas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblventas.setForeground(new java.awt.Color(255, 255, 255));
        lblventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblventas.setText("Realizar Venta");
        lblventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblventas.setOpaque(true);
        lblventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblventasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblventasMouseExited(evt);
            }
        });

        lblimageconsultar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\circle-info-solid.png"));

        lblConsultar.setBackground(new java.awt.Color(0, 0, 0));
        lblConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar.setText("Consultar Ventas");
        lblConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultar.setOpaque(true);
        lblConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConsultarMouseExited(evt);
            }
        });

        lblimageaute.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\saliraute (2).png"));
        lblimageaute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimageaute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageauteMouseClicked(evt);
            }
        });

        lblclientes.setBackground(new java.awt.Color(0, 0, 0));
        lblclientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblclientes.setForeground(new java.awt.Color(255, 255, 255));
        lblclientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclientes.setText("Gestionar Clientes");
        lblclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclientes.setOpaque(true);
        lblclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblclientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblclientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblclientesMouseExited(evt);
            }
        });

        lblempleados.setBackground(new java.awt.Color(0, 0, 0));
        lblempleados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblempleados.setForeground(new java.awt.Color(255, 255, 255));
        lblempleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblempleados.setText("Gestionar Empleados");
        lblempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblempleados.setOpaque(true);
        lblempleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblempleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblempleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblempleadosMouseExited(evt);
            }
        });

        lblproductos.setBackground(new java.awt.Color(0, 0, 0));
        lblproductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblproductos.setForeground(new java.awt.Color(255, 255, 255));
        lblproductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproductos.setText("Gestionar Productos");
        lblproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblproductos.setOpaque(true);
        lblproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblproductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblproductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblproductosMouseExited(evt);
            }
        });

        lblcategoria.setBackground(new java.awt.Color(0, 0, 0));
        lblcategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblcategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcategoria.setText("Gestionar categoria");
        lblcategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcategoria.setOpaque(true);
        lblcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcategoriaMouseExited(evt);
            }
        });

        lblimage.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\admin.jpg"));

        panelMoverVentana.setOpaque(false);
        panelMoverVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMoverVentanaMouseDragged(evt);
            }
        });
        panelMoverVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMoverVentanaMousePressed(evt);
            }
        });

        lblinfomenu.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblinfomenu.setForeground(new java.awt.Color(255, 255, 255));
        lblinfomenu.setText("Menu de Opciones de Administrador");

        lblimageESC.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\x.png"));
        lblimageESC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimageESC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageESCMouseClicked(evt);
            }
        });

        imagenajustes.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\ajusteWHITE.png"));

        javax.swing.GroupLayout panelMoverVentanaLayout = new javax.swing.GroupLayout(panelMoverVentana);
        panelMoverVentana.setLayout(panelMoverVentanaLayout);
        panelMoverVentanaLayout.setHorizontalGroup(
            panelMoverVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoverVentanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblinfomenu)
                .addGap(31, 31, 31)
                .addComponent(lblimageESC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMoverVentanaLayout.setVerticalGroup(
            panelMoverVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoverVentanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMoverVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoverVentanaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblinfomenu))
                    .addComponent(imagenajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelMoverVentanaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblimageESC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbluseremple, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimageventas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblventas, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimageaute, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblimageproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblimagecategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblimageconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(panelMoverVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelMoverVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lbluseremple, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblimageproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblimageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimagecategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblimageventas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblventas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblimageconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblproductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblempleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(lblclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addComponent(lblimageaute, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclientesMouseClicked
        new FMClientesActualizado().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblclientesMouseClicked

    private void lblempleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblempleadosMouseClicked
       new FMEmpleadosActualizado().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblempleadosMouseClicked

    private void lblcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcategoriaMouseClicked
    new FMCategoriasActualizado().setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_lblcategoriaMouseClicked

    private void lblproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblproductosMouseClicked
        new FMProductosActualizado().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblproductosMouseClicked

    private void lblventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblventasMouseClicked
        new FRegistrarProductoVendidoActrualizado().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblventasMouseClicked

    private void lblimageauteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageauteMouseClicked
        new FAutenticacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblimageauteMouseClicked

    private void lblimageESCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageESCMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblimageESCMouseClicked

    private void panelMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_panelMoverVentanaMousePressed

    private void panelMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_panelMoverVentanaMouseDragged

    private void lblempleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblempleadosMouseEntered
        lblempleados.setBackground(Color.white);
        lblempleados.setForeground(Color.black);
    }//GEN-LAST:event_lblempleadosMouseEntered

    private void lblempleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblempleadosMouseExited
        lblempleados.setBackground(Color.black);
        lblempleados.setForeground(Color.white);
    }//GEN-LAST:event_lblempleadosMouseExited

    private void lblclientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclientesMouseEntered
       lblclientes.setBackground(Color.white);
       lblclientes.setForeground(Color.black);
    }//GEN-LAST:event_lblclientesMouseEntered

    private void lblclientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclientesMouseExited
       lblclientes.setBackground(Color.black);
       lblclientes.setForeground(Color.white);
    }//GEN-LAST:event_lblclientesMouseExited

    private void lblcategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcategoriaMouseEntered
        lblcategoria.setBackground(Color.white);
        lblcategoria.setForeground(Color.black);
    }//GEN-LAST:event_lblcategoriaMouseEntered

    private void lblcategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcategoriaMouseExited
        lblcategoria.setBackground(Color.black);
        lblcategoria.setForeground(Color.white);
    }//GEN-LAST:event_lblcategoriaMouseExited

    private void lblproductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblproductosMouseEntered
        lblproductos.setBackground(Color.white);
        lblproductos.setForeground(Color.black);
    }//GEN-LAST:event_lblproductosMouseEntered

    private void lblproductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblproductosMouseExited
        lblproductos.setBackground(Color.black);
        lblproductos.setForeground(Color.white);
    }//GEN-LAST:event_lblproductosMouseExited

    private void lblventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblventasMouseEntered
        lblventas.setBackground(Color.white);
        lblventas.setForeground(Color.black);
    }//GEN-LAST:event_lblventasMouseEntered

    private void lblventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblventasMouseExited
        lblventas.setBackground(Color.black);
        lblventas.setForeground(Color.white);
    }//GEN-LAST:event_lblventasMouseExited

    private void lblConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarMouseClicked
        new FProductosVendidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblConsultarMouseClicked

    private void lblConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarMouseEntered
        lblConsultar.setBackground(Color.white);
        lblConsultar.setForeground(Color.black);
        
    }//GEN-LAST:event_lblConsultarMouseEntered

    private void lblConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarMouseExited
        lblConsultar.setBackground(Color.black);
        lblConsultar.setForeground(Color.white);
    }//GEN-LAST:event_lblConsultarMouseExited

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
            java.util.logging.Logger.getLogger(FMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenajustes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblclientes;
    private javax.swing.JLabel lblempleados;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblimageESC;
    private javax.swing.JLabel lblimageaute;
    private javax.swing.JLabel lblimagecategoria;
    private javax.swing.JLabel lblimageconsultar;
    private javax.swing.JLabel lblimageproductos;
    private javax.swing.JLabel lblimageuser;
    private javax.swing.JLabel lblimageventas;
    private javax.swing.JLabel lblinfomenu;
    private javax.swing.JLabel lblproductos;
    private javax.swing.JLabel lbluseremple;
    private javax.swing.JLabel lblventas;
    private javax.swing.JPanel panelMoverVentana;
    // End of variables declaration//GEN-END:variables
}