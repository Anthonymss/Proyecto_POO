package Vista;
import Persona.Empleado;
import Controlador.ControladorEmpleado2;
import java.awt.Color;
import java.awt.Component;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
public class FMEmpleadosActualizado extends javax.swing.JFrame {
    ControladorEmpleado2 controlador =new ControladorEmpleado2();
    Empleado empleado=new Empleado();
    public FMEmpleadosActualizado() {
        initComponents();
        cargartable();
        estilotabla();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupTipoUsuario = new javax.swing.ButtonGroup();
        panEmpleados = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tEmpleados = new javax.swing.JTable();
        btnCargarTabla = new javax.swing.JButton();
        lblCodigo2 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtCodigo2 = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        lblimageCASA = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblImageFondo = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        cbxproductosTIpoBusqueda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panEmpleados.setBackground(new java.awt.Color(45, 141, 166));

        txtCodigo.setBackground(new java.awt.Color(0, 0, 0));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));

        tEmpleados.setBackground(new java.awt.Color(0, 0, 0));
        tEmpleados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        tEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombres", "Apellidos", "Dirección", "Correo", "Celular", "Usuario", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tEmpleados.setGridColor(new java.awt.Color(0, 0, 0));
        tEmpleados.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tEmpleados.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tEmpleados);

        btnCargarTabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarTabla.setText("Buscar Empleado");
        btnCargarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarTablaMouseClicked(evt);
            }
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

        lblCodigo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo2.setText("Código");

        lblNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("Nombres: ");

        lblCelular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 0, 0));
        lblCelular.setText("Correo:");

        txtNombres.setBackground(new java.awt.Color(0, 0, 0));
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));

        txtCodigo2.setBackground(new java.awt.Color(0, 0, 0));
        txtCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo2ActionPerformed(evt);
            }
        });

        lblApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("Apellidos:");

        txtApellidos.setBackground(new java.awt.Color(0, 0, 0));
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));

        txtDireccion.setBackground(new java.awt.Color(0, 0, 0));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Dirección:");

        lblCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Telefono:");

        txtCelular.setBackground(new java.awt.Color(0, 0, 0));
        txtCelular.setForeground(new java.awt.Color(255, 255, 255));
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        txtCorreo.setBackground(new java.awt.Color(0, 0, 0));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));

        btnInsertar.setBackground(new java.awt.Color(0, 0, 0));
        btnInsertar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(204, 204, 204));
        btnInsertar.setText("Insertar");
        btnInsertar.setPreferredSize(new java.awt.Dimension(57, 27));
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

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
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

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
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

        lblusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(0, 0, 0));
        lblusuario.setText("Usuario:");

        lblcontraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblcontraseña.setText("Contraseña:");

        txtusuario.setBackground(new java.awt.Color(0, 0, 0));
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtContraseña.setBackground(new java.awt.Color(0, 0, 0));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        lblimageCASA.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\casa.png"));
        lblimageCASA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblimageCASA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageCASAMouseClicked(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo :");

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        btngroupTipoUsuario.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Administrador");
        jRadioButton1.setBorder(null);
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        btngroupTipoUsuario.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Empleado");
        jRadioButton2.setBorder(null);
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        lblImageFondo.setBackground(new java.awt.Color(0, 0, 0));
        lblImageFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblImageFondo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\FondoEmpleados.jpg"));
        lblImageFondo.setPreferredSize(null);

        btnClean.setBackground(new java.awt.Color(0, 153, 153));
        btnClean.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\clean.png"));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        cbxproductosTIpoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Apellido", "Tipo" }));

        javax.swing.GroupLayout panEmpleadosLayout = new javax.swing.GroupLayout(panEmpleados);
        panEmpleados.setLayout(panEmpleadosLayout);
        panEmpleadosLayout.setHorizontalGroup(
            panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmpleadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblcontraseña)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panEmpleadosLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jRadioButton2))
                            .addGroup(panEmpleadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panEmpleadosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblusuario)))
                        .addGap(18, 18, 18)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtusuario))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxproductosTIpoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(718, 718, 718)
                .addComponent(lblimageCASA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImageFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE))
        );
        panEmpleadosLayout.setVerticalGroup(
            panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmpleadosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCargarTabla)
                        .addComponent(cbxproductosTIpoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimageCASA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panEmpleadosLayout.createSequentialGroup()
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo2)
                            .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelular)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusuario)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcontraseña)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panEmpleadosLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEmpleadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImageFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void estilotabla(){
    JTableHeader header = tEmpleados.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink);
            jScrollPane1.getViewport().setBackground(Color.black);
            return component;}});
    }
    private void lblimageCASAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageCASAMouseClicked
        new FMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblimageCASAMouseClicked

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int idempleado=Integer.parseInt(txtCodigo2.getText());
        controlador.eliminar(idempleado);
        cargartable();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        empleado.setId(Integer.parseInt(txtCodigo2.getText()));
        empleado.setNombre(txtNombres.getText());
        empleado.setApep(txtApellidos.getText());
        empleado.setDirec(txtDireccion.getText());
        empleado.setCorreo(txtCorreo.getText());
        empleado.setTelefono(Integer.parseInt(txtCelular.getText()));
        empleado.setUsuario(txtusuario.getText());
        empleado.setContraseña(String.valueOf( txtContraseña.getPassword()));
        String tipoUsuario = "";
        Enumeration<AbstractButton> buttons = btngroupTipoUsuario.getElements();
        while (buttons.hasMoreElements()) {
        JRadioButton radioButton = (JRadioButton) buttons.nextElement();
        if (radioButton.isSelected()) {
            empleado.setTipoempleado(tipoUsuario = radioButton.getText());
            break;
        }}
        controlador.modificar(empleado);
        cargartable();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        empleado.setId(Integer.parseInt(txtCodigo2.getText()));
        empleado.setNombre(txtNombres.getText());
        empleado.setApep(txtApellidos.getText());
        empleado.setDirec(txtDireccion.getText());
        empleado.setCorreo(txtCorreo.getText());
        empleado.setTelefono(Integer.parseInt(txtCelular.getText()));
        empleado.setUsuario(txtusuario.getText());
        empleado.setContraseña(String.valueOf( txtContraseña.getPassword()));
        String tipoUsuario = "";
        Enumeration<AbstractButton> buttons = btngroupTipoUsuario.getElements();
        while (buttons.hasMoreElements()) {
        JRadioButton radioButton = (JRadioButton) buttons.nextElement();
        if (radioButton.isSelected()) {
            empleado.setTipoempleado(tipoUsuario = radioButton.getText());
            break;
        }}
        controlador.insertar(empleado);
        cargartable();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo2ActionPerformed
    private void cargartable(){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tEmpleados.setModel(modeloTabla);
        String campo = txtCodigo.getText();
        String tipoBusqueda=String.valueOf(cbxproductosTIpoBusqueda.getSelectedItem()).trim();
        try {
            controlador.cargarTabla(tEmpleados, campo,tipoBusqueda, empleado);
            System.out.println("Tabla cargada correctamente");
        } catch (Exception e) {
            System.err.println("Error al cargar la tabla: " + e);
        }
    }
    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
        cargartable();
    }//GEN-LAST:event_btnCargarTablaActionPerformed

    private void btnCargarTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseExited
        btnCargarTabla.setText("Buscar Empleado");
        btnCargarTabla.setForeground(Color.black);
        btnCargarTabla.setBackground(Color.white);
    }//GEN-LAST:event_btnCargarTablaMouseExited

    private void btnCargarTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseEntered
        if(!(txtCodigo.getText().equals(""))){
            btnCargarTabla.setText("Cargar Datos");
            btnCargarTabla.setForeground(Color.green);
            btnCargarTabla.setBackground(Color.black);
        }
    }//GEN-LAST:event_btnCargarTablaMouseEntered

    private void btnCargarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarTablaMouseClicked

    }//GEN-LAST:event_btnCargarTablaMouseClicked

    private void tEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEmpleadosMouseClicked
        try {
            int fila = tEmpleados.getSelectedRow();
            String idempleado = tEmpleados.getValueAt(fila, 0).toString();
            empleado = controlador.buscarPorId(Integer.parseInt(idempleado));

            if (empleado != null) {
                txtCodigo2.setText(String.valueOf(empleado.getId()));
                txtNombres.setText(empleado.getNombre());
                txtApellidos.setText(empleado.getApep());
                txtDireccion.setText(empleado.getDirec());
                txtCorreo.setText(empleado.getCorreo());
                txtCelular.setText(String.valueOf(empleado.getTelefono()));
                txtusuario.setText(empleado.getUsuario());
                txtContraseña.setText(empleado.getContraseña());
                String tipoUsuario = empleado.getTipoempleado();
                Enumeration<AbstractButton> buttons = btngroupTipoUsuario.getElements();
                while (buttons.hasMoreElements()) {
                JRadioButton radioButton = (JRadioButton) buttons.nextElement();
                if (radioButton.getText().equals(tipoUsuario)) {
                    radioButton.setSelected(true);
                    break;
                }
            }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_tEmpleadosMouseClicked

    private void btnInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseEntered
        btnInsertar.setForeground(Color.GREEN);
        btnInsertar.setBackground(Color.black);
    }//GEN-LAST:event_btnInsertarMouseEntered

    private void btnInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseExited
        btnInsertar.setForeground(Color.white);
        btnInsertar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btnInsertarMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setForeground(Color.GREEN);
        btnModificar.setBackground(Color.black);
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setForeground(Color.white);
        btnModificar.setBackground(Color.darkGray);
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setForeground(Color.GREEN);
        btnEliminar.setBackground(Color.black);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setForeground(Color.white);
        btnEliminar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtCodigo2.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtusuario.setText("");
        txtContraseña.setText("");
        btngroupTipoUsuario.clearSelection();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(FMEmpleadosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMEmpleadosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMEmpleadosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMEmpleadosActualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMEmpleadosActualizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup btngroupTipoUsuario;
    private javax.swing.JComboBox<String> cbxproductosTIpoBusqueda;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblImageFondo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblimageCASA;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel panEmpleados;
    private javax.swing.JTable tEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
