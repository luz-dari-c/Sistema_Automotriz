package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.car;
import model.carroDAO;
import controller.carsController;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Compra;
import model.Sesion;
import model.UsuarioDao;
import model.userModified;
import model.usuarios;
import vista.InicioSesion;
import vista.compraFase;

public class pruebaPrincipal extends javax.swing.JFrame {

    private String identificacionUsuario;
    private JTable comprasUsuarioTabla;
    private car carroSeleccionado;

    public pruebaPrincipal(String identificacionUsuario) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        comprasUsuarioTabla = new javax.swing.JTable();
        this.identificacionUsuario = identificacionUsuario; // Guarda el identificador
        setLocationRelativeTo(null);
        cargarComprasEnTabla(identificacionUsuario);
    }

    //private pruebaPrincipal() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from //nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        CierreSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        principal = new javax.swing.JTabbedPane();
        onFirex = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Comprar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        VerPrecio1 = new javax.swing.JButton();
        FirePrecio = new javax.swing.JLabel();
        Amngrey = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        modelo2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        Comprar1 = new javax.swing.JButton();
        VerPrecio2 = new javax.swing.JButton();
        GreyPrecio = new javax.swing.JLabel();
        whiback = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        modelo3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Comprar2 = new javax.swing.JButton();
        VerPrecio3 = new javax.swing.JButton();
        BuzzPrecio = new javax.swing.JLabel();
        BigBuzz = new javax.swing.JPanel();
        modelo4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Comprar3 = new javax.swing.JButton();
        VerPrecio4 = new javax.swing.JButton();
        DecPrecio = new javax.swing.JLabel();
        DecBwom = new javax.swing.JPanel();
        modelo5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        Comprar4 = new javax.swing.JButton();
        VerPrecio5 = new javax.swing.JButton();
        MiniPrecio = new javax.swing.JLabel();
        AllBarbie = new javax.swing.JPanel();
        modelo6 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        VerPrecio6 = new javax.swing.JButton();
        BarbiePrecio = new javax.swing.JLabel();
        historial = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        compraUsuarioTabla = new javax.swing.JTable();
        InformacionUsuario = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        CorreoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        IdentificacionLabel = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        NuevaContraseña = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        ModificarInformacionDeUsuario = new javax.swing.JButton();
        ContraseñaDelUsuario = new javax.swing.JTextField();
        NuevoNombre = new javax.swing.JTextField();
        NuevoApellido = new javax.swing.JTextField();
        NuevoUsuario = new javax.swing.JTextField();
        NuevoCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1341, 6, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 94, 329, -1));

        CierreSesion.setBackground(new java.awt.Color(0, 0, 0));
        CierreSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        CierreSesion.setText("Cerrar Sesion");
        CierreSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CierreSesionActionPerformed(evt);
            }
        });
        jPanel2.add(CierreSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.png"))); // NOI18N
        jLabel6.setText("  Mis Compras");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, -1, 58));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jLabel7.setText("Usuario");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1120, 110));

        onFirex.setBackground(new java.awt.Color(255, 255, 255));
        onFirex.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo_1.png"))); // NOI18N
        onFirex.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 620, 380));

        labelModelo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(0, 0, 0));
        labelModelo.setText("VLX-Fire");
        onFirex.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Deslumbrante y versatil.");
        onFirex.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Completamente 0 km.");
        onFirex.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jPanel17.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        onFirex.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 10));

        Comprar.setBackground(new java.awt.Color(102, 0, 0));
        Comprar.setForeground(new java.awt.Color(255, 255, 255));
        Comprar.setText("Comprar");
        Comprar.setFocusCycleRoot(true);
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        onFirex.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));
        onFirex.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        VerPrecio1.setText("Ver más información");
        VerPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrecio1ActionPerformed(evt);
            }
        });
        onFirex.add(VerPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        FirePrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FirePrecio.setForeground(new java.awt.Color(0, 0, 0));
        onFirex.add(FirePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        principal.addTab("OnFirex", onFirex);

        Amngrey.setBackground(new java.awt.Color(255, 255, 255));
        Amngrey.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gris_1.png"))); // NOI18N
        jLabel4.setText("jaja");
        Amngrey.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 580, -1));

        modelo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        modelo2.setForeground(new java.awt.Color(0, 0, 0));
        modelo2.setText("VLX-Grey");
        Amngrey.add(modelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Minimalista y elegante.");
        Amngrey.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Completamente 0 km.");
        Amngrey.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Amngrey.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 10));

        Comprar1.setBackground(new java.awt.Color(102, 0, 0));
        Comprar1.setForeground(new java.awt.Color(255, 255, 255));
        Comprar1.setText("Comprar");
        Comprar1.setFocusCycleRoot(true);
        Comprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprar1ActionPerformed(evt);
            }
        });
        Amngrey.add(Comprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        VerPrecio2.setText("Ver más información");
        VerPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrecio2ActionPerformed(evt);
            }
        });
        Amngrey.add(VerPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        GreyPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GreyPrecio.setForeground(new java.awt.Color(0, 0, 0));
        Amngrey.add(GreyPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        principal.addTab("Amngrey", Amngrey);

        whiback.setBackground(new java.awt.Color(255, 255, 255));
        whiback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whiteback-removebg-preview (1).png"))); // NOI18N
        whiback.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, 740, 380));

        modelo3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        modelo3.setForeground(new java.awt.Color(0, 0, 0));
        modelo3.setText("VLX-Buzz");
        whiback.add(modelo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Simplemente volatil.");
        whiback.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        whiback.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 10));

        Comprar2.setBackground(new java.awt.Color(102, 0, 0));
        Comprar2.setForeground(new java.awt.Color(255, 255, 255));
        Comprar2.setText("Comprar");
        Comprar2.setFocusCycleRoot(true);
        Comprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprar2ActionPerformed(evt);
            }
        });
        whiback.add(Comprar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        VerPrecio3.setText("Ver más información");
        VerPrecio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrecio3ActionPerformed(evt);
            }
        });
        whiback.add(VerPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        BuzzPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BuzzPrecio.setForeground(new java.awt.Color(0, 0, 0));
        whiback.add(BuzzPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        principal.addTab("Whiback", whiback);

        BigBuzz.setBackground(new java.awt.Color(255, 255, 255));
        BigBuzz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modelo4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        modelo4.setForeground(new java.awt.Color(0, 0, 0));
        modelo4.setText("VLX-DEC");
        BigBuzz.add(modelo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        BigBuzz.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 10));

        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Misterioso y encantador");
        BigBuzz.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro_1.png"))); // NOI18N
        BigBuzz.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 680, 380));

        Comprar3.setBackground(new java.awt.Color(102, 0, 0));
        Comprar3.setForeground(new java.awt.Color(255, 255, 255));
        Comprar3.setText("Comprar");
        Comprar3.setFocusCycleRoot(true);
        Comprar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprar3ActionPerformed(evt);
            }
        });
        BigBuzz.add(Comprar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, -1, -1));

        VerPrecio4.setText("Ver más información");
        VerPrecio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrecio4ActionPerformed(evt);
            }
        });
        BigBuzz.add(VerPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        DecPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DecPrecio.setForeground(new java.awt.Color(0, 0, 0));
        BigBuzz.add(DecPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        principal.addTab("BigBuzz", BigBuzz);

        DecBwom.setBackground(new java.awt.Color(255, 255, 255));
        DecBwom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modelo5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        modelo5.setForeground(new java.awt.Color(0, 0, 0));
        modelo5.setText("VLX-Mini");
        DecBwom.add(modelo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jPanel15.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        DecBwom.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 10));

        jLabel50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Naturalmente veloz.");
        DecBwom.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mazdamarron_2.png"))); // NOI18N
        DecBwom.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 590, 350));

        Comprar4.setBackground(new java.awt.Color(102, 0, 0));
        Comprar4.setForeground(new java.awt.Color(255, 255, 255));
        Comprar4.setText("Comprar");
        Comprar4.setFocusCycleRoot(true);
        Comprar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprar4ActionPerformed(evt);
            }
        });
        DecBwom.add(Comprar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        VerPrecio5.setText("Ver más información");
        VerPrecio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrecio5ActionPerformed(evt);
            }
        });
        DecBwom.add(VerPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        MiniPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MiniPrecio.setForeground(new java.awt.Color(0, 0, 0));
        DecBwom.add(MiniPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        principal.addTab("DecBwom", DecBwom);

        AllBarbie.setBackground(new java.awt.Color(255, 255, 255));
        AllBarbie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modelo6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        modelo6.setForeground(new java.awt.Color(0, 0, 0));
        modelo6.setText("VLX-Barbie");
        AllBarbie.add(modelo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        AllBarbie.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 190, 10));

        jLabel54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Tierno y todoterreno.");
        AllBarbie.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/11autosrosasbe57-723aa14af80691adeed3baca60565b72-1200x0-removebg-preview.png"))); // NOI18N
        AllBarbie.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 540, 380));

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AllBarbie.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        VerPrecio6.setText("Ver más información");
        VerPrecio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrecio6ActionPerformed(evt);
            }
        });
        AllBarbie.add(VerPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        BarbiePrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BarbiePrecio.setForeground(new java.awt.Color(0, 0, 0));
        AllBarbie.add(BarbiePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        principal.addTab("AllBarbie", AllBarbie);

        historial.setBackground(new java.awt.Color(255, 255, 255));
        historial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Sus compras:");
        historial.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 40));

        compraUsuarioTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Auto", "Placa", "Precio Auto", "Fecha Compra", "Total", "Cantidad", "Nombre", "Apellido", "Identificación"
            }
        ));
        jScrollPane2.setViewportView(compraUsuarioTabla);

        historial.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 800, 400));

        principal.addTab("Historial", historial);

        InformacionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        InformacionUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Correo electronico:");
        jPanel19.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Nombre:");
        jPanel19.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Apellido:");
        jPanel19.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Identificación:");
        jPanel19.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Usuario:");
        jPanel19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        CorreoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CorreoLabel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel19.add(CorreoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 30));

        NombreLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel19.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 30));

        ApellidoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel19.add(ApellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 30));

        IdentificacionLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IdentificacionLabel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel19.add(IdentificacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 30));

        UsuarioLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel19.add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 30));

        InformacionUsuario.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 400));

        jButton2.setText("Refrescar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        InformacionUsuario.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Modificar informacion de usuario");
        InformacionUsuario.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel43.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("INFORMACIÓN DE USUARIO");
        InformacionUsuario.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, -1));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Ingrese los nuevos datos:");
        InformacionUsuario.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));
        InformacionUsuario.add(NuevaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 190, 30));

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Ingrese su contraseña:");
        InformacionUsuario.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Nueva contraseña:");
        InformacionUsuario.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Nuevo nombre:");
        InformacionUsuario.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Nuevo apellido");
        InformacionUsuario.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, 20));

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Nuevo usuario:");
        InformacionUsuario.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Nuevo correo:");
        InformacionUsuario.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, 20));

        ModificarInformacionDeUsuario.setText("Modificar");
        ModificarInformacionDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarInformacionDeUsuarioActionPerformed(evt);
            }
        });
        InformacionUsuario.add(ModificarInformacionDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));
        InformacionUsuario.add(ContraseñaDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 190, 30));
        InformacionUsuario.add(NuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 190, 30));
        InformacionUsuario.add(NuevoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 190, 30));
        InformacionUsuario.add(NuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 190, 30));
        InformacionUsuario.add(NuevoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 190, 30));

        principal.addTab("tab8", InformacionUsuario);

        jPanel1.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 570));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chiquitowhite__1_-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VLX-Dec");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Simplemente volatil.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("$190.000.000");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, 80));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RT_V_a209bdf9b16d479c8ff719d5c6abef03-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("VLX-Fire");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Deslumbrante y versatil.");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("$121.000.000");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 270, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/11autosrosasbe57-723aa14af80691adeed3baca60565b72-1200x0-removebg-preview (1).png"))); // NOI18N
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("VLX-Barbie");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tierno y todoterreno.");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel16.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("$224.000.000");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, 100));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bmw-serie-2-grand-coupe_15-removebg-preview.png"))); // NOI18N
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("VLX-Grey");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Minimalista y elegante.");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("$149.000.000");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 80));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RT_V_b3ea4181a38b490a88f829fee57ecfe3-removebg-preview.png"))); // NOI18N
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("VLX-Buzz");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Misterioso y encantador.");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("$180.000.000");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 90));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mazdamarron.png"))); // NOI18N
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 80));

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("VLX-Mini");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Naturalmente veloz.");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel28.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("$130.000.000");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 80));

        jScrollPane1.setViewportView(jPanel4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 61, 290, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        principal.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        principal.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        principal.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        principal.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        principal.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(Color.GRAY);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        principal.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(Color.GRAY);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        principal.setSelectedIndex(5);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(Color.GRAY);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        principal.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(Color.GRAY);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        principal.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        jPanel10.setBackground(Color.GRAY);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        jPanel10.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        principal.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        jPanel11.setBackground(Color.GRAY);
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        jPanel11.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel11MouseExited

    private void Comprar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprar4ActionPerformed
        String modeloCarro = modelo5.getText().trim();
        JOptionPane.showMessageDialog(null, "Modelo obtenido: " + modeloCarro);

        carsController controller = new carsController();
        car carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado, identificacionUsuario);
                cf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay unidades disponibles para este carro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el carro seleccionado.");
        }

    }//GEN-LAST:event_Comprar4ActionPerformed

    private void Comprar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprar3ActionPerformed
        String modeloCarro = modelo4.getText().trim();
        JOptionPane.showMessageDialog(null, "Modelo obtenido: " + modeloCarro);

        carsController controller = new carsController();
        car carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado, identificacionUsuario);
                cf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay unidades disponibles para este carro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el carro seleccionado.");
        }

    }//GEN-LAST:event_Comprar3ActionPerformed

    private void Comprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprar2ActionPerformed
        String modeloCarro = modelo3.getText().trim();
        JOptionPane.showMessageDialog(null, "Modelo obtenido: " + modeloCarro);

        carsController controller = new carsController();
        car carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado, identificacionUsuario);
                cf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay unidades disponibles para este carro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el carro seleccionado.");
        }

    }//GEN-LAST:event_Comprar2ActionPerformed

    private void Comprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprar1ActionPerformed
        String modeloCarro = modelo2.getText().trim();
        JOptionPane.showMessageDialog(null, "Modelo obtenido: " + modeloCarro);

        carsController controller = new carsController();
        car carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {

                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado, identificacionUsuario);
                cf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay unidades disponibles para este carro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el carro seleccionado.");
        }

    }//GEN-LAST:event_Comprar1ActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        String modeloCarro = labelModelo.getText().trim();
        JOptionPane.showMessageDialog(null, "Modelo obtenido: " + modeloCarro);

        carsController controller = new carsController();
        car carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {

                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado, identificacionUsuario);
                cf.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay unidades disponibles para este carro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el carro seleccionado.");
        }


    }//GEN-LAST:event_ComprarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String modeloCarro = modelo6.getText().trim();
        JOptionPane.showMessageDialog(null, "Modelo obtenido: " + modeloCarro);

        carsController controller = new carsController();
        car carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado, identificacionUsuario);
                cf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay unidades disponibles para este carro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el carro seleccionado.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CierreSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CierreSesionActionPerformed

        int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            this.dispose();

            InicioSesion is = new InicioSesion();
            is.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Cierre de sesión cancelado.");
        }
    }//GEN-LAST:event_CierreSesionActionPerformed

    private void VerPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrecio1ActionPerformed
        String modeloCarro = labelModelo.getText();

        if (modeloCarro == null || modeloCarro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay modelo de carro seleccionado.");
            return;
        }

        carroDAO dao = new carroDAO();

        try {
            double precio = dao.obtenerPrecioPorModelo(modeloCarro);
            FirePrecio.setText(String.format("%.2f", precio));
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el precio desde la base de datos.");
        }
    }//GEN-LAST:event_VerPrecio1ActionPerformed

    private void VerPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrecio2ActionPerformed
        String modeloCarro = modelo2.getText();

        if (modeloCarro == null || modeloCarro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay modelo de carro seleccionado.");
            return;
        }

        carroDAO dao = new carroDAO();

        try {
            double precio = dao.obtenerPrecioPorModelo(modeloCarro);
            GreyPrecio.setText(String.format("%.2f", precio));
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el precio desde la base de datos.");
    }    }//GEN-LAST:event_VerPrecio2ActionPerformed

    private void VerPrecio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrecio3ActionPerformed
        String modeloCarro = modelo3.getText();

        if (modeloCarro == null || modeloCarro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay modelo de carro seleccionado.");
            return;
        }

        carroDAO dao = new carroDAO();

        try {
            double precio = dao.obtenerPrecioPorModelo(modeloCarro);
            BuzzPrecio.setText(String.format("%.2f", precio));
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el precio desde la base de datos.");
    }       }//GEN-LAST:event_VerPrecio3ActionPerformed

    private void VerPrecio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrecio4ActionPerformed
        String modeloCarro = modelo4.getText();

        if (modeloCarro == null || modeloCarro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay modelo de carro seleccionado.");
            return;
        }

        carroDAO dao = new carroDAO();

        try {
            double precio = dao.obtenerPrecioPorModelo(modeloCarro);
            DecPrecio.setText(String.format("%.2f", precio));
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el precio desde la base de datos.");
    }       }//GEN-LAST:event_VerPrecio4ActionPerformed

    private void VerPrecio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrecio5ActionPerformed
        String modeloCarro = modelo5.getText();

        if (modeloCarro == null || modeloCarro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay modelo de carro seleccionado.");
            return;
        }

        carroDAO dao = new carroDAO();

        try {
            double precio = dao.obtenerPrecioPorModelo(modeloCarro);
            MiniPrecio.setText(String.format("%.2f", precio));
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el precio desde la base de datos.");
    }       }//GEN-LAST:event_VerPrecio5ActionPerformed

    private void VerPrecio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrecio6ActionPerformed
        String modeloCarro = modelo6.getText();

        if (modeloCarro == null || modeloCarro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay modelo de carro seleccionado.");
            return;
        }

        carroDAO dao = new carroDAO();

        try {
            double precio = dao.obtenerPrecioPorModelo(modeloCarro);
            BarbiePrecio.setText(String.format("%.2f", precio));
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el precio desde la base de datos.");
    }       }//GEN-LAST:event_VerPrecio6ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    principal.setSelectedIndex(7);    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDatosUsuario();     }//GEN-LAST:event_jButton2ActionPerformed

    private void ModificarInformacionDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarInformacionDeUsuarioActionPerformed
        String contraseñaActual = ContraseñaDelUsuario.getText().trim();
        String nuevoNombre = NuevoNombre.getText().trim();
        String nuevoApellido = NuevoApellido.getText().trim();
        String nuevoUsuario = NuevoUsuario.getText().trim();
        String nuevoCorreo = NuevoCorreo.getText().trim();
        String nuevaContrasena = NuevaContraseña.getText().trim();

        if (nuevoNombre.isEmpty() && nuevoApellido.isEmpty() && nuevoUsuario.isEmpty() && nuevoCorreo.isEmpty() && nuevaContrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe modificar al menos un campo.");
            return;
        }

        if (contraseñaActual.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese su contraseña actual.");
            return;
        }

        userModified modificador = new userModified();

        modificador.modificarDatosUsuario(identificacionUsuario, contraseñaActual, nuevoNombre, nuevoApellido, nuevoUsuario, nuevaContrasena, nuevoCorreo);

    }//GEN-LAST:event_ModificarInformacionDeUsuarioActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(pruebaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pruebaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pruebaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pruebaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                usuarios usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
                if (usuarioActual != null) {
                    String identificacionUsuario = usuarioActual.getIdentificacion();
                    try {
                        new pruebaPrincipal(identificacionUsuario).setVisible(true);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No hay usuario autenticado.");
                }
            }

        });
    }

    private void mostrarDatosUsuario() {
        try {
            UsuarioDao usuarioDao = new UsuarioDao();
            usuarios usuarioDetalles = usuarioDao.obtenerInformacionPorUsuario(identificacionUsuario);
            if (usuarioDetalles != null) {
                // Muestra los datos del usuario en las etiquetas (JLabels)
                NombreLabel.setText(usuarioDetalles.getNombre());
                ApellidoLabel.setText(usuarioDetalles.getApellidos());
                UsuarioLabel.setText(usuarioDetalles.getUser());
                CorreoLabel.setText(usuarioDetalles.getCorreo());
                IdentificacionLabel.setText(usuarioDetalles.getIdentificacion());
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener los datos del usuario: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllBarbie;
    private javax.swing.JPanel Amngrey;
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JLabel BarbiePrecio;
    private javax.swing.JPanel BigBuzz;
    private javax.swing.JLabel BuzzPrecio;
    private javax.swing.JButton CierreSesion;
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Comprar1;
    private javax.swing.JButton Comprar2;
    private javax.swing.JButton Comprar3;
    private javax.swing.JButton Comprar4;
    private javax.swing.JTextField ContraseñaDelUsuario;
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JPanel DecBwom;
    private javax.swing.JLabel DecPrecio;
    private javax.swing.JLabel FirePrecio;
    private javax.swing.JLabel GreyPrecio;
    private javax.swing.JLabel IdentificacionLabel;
    private javax.swing.JPanel InformacionUsuario;
    private javax.swing.JLabel MiniPrecio;
    private javax.swing.JButton ModificarInformacionDeUsuario;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NuevaContraseña;
    private javax.swing.JTextField NuevoApellido;
    private javax.swing.JTextField NuevoCorreo;
    private javax.swing.JTextField NuevoNombre;
    private javax.swing.JTextField NuevoUsuario;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JButton VerPrecio1;
    private javax.swing.JButton VerPrecio2;
    private javax.swing.JButton VerPrecio3;
    private javax.swing.JButton VerPrecio4;
    private javax.swing.JButton VerPrecio5;
    private javax.swing.JButton VerPrecio6;
    private javax.swing.JTable compraUsuarioTabla;
    private javax.swing.JPanel historial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel modelo2;
    private javax.swing.JLabel modelo3;
    private javax.swing.JLabel modelo4;
    private javax.swing.JLabel modelo5;
    private javax.swing.JLabel modelo6;
    private javax.swing.JPanel onFirex;
    private javax.swing.JTabbedPane principal;
    private javax.swing.JPanel whiback;
    // End of variables declaration//GEN-END:variables

    public void cargarComprasEnTabla(String identificacionUsuario) throws SQLException {
        carroDAO carroD = new carroDAO();
        List<Compra> listaCompras = carroD.obtenerComprasPorUsuario(identificacionUsuario);

        DefaultTableModel model = (DefaultTableModel) compraUsuarioTabla.getModel();
        model.setRowCount(0);

        for (Compra compra : listaCompras) {
            model.addRow(new Object[]{
                compra.getNombreAuto(),
                compra.getPlaca(),
                compra.getPrecioAuto(),
                compra.getFechaCompra(),
                compra.getTotal(),
                compra.getCantidad(),
                compra.getNombreUsuario(),
                compra.getApellidoUsuario(),
                compra.getIdentificacionUsuario()
            });
        }
    }
}
