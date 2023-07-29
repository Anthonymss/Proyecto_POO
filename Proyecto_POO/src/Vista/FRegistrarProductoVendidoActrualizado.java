package Vista;
import Persona.Cliente;
import Producto.Andadores;
import Producto.CamaClinica;
import Producto.Camillas;
import Producto.Producto;
import Producto.ProductoNUEVOS;
import Producto.Rehabilitacion;
import Producto.SillaRuedas;
import Venta.Venta;
import Controlador.ControladorCliente2;
import Controlador.ControladorProductos;
import Controlador.ControladorRegistrarVenta;
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public final class FRegistrarProductoVendidoActrualizado extends javax.swing.JFrame {
    ControladorCliente2 controladorcliente=new ControladorCliente2();
    ControladorProductos controladorproducto=new ControladorProductos();
    Producto producto=new Producto();
    Cliente cliente=new Cliente();
    Venta venta=new Venta();
    DecimalFormat formato =new DecimalFormat("#.###");
    public FRegistrarProductoVendidoActrualizado() {
        initComponents();
        cargarcliente();
        cargarproducto();
        definirColorEncabezados();
        lblOfertaANDlblMensaje();
        this.setLocationRelativeTo(null);

            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panProductosVendidos = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatosCliente = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        lblDni2 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDni2 = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProductos = new javax.swing.JTable();
        txtNroSerie = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JButton();
        btnAnadirProducto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblResumenProductos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tResumenProductos = new javax.swing.JTable();
        btnEliminarProducto = new javax.swing.JButton();
        lblPrecioTotal = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        imagenCasa = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        lblImagefondo = new javax.swing.JLabel();
        lblProductosOFERTA = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        cbxProducto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panProductosVendidos.setBackground(new java.awt.Color(0, 153, 153));
        panProductosVendidos.setForeground(new java.awt.Color(0, 0, 0));
        panProductosVendidos.setPreferredSize(new java.awt.Dimension(1243, 662));

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        tDatosCliente.setBackground(new java.awt.Color(0, 0, 0));
        tDatosCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tDatosCliente.setForeground(new java.awt.Color(255, 255, 255));
        tDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDatosCliente.setGridColor(new java.awt.Color(0, 0, 0));
        tDatosCliente.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tDatosCliente.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tDatosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDatosClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tDatosCliente);

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblDni2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDni2.setForeground(new java.awt.Color(0, 0, 0));
        lblDni2.setText("DNI:");

        lblNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("Nombres: ");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
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
                "Nro Serie", "Producto", "Modelo", "Stock", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tProductos.setGridColor(new java.awt.Color(0, 0, 0));
        tProductos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tProductos);

        txtNroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroSerieActionPerformed(evt);
            }
        });

        btnBuscar2.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setText("Buscar");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        btnAnadirProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnAnadirProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAnadirProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAnadirProducto.setText("Añadir al Carrito");
        btnAnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirProductoActionPerformed(evt);
            }
        });

        lblResumenProductos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblResumenProductos.setForeground(new java.awt.Color(0, 0, 0));
        lblResumenProductos.setText("Resumen Productos");

        tResumenProductos.setBackground(new java.awt.Color(0, 0, 0));
        tResumenProductos.setForeground(new java.awt.Color(255, 255, 255));
        tResumenProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nro Serie", "Producto", "Modelo", "Precio", "Cantidad", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tResumenProductos.setGridColor(new java.awt.Color(0, 0, 0));
        tResumenProductos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tResumenProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tResumenProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tResumenProductosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tResumenProductosMouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(tResumenProductos);

        btnEliminarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        lblPrecioTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecioTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioTotal.setText("Precio Total :");

        btnRegistrarVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.setRequestFocusEnabled(false);
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(204, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("0.0");
        lblTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lblTotal.setOpaque(true);

        imagenCasa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        imagenCasa.setForeground(new java.awt.Color(0, 0, 0));
        imagenCasa.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\casa.png"));
        imagenCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagenCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenCasaMouseClicked(evt);
            }
        });

        mensaje.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));

        lblImagefondo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\resoucers\\img\\ventaa.jpg"));

        lblProductosOFERTA.setBackground(new java.awt.Color(0, 0, 0));
        lblProductosOFERTA.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellido", "Distrito" }));

        cbxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nro.Serie", "Categoria" }));

        javax.swing.GroupLayout panProductosVendidosLayout = new javax.swing.GroupLayout(panProductosVendidos);
        panProductosVendidos.setLayout(panProductosVendidosLayout);
        panProductosVendidosLayout.setHorizontalGroup(
            panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                        .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                        .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                        .addComponent(lblDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnAnadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosVendidosLayout.createSequentialGroup()
                                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosVendidosLayout.createSequentialGroup()
                                                .addComponent(lblPrecioTotal)
                                                .addGap(27, 27, 27)
                                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(lblResumenProductos))
                                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(lblProductosOFERTA, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(402, 402, 402)))
                                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagenCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panProductosVendidosLayout.createSequentialGroup()
                    .addComponent(lblImagefondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panProductosVendidosLayout.setVerticalGroup(
            panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosVendidosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni2)
                            .addComponent(txtDni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombres))
                        .addGap(18, 18, 18)
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidos))
                        .addGap(73, 73, 73)))
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar2)))
                    .addComponent(cbxProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResumenProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panProductosVendidosLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panProductosVendidosLayout.createSequentialGroup()
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductosOFERTA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panProductosVendidosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAnadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(panProductosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagefondo, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panProductosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panProductosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void lblOfertaANDlblMensaje(){
        //obtener la fecha del sistema
        LocalDate fechaActual = LocalDate.now();
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        //Convertir  DIAS a Español 
        String nombreDiaSemana = diaSemana.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES"));
        String tipoProducto;
        tipoProducto = switch (nombreDiaSemana) {
            case "lunes" -> "Andadores";
            case "martes" -> "Cama Clinica";
            case "miércoles" -> "Camillas";
            case "jueves" -> "Rehabilitacion";
            default -> "Silla de Ruedas";
        };
        System.out.println("Dia de Oferta Producto es:"+nombreDiaSemana);
        lblProductosOFERTA.setText("Es "+nombreDiaSemana.toUpperCase()+": Hay descuento"+" en "+tipoProducto.toUpperCase()+"!!!");
        mensaje.setText("REGISTRAR VENTA   Usuario: "+Controlador.ControladorIngreso.DatosEmpleado());
    }
    private void definirColorEncabezados(){
        JTableHeader header = tProductos.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink); 
            return component;}});
        JTableHeader header1 = tDatosCliente.getTableHeader();
        header1.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink); 
            return component;}});
        JTableHeader header2 = tResumenProductos.getTableHeader();
        header2.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(Color.DARK_GRAY); 
            component.setForeground(Color.pink); 
            return component;}});
        jScrollPane1.getViewport().setBackground(Color.black);
        jScrollPane2.getViewport().setBackground(Color.black);
        jScrollPane3.getViewport().setBackground(Color.black);
        
        }
    private double sumarSubtotales() {
    DefaultTableModel model = (DefaultTableModel) tResumenProductos.getModel();
    int rowCount = model.getRowCount();
    double total = 0.0;
    for (int row = 0; row < rowCount; row++) {
        Object subtotalObj = model.getValueAt(row, 5);
        if (subtotalObj != null) {
            double subtotal = Double.parseDouble(subtotalObj.toString());
            total += subtotal;}
    }    
    return Double.parseDouble(formato.format(total).replace(",", "."));
}
    private void calcularSubtotales() {
    DefaultTableModel model = (DefaultTableModel) tResumenProductos.getModel();
    int rowCount = model.getRowCount();
    for (int row = 0; row < rowCount; row++) {
        Object precioObj = model.getValueAt(row, 3);
        Object cantidadObj = model.getValueAt(row, 4);
        Object categoriaobj=model.getValueAt(row, 1);
        if (precioObj != null && cantidadObj != null) {
            double precio = Double.parseDouble(precioObj.toString());
            int cantidad = Integer.parseInt(cantidadObj.toString());
            String TIPOCAT=String.valueOf(categoriaobj.toString());
            System.out.println("CATEGORIA EN LA TABLA ES: "+TIPOCAT);
            Double subtotal;
            //double subtotal = precio * cantidad;//(Antes era referencial)
            //ahora mas preciso :)
            switch(TIPOCAT){
            case "Camilla":
                Producto camilla=new Camillas();
                subtotal=camilla.SubtotalProducto(precio,cantidad);
            break;
            case "Andador":
                Producto andador=new Andadores();
                subtotal=andador.SubtotalProducto(precio,cantidad);

            break;
            case "Cama clinica":
                Producto cama=new CamaClinica();
                subtotal=cama.SubtotalProducto(precio,cantidad);
            break;
            case "Rehabilitacion":
                Producto reah=new Rehabilitacion();
                subtotal=reah.SubtotalProducto(precio,cantidad);
            break;
            case "Silla de Ruedas":
                Producto silla=new SillaRuedas();
                subtotal=silla.SubtotalProducto(precio,cantidad);
            break;
            default:
                //categoria agregada no definida
                Producto nuevos=new ProductoNUEVOS();
                subtotal=nuevos.SubtotalProducto(precio,cantidad);
        }
            model.setValueAt(subtotal, row, 5);}}}
    private boolean ValidarCampos(){
    boolean f=false;
    if(!"".equals(txtDni2.getText())&&!"".equals(txtApellidos.getText())&&!"".equals(txtNombres.getText())&&tResumenProductos.getRowCount()!=0&&!"0.0".equals(lblTotal.getText())){
    f=true;
    }
    return f;
    }
    private void txtDni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDni2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDni2ActionPerformed
    private void cargarcliente(){
    DefaultTableModel modeloTabla = new DefaultTableModel();
    tDatosCliente.setModel(modeloTabla);
    String campo = txtDni.getText();
    String busquedaC=String.valueOf(cbxCliente.getSelectedItem()).trim();
    try {
        controladorcliente.cargarTabla(tDatosCliente, campo,busquedaC, cliente);
        System.out.println("Tabla cargada correctamente");
    } catch (Exception e) {
        System.err.println("Error al cargar la tabla: " + e);}

    }
    private void cargarproducto(){
        DefaultTableModel modeloTabla1 = new DefaultTableModel();
        tProductos.setModel(modeloTabla1);
        String campo = txtNroSerie.getText();
        String busquedaP=String.valueOf(cbxProducto.getSelectedItem()).trim();
        try {
            controladorproducto.cargarTabla(tProductos, campo,busquedaP, producto);
            System.out.println("Tabla cargada correctamente");
        } catch (Exception e) {
            System.err.println("Error al cargar la tabla: " + e);}
    }
    private void tDatosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDatosClienteMouseClicked
        try {
        int fila = tDatosCliente.getSelectedRow();
        String dni = tDatosCliente.getValueAt(fila, 0).toString();

        cliente = controladorcliente.buscarPorId(Integer.parseInt(dni));

        if (cliente != null) {
            txtDni2.setText(cliente.getDNI());
            txtNombres.setText(cliente.getNombre());
            txtApellidos.setText(cliente.getApellidos());
        }
    } catch (Exception e) {
        System.err.println("Error: " + e);
    }
    }//GEN-LAST:event_tDatosClienteMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cargarcliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductosMouseClicked
        try {
            int fila = tProductos.getSelectedRow();
            String serie = tProductos.getValueAt(fila, 0).toString();
            producto = controladorproducto.buscarPorId(Integer.parseInt(serie));
        } catch (Exception e) {
            System.err.println("Error: " + e);}
    }//GEN-LAST:event_tProductosMouseClicked

    private void btnAnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirProductoActionPerformed
    int selectedRow = tProductos.getSelectedRow();
    if (selectedRow != -1) {
        Object[] rowData = new Object[4];
        for (int i = 0; i < 4; i++) {
            rowData[i] = tProductos.getValueAt(selectedRow, i);
        }
        // copea los datos a la tabla resumendeproductos 
        DefaultTableModel modeloSeleccion = (DefaultTableModel) tResumenProductos.getModel();
        Object[] rowDataSeleccion = new Object[5];
        System.arraycopy(rowData, 0, rowDataSeleccion, 0, 4);
        modeloSeleccion.insertRow(0,rowDataSeleccion);
        //cambiar color a la columna cantidad
        TableColumn cantidadColumn = tResumenProductos.getColumnModel().getColumn(4);
        cantidadColumn.setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cellComponent.setForeground(Color.yellow);
                return cellComponent;
            }
        });
    }
    }//GEN-LAST:event_btnAnadirProductoActionPerformed

    private void txtNroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroSerieActionPerformed
    
    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int selectedRow = tResumenProductos.getSelectedRow();
        if (selectedRow != -1) {
            // va a eliminar la fila seleccionada
            DefaultTableModel modeloSeleccion = (DefaultTableModel) tResumenProductos.getModel();
            modeloSeleccion.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
    System.out.println("PRECIO: "+lblTotal.getText());
    if(ValidarCampos()){
    int idcliente = Integer.parseInt(txtDni2.getText());
    int idEmpleado =Controlador.ControladorRegistrarVenta.obtenerIdEmpleadoActivo();
    //System.out.println("Realiza venta id de Empleado es : "+idEmpleado);
    int nroVenta = 69;
    venta.setCliente(idcliente);
    venta.setIdEmpleado(idEmpleado);
    venta.setNroVenta(nroVenta);
    int idventa=ControladorRegistrarVenta.RegistrarVenta(venta);
    for (int i = 0; i < tResumenProductos.getRowCount(); i++) {
        Object serieP = tResumenProductos.getValueAt(i, 0);
        Object cantidadPro = tResumenProductos.getValueAt(i, 4);
        if (serieP != null && cantidadPro != null) {
            int seriee = Integer.parseInt(serieP.toString());
            int cantidad = Integer.parseInt(cantidadPro.toString());
           // System.out.println("iD ES"+idventa);
            //System.out.println("NUMERO SERIE " + seriee+ "\nCANTIDAD:  "+ cantidad);
            if(Controlador.ControladorRegistrarVenta.insertarProductosEnLaVenta(idventa,seriee, cantidad)){
            // una validacion si el metodo retorna true la operacion se llevo con exito y no hay errores
            // Entonces pasa a este metodo para actualiza el stock 
            Controlador.ControladorRegistrarVenta.actualizarStock(seriee, cantidad);//actualiza el stck
            }else{
            JOptionPane.showMessageDialog(null, "Se produjo un error en la inserccion de Productos a la venta"+idventa);
            }
            cargarproducto();
    }}
    Controlador.ControladorRegistrarVenta.ventaTerminada(idventa);//Si todo esta bien llama a este metodo el cual finaliza la venta guardando datos de los totales como igv , totalprecio y descuentos totales
    JOptionPane.showMessageDialog(null, "Venta Realizada con exito :)");}
    else{
    JOptionPane.showMessageDialog(null, "Complete los campos Necesarios");
    }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void tResumenProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tResumenProductosMouseExited
    }//GEN-LAST:event_tResumenProductosMouseExited

    private void tResumenProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tResumenProductosMouseClicked
        calcularSubtotales();
        double totalfinal =sumarSubtotales();
        lblTotal.setText(String.valueOf(totalfinal));
    }//GEN-LAST:event_tResumenProductosMouseClicked

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        cargarproducto();
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void imagenCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenCasaMouseClicked
       if(Controlador.ControladorIngreso.UsuarioActivo().equalsIgnoreCase("Administrador")){
       new FMenuAdmin().setVisible(true);
       this.dispose();
       }else{
       new FMenuEmpleado().setVisible(true);
       this.dispose();
       }
    }//GEN-LAST:event_imagenCasaMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed
    
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
            java.util.logging.Logger.getLogger(FRegistrarProductoVendidoActrualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRegistrarProductoVendidoActrualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRegistrarProductoVendidoActrualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRegistrarProductoVendidoActrualizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRegistrarProductoVendidoActrualizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JLabel imagenCasa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDni2;
    private javax.swing.JLabel lblImagefondo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblProductosOFERTA;
    private javax.swing.JLabel lblResumenProductos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel panProductosVendidos;
    private javax.swing.JTable tDatosCliente;
    private javax.swing.JTable tProductos;
    private javax.swing.JTable tResumenProductos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDni2;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNroSerie;
    // End of variables declaration//GEN-END:variables
}
