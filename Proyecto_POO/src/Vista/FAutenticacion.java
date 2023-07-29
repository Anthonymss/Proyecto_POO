package Vista;

import Controlador.ControladorIngreso;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FAutenticacion extends javax.swing.JFrame {
    private int xmouse,ymouse;
    private static int contador=0;
    String image="";
    public FAutenticacion() {
        initComponents();
        rotarimagenes();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panelprincipal = new javax.swing.JPanel();
        lblmensajeerror = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtxusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        paneliniciarsesion = new javax.swing.JPanel();
        lbliniciarsesion = new javax.swing.JLabel();
        panelMover = new javax.swing.JPanel();
        lblimageCerrar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblequiporeahbilitacion = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panelprincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblmensajeerror.setFont(new java.awt.Font("Arial", 3, 17)); // NOI18N
        lblmensajeerror.setForeground(new java.awt.Color(0, 0, 0));
        lblmensajeerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmensajeerror.setText("  ");

        lblimage.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\imagefisio.png"));
        lblimage.setPreferredSize(new java.awt.Dimension(198, 348));

        lblusuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(0, 0, 0));
        lblusuario.setText("Usuario");

        lblcontraseña.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblcontraseña.setText("Contraseña");

        txtxusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtxusuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtxusuario.setForeground(new java.awt.Color(153, 153, 153));
        txtxusuario.setText("Ingrese el nombre de usuario");
        txtxusuario.setBorder(null);
        txtxusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtxusuarioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtxusuarioMousePressed(evt);
            }
        });
        txtxusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtxusuarioActionPerformed(evt);
            }
        });

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtcontraseña.setText("**********");
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraseñaMousePressed(evt);
            }
        });
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });

        jSeparator1.setOpaque(true);

        paneliniciarsesion.setBackground(new java.awt.Color(0, 0, 0));

        lbliniciarsesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbliniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        lbliniciarsesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliniciarsesion.setText("Iniciar Sesión");
        lbliniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbliniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbliniciarsesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbliniciarsesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbliniciarsesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneliniciarsesionLayout = new javax.swing.GroupLayout(paneliniciarsesion);
        paneliniciarsesion.setLayout(paneliniciarsesionLayout);
        paneliniciarsesionLayout.setHorizontalGroup(
            paneliniciarsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbliniciarsesion, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        paneliniciarsesionLayout.setVerticalGroup(
            paneliniciarsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbliniciarsesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        panelMover.setOpaque(false);
        panelMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMoverMouseDragged(evt);
            }
        });
        panelMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMoverMousePressed(evt);
            }
        });

        lblimageCerrar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\poweroff.png"));
        lblimageCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimageCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageCerrarMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\logologo.png"));

        javax.swing.GroupLayout panelMoverLayout = new javax.swing.GroupLayout(panelMover);
        panelMover.setLayout(panelMoverLayout);
        panelMoverLayout.setHorizontalGroup(
            panelMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoverLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(lblimageCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelMoverLayout.setVerticalGroup(
            panelMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimageCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblequiporeahbilitacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblequiporeahbilitacion.setForeground(new java.awt.Color(0, 0, 0));
        lblequiporeahbilitacion.setText("Equipos de Rehabilitación");

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(paneliniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtxusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblusuario)
                                    .addComponent(lblcontraseña)
                                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelprincipalLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblmensajeerror, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblequiporeahbilitacion)
                .addGap(94, 94, 94))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblequiporeahbilitacion)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblusuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtxusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblcontraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(paneliniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblmensajeerror, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Timer timer;
    TimerTask tarea;
    private void rotarimagenes(){
        int velocidad=2000;//2 segundos
        tarea=new TimerTask() {
            @Override
            public void run() {
                switch(contador){
                    case 0:
                        contador=1;
                        image="imagefisio.png";
                        break;
                    case 1:
                        contador=2;
                        image="ingreso2.jpg";
                        break;
                    case 2:
                        contador=3;
                        image="ingreso3.jpg";
                        break;
                    case 3:
                        contador=0;
                        image="ingreso4.jpg";
                        break;                
                }
                lblimage.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\"+image));
                System.out.println(image);
            }
        };
            timer=new Timer();
            timer.scheduleAtFixedRate(tarea, velocidad, velocidad);        
    }
    private void lbliniciarsesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciarsesionMouseExited
        //salir de label(cuando pasas el cursor por encima xd)
        paneliniciarsesion.setBackground(Color.black);
        lbliniciarsesion.setForeground(Color.white);
    }//GEN-LAST:event_lbliniciarsesionMouseExited

    private void lbliniciarsesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciarsesionMouseEntered
        // pasas el mouse
        paneliniciarsesion.setBackground(Color.darkGray);
        lbliniciarsesion.setForeground(Color.white);
    }//GEN-LAST:event_lbliniciarsesionMouseEntered

    private void lbliniciarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciarsesionMouseClicked
        // haces click
        ControladorIngreso controlador = new ControladorIngreso();
        controlador.apagarEstados();

        try {
            if (controlador.validarUsusario(txtxusuario.getText(), String.valueOf(txtcontraseña.getPassword()))) {
                tarea.cancel();
                timer.cancel();
                this.dispose();
                System.out.println("INGRESO CORRECTO");
            } else {
                lblmensajeerror.setText("Error de acceso");
                txtxusuario.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FAutenticacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbliniciarsesionMouseClicked

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMousePressed
        if(String.valueOf(txtcontraseña.getPassword()).equals("**********")){
            txtcontraseña.setText("");
            txtcontraseña.setForeground(Color.black);}
        if(txtxusuario.getText().isEmpty()){
            txtxusuario.setText("Ingrese el nombre de usuario");
            txtxusuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcontraseñaMousePressed

    private void txtxusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtxusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtxusuarioActionPerformed

    private void txtxusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtxusuarioMousePressed
        if(txtxusuario.getText().equals("Ingrese el nombre de usuario")){
            txtxusuario.setText("");
            txtxusuario.setForeground(Color.black);}
        if(String.valueOf(txtcontraseña.getPassword()).isEmpty()){
            txtcontraseña.setText("**********");
            txtcontraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtxusuarioMousePressed

    private void txtxusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtxusuarioMouseEntered

    }//GEN-LAST:event_txtxusuarioMouseEntered

    private void lblimageCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblimageCerrarMouseClicked

    private void panelMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverMousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_panelMoverMousePressed

    private void panelMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_panelMoverMouseDragged

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
            java.util.logging.Logger.getLogger(FAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAutenticacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblequiporeahbilitacion;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblimageCerrar;
    private javax.swing.JLabel lbliniciarsesion;
    private javax.swing.JLabel lblmensajeerror;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel panelMover;
    private javax.swing.JPanel paneliniciarsesion;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtxusuario;
    // End of variables declaration//GEN-END:variables
}
