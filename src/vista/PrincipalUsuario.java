package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.Carro;
import model.carroDAO;
import controller.carsController;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import model.Compra;
import model.Sesion;
import model.Usuario;
import vista.InicioSesion;
import vista.compraFase;

   
public class PrincipalUsuario extends JFrame {
    private JTextField precioTextField; 
    private carroDAO CarroDAO;
    private String identificacionUsuario;
    private JTable comprasUsuarioTabla;
   
    
    

    public PrincipalUsuario(String identificacionUsuario) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        comprasUsuarioTabla = new JTable();
        this.CarroDAO = new carroDAO();
        this.identificacionUsuario = identificacionUsuario;
        cargarComprasEnTabla(identificacionUsuario);

      
        int idCarroInicial = 6;
        cargarPrecioCarro(idCarroInicial);
        
      
        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        CierreSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        principal = new javax.swing.JTabbedPane();
        onFirex = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Comprar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        FirePrecio = new javax.swing.JTextField();
        Amngrey = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        modelo2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        Comprar1 = new javax.swing.JButton();
        GreyPrecio = new javax.swing.JTextField();
        whiback = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        modelo3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Comprar2 = new javax.swing.JButton();
        BuzzPrecio = new javax.swing.JTextField();
        BigBuzz = new javax.swing.JPanel();
        modelo4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Comprar3 = new javax.swing.JButton();
        DecPrecio = new javax.swing.JTextField();
        DecBwom = new javax.swing.JPanel();
        modelo5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        Comprar4 = new javax.swing.JButton();
        MiniPrecio = new javax.swing.JTextField();
        AllBarbie = new javax.swing.JPanel();
        modelo6 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BarbiePrecio = new javax.swing.JTextField();
        historial = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        compraUsuarioTabla = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

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
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 47, 185, 58));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1120, 110));

        onFirex.setBackground(new java.awt.Color(255, 255, 255));
        onFirex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onFirexMouseClicked(evt);
            }
        });
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

        FirePrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirePrecioActionPerformed(evt);
            }
        });
        onFirex.add(FirePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 190, 30));

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
        Amngrey.add(GreyPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 112, 190, 30));

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

        BuzzPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuzzPrecioActionPerformed(evt);
            }
        });
        whiback.add(BuzzPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 112, 190, 30));

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
        BigBuzz.add(DecPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 112, 190, 30));

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
        DecBwom.add(MiniPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 112, 190, 30));

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
        AllBarbie.add(BarbiePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 112, 190, 30));

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
        
         int idCarroSeleccionado = 6;

        try {
            cargarPrecioCarro(idCarroSeleccionado);
        } catch (Exception e) {
        }
      
        
        
        
        
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
        Carro carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado,identificacionUsuario);
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
        Carro carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
                this.dispose();
                compraFase cf = new compraFase(carroSeleccionado,identificacionUsuario);
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
        Carro carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

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
        Carro carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

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
        Carro carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

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
        Carro carroSeleccionado = controller.obtenerDatosCarro(modeloCarro);

        if (carroSeleccionado != null) {
            if (carroSeleccionado.getCantidad() > 0) {
             
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

    }//GEN-LAST:event_CierreSesionActionPerformed
    }
    
    
    private void BuzzPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuzzPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuzzPrecioActionPerformed

    private void FirePrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirePrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirePrecioActionPerformed

    private void onFirexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onFirexMouseClicked
         
   int idCarroSeleccionado = 6; 

        try {
          cargarPrecioCarro(idCarroSeleccionado);   
        } catch (Exception e) {
        }
      
       
        
        
    }//GEN-LAST:event_onFirexMouseClicked
    
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
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Usuario usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
                if (usuarioActual != null) {
                    String identificacionUsuario = usuarioActual.getIdentificacion();
                    try {
                        new PrincipalUsuario(identificacionUsuario).setVisible(true);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No hay usuario autenticado.");
                }
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllBarbie;
    private javax.swing.JPanel Amngrey;
    private javax.swing.JTextField BarbiePrecio;
    private javax.swing.JPanel BigBuzz;
    private javax.swing.JTextField BuzzPrecio;
    private javax.swing.JButton CierreSesion;
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Comprar1;
    private javax.swing.JButton Comprar2;
    private javax.swing.JButton Comprar3;
    private javax.swing.JButton Comprar4;
    private javax.swing.JPanel DecBwom;
    private javax.swing.JTextField DecPrecio;
    private javax.swing.JTextField FirePrecio;
    private javax.swing.JTextField GreyPrecio;
    private javax.swing.JTextField MiniPrecio;
    private javax.swing.JTable compraUsuarioTabla;
    private javax.swing.JPanel historial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
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

    
    private void mostrarPrecioDelCarro(int idCarro) {
        double precio = CarroDAO.obtenerPrecioPorId(idCarro); 
        precioTextField.setText(String.format("%.2f", precio)); 
    }
    
     private void cargarPrecioCarro(int idCarro)  throws SQLException  {
    
          double precio = CarroDAO.obtenerPrecioPorId(idCarro);
           FirePrecio.setText(String.format("%.2f", precio));
       
            
        }
    }




