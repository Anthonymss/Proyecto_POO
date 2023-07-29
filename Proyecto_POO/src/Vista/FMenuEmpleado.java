package Vista;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class FMenuEmpleado extends javax.swing.JFrame {
    private static int contador=0;
    String image="";
    Timer timer;
    TimerTask tarea;
    public FMenuEmpleado() {
        initComponents();
        mensajebienvenida();
        this.setLocationRelativeTo(null);
        rotarimagenes();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panelprincipal = new javax.swing.JPanel();
        lblImageFondo = new javax.swing.JLabel();
        panelconsulta = new javax.swing.JPanel();
        lblconsulta = new javax.swing.JLabel();
        lbltextodemenu = new javax.swing.JLabel();
        lblimagetuerca = new javax.swing.JLabel();
        panelcliente = new javax.swing.JPanel();
        lblcliente = new javax.swing.JLabel();
        lblimageusuario = new javax.swing.JLabel();
        lblimageinfo = new javax.swing.JLabel();
        lblRealizarVenta = new javax.swing.JLabel();
        lblMensajeBienvenida = new javax.swing.JLabel();
        lblImageAUTE = new javax.swing.JLabel();
        lblImageCompra = new javax.swing.JLabel();
        lblMensajeBienvenida3 = new javax.swing.JLabel();
        imagenref = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        panelprincipal.setBackground(new java.awt.Color(0, 153, 153));
        panelprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelprincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelprincipalMouseEntered(evt);
            }
        });

        lblImageFondo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\desenborro.jpg"));

        panelconsulta.setBackground(new java.awt.Color(0, 0, 0));
        panelconsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblconsulta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblconsulta.setForeground(new java.awt.Color(204, 255, 255));
        lblconsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblconsulta.setText("Consultar Ventas");
        lblconsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblconsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblconsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblconsultaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelconsultaLayout = new javax.swing.GroupLayout(panelconsulta);
        panelconsulta.setLayout(panelconsultaLayout);
        panelconsultaLayout.setHorizontalGroup(
            panelconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblconsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        panelconsultaLayout.setVerticalGroup(
            panelconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lbltextodemenu.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbltextodemenu.setForeground(new java.awt.Color(0, 0, 0));
        lbltextodemenu.setText("Menú de Opciones de Empleados");

        lblimagetuerca.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\ajustes.png"));

        panelcliente.setBackground(new java.awt.Color(0, 0, 0));
        panelcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblcliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblcliente.setForeground(new java.awt.Color(0, 153, 153));
        lblcliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcliente.setText("Gestionar Clientes");
        lblcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblclienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblclienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblclienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelclienteLayout = new javax.swing.GroupLayout(panelcliente);
        panelcliente.setLayout(panelclienteLayout);
        panelclienteLayout.setHorizontalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        panelclienteLayout.setVerticalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        lblimageusuario.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\circle-user-solid.png"));

        lblimageinfo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\circle-info-solid.png"));

        lblRealizarVenta.setBackground(new java.awt.Color(0, 0, 0));
        lblRealizarVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRealizarVenta.setForeground(new java.awt.Color(0, 153, 153));
        lblRealizarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRealizarVenta.setText("Realizar Venta");
        lblRealizarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRealizarVenta.setOpaque(true);
        lblRealizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRealizarVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRealizarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRealizarVentaMouseExited(evt);
            }
        });

        lblMensajeBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblImageAUTE.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\saliraute (2).png"));
        lblImageAUTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImageAUTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageAUTEMouseClicked(evt);
            }
        });

        lblImageCompra.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\cart-plus-solid.png"));

        lblMensajeBienvenida3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        imagenref.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\1.jpg"));

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblimageusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblimageinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(49, 49, 49)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(imagenref, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblImageAUTE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lbltextodemenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(lblimagetuerca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addComponent(lblMensajeBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addComponent(lblMensajeBienvenida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImageFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltextodemenu)
                    .addComponent(lblimagetuerca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblMensajeBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeBienvenida3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                                .addComponent(lblimageusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                                .addComponent(panelcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)))
                                        .addComponent(lblimageinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(lblImageAUTE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImageCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(lblRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(imagenref, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImageFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mensajebienvenida() {
        String datos = Controlador.ControladorIngreso.DatosEmpleado();
        lblMensajeBienvenida.setText("Bienvenido " + datos);
        lblMensajeBienvenida3.setText("¡Aprovecha al máximo todas las funcionalidades disponibles!");
    }
    private void rotarimagenes(){
        
        int velocidad=2000;//2 segundos
        tarea=new TimerTask() {
            @Override
            public void run() {
                switch(contador){
                    case 0:
                        contador=1;
                        image="1.jpg";
                        break;
                    case 1:
                        contador=2;
                        image="2.jpg";
                        break;
                    case 2:
                        contador=3;
                        image="3.jpg";
                        break;
                    case 3:
                        contador=0;
                        image="4.jpg";
                        break;                
                }
                System.out.println(image);
                imagenref.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\"+image));
            }
        };
            timer=new Timer();
            timer.scheduleAtFixedRate(tarea, velocidad, velocidad);        
    }
    private void lblclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclienteMouseClicked
          // accion al hacer click
        new FMClientesActualizado().setVisible(true);
        cancelarRotacionImages();
        this.dispose();
    }//GEN-LAST:event_lblclienteMouseClicked
    
    private void lblclienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclienteMouseEntered
        lblcliente.setForeground(Color.black);
        panelcliente.setBackground(Color.cyan);
    }//GEN-LAST:event_lblclienteMouseEntered

    private void lblclienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclienteMouseExited
        lblcliente.setForeground(Color.cyan);
        panelcliente.setBackground(Color.black);
    }//GEN-LAST:event_lblclienteMouseExited
    private void cancelarRotacionImages(){
    tarea.cancel();
    timer.cancel();
    }
    private void lblconsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblconsultaMouseClicked
        new FProductosVendidos().setVisible(true);
        cancelarRotacionImages();
        this.dispose();
    }//GEN-LAST:event_lblconsultaMouseClicked

    private void lblconsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblconsultaMouseEntered
        lblconsulta.setForeground(Color.black);
        panelconsulta.setBackground(Color.cyan);    }//GEN-LAST:event_lblconsultaMouseEntered

    private void lblconsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblconsultaMouseExited
        lblconsulta.setForeground(Color.CYAN);
        panelconsulta.setBackground(Color.black);    }//GEN-LAST:event_lblconsultaMouseExited

    private void lblRealizarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRealizarVentaMouseClicked
        new FRegistrarProductoVendidoActrualizado().setVisible(true);
        cancelarRotacionImages();
        this.dispose();
    }//GEN-LAST:event_lblRealizarVentaMouseClicked

    private void lblImageAUTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageAUTEMouseClicked
        new FAutenticacion().setVisible(true);
        cancelarRotacionImages();
        this.dispose();
    }//GEN-LAST:event_lblImageAUTEMouseClicked

    private void lblRealizarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRealizarVentaMouseEntered
        lblRealizarVenta.setForeground(Color.black);
        lblRealizarVenta.setBackground(Color.cyan);
    }//GEN-LAST:event_lblRealizarVentaMouseEntered

    private void lblRealizarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRealizarVentaMouseExited
        lblRealizarVenta.setForeground(Color.cyan);
        lblRealizarVenta.setBackground(Color.black);
    }//GEN-LAST:event_lblRealizarVentaMouseExited
    int veces=0;
    private void panelprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelprincipalMouseClicked
        while(veces<1){
        mensajebienvenida();
        veces++;
        }
    }//GEN-LAST:event_panelprincipalMouseClicked

    private void panelprincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelprincipalMouseEntered

    }//GEN-LAST:event_panelprincipalMouseEntered

    
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
            java.util.logging.Logger.getLogger(FMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenref;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblImageAUTE;
    private javax.swing.JLabel lblImageCompra;
    private javax.swing.JLabel lblImageFondo;
    private javax.swing.JLabel lblMensajeBienvenida;
    private javax.swing.JLabel lblMensajeBienvenida3;
    private javax.swing.JLabel lblRealizarVenta;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JLabel lblconsulta;
    private javax.swing.JLabel lblimageinfo;
    private javax.swing.JLabel lblimagetuerca;
    private javax.swing.JLabel lblimageusuario;
    private javax.swing.JLabel lbltextodemenu;
    private javax.swing.JPanel panelcliente;
    private javax.swing.JPanel panelconsulta;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
