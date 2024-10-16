
package vista;

import java.math.BigDecimal;
import controller.carsController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Compra;
import model.car;
import model.PlacaCarro;
import model.carDelete;
import model.carroDAO;

public class adminview extends javax.swing.JFrame {

   
    public adminview() throws SQLException {
        initComponents();
         setLocationRelativeTo(null); 
        cargarProfesoresEnTabla();
        iniciarOpciones();
        cargarComprasEnTabla();
 
    }

    public void iniciarOpciones() {
        JMenuItem aumentar = new JMenuItem("Agregar cantidad");
        JMenuItem eliminar = new JMenuItem("Eliminar cantidad");
     
        ppMenuTabla.add(aumentar);
        ppMenuTabla.add(eliminar);

        tablaAdministrador.setComponentPopupMenu(ppMenuTabla);
   
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tablaAdministrador.getSelectedRow();

                if (selectedRow != -1) { 
                    
                    String modelo = (String) tablaAdministrador.getValueAt(selectedRow, 1);

                    
                    int confirm = JOptionPane.showConfirmDialog(null, "Seguro de que deseas disminuir la cantidad", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                       
                        carroDAO crd = new carroDAO();
                        crd.disminuirCantidadCarro(modelo);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un carro a aumentar su cantidad.");
                }
            }
        });
       
        aumentar.addActionListener(new ActionListener(){
             @Override 
             public void actionPerformed(ActionEvent e) {
                int selectedRow = tablaAdministrador.getSelectedRow();

                if (selectedRow != +1) { 
                    
                    String modelo = (String) tablaAdministrador.getValueAt(selectedRow, 1);

                    
                    int confirm = JOptionPane.showConfirmDialog(null, "Seguro de que deseas aumentar la cantidad", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                       
                        carroDAO crd = new carroDAO();
                        crd.aumentarCantidad(modelo);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un carro al cual aumentar su cantidad.");
                }
            }
             
        });
  
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppMenuTabla = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        añadir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JLabel();
        inputPrecio = new javax.swing.JTextField();
        txtMarca1 = new javax.swing.JLabel();
        inputFechaRegistro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        inputColor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputKilometraje = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputTipoMotor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputAño1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdministrador = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InputPlacaEliminar = new javax.swing.JTextField();
        eliminarCarro = new javax.swing.JButton();
        venta = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ventasTbla = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        vendidodopanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CierreSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRACION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 42, 215, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 860, 110));

        añadir.setBackground(new java.awt.Color(255, 255, 255));
        añadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE LOS DATOS SOLICITADOS.");
        añadir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 30));

        inputMarca.setBackground(new java.awt.Color(0, 0, 0, 0));
        inputMarca.setForeground(new java.awt.Color(51, 51, 51));
        inputMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMarcaActionPerformed(evt);
            }
        });
        añadir.add(inputMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 290, 40));

        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.setText("Marca");
        añadir.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 320, 20));

        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.setText("Modelo");
        añadir.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 320, 20));

        inputModelo.setBackground(new java.awt.Color(0, 0, 0, 0));
        inputModelo.setForeground(new java.awt.Color(51, 51, 51));
        inputModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModeloActionPerformed(evt);
            }
        });
        añadir.add(inputModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 290, 40));

        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setText("Precio");
        añadir.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 320, 20));

        inputPrecio.setBackground(new java.awt.Color(0, 0, 0, 0));
        inputPrecio.setForeground(new java.awt.Color(51, 51, 51));
        inputPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecioActionPerformed(evt);
            }
        });
        añadir.add(inputPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 290, 40));

        txtMarca1.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca1.setText("FechaRegistro");
        añadir.add(txtMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 20));

        inputFechaRegistro.setBackground(new java.awt.Color(0, 0, 0, 0));
        inputFechaRegistro.setForeground(new java.awt.Color(51, 51, 51));
        inputFechaRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputFechaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFechaRegistroActionPerformed(evt);
            }
        });
        añadir.add(inputFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 290, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Agregar Automovil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        añadir.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        inputColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputColorActionPerformed(evt);
            }
        });
        añadir.add(inputColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 290, 40));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Color");
        añadir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 90, -1));

        inputKilometraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKilometrajeActionPerformed(evt);
            }
        });
        añadir.add(inputKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, 40));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Kilometraje");
        añadir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        inputTipoMotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        añadir.add(inputTipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 296, 290, 40));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo Motor");
        añadir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        añadir.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 290, 40));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Año");
        añadir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cantidad:");
        añadir.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        inputAño1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        añadir.add(inputAño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 290, 40));

        jTabbedPane1.addTab("Agregar", añadir);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        tablaAdministrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Año", "Precio", "Color", "Tipo Motor", "Fecha ingreso", "Kilometraje", "Placa", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAdministrador);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, 340));

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTabbedPane1.addTab("Disponibles", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("INGRESE LA PLACA DEL AUTO A ELIMINAR");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 580, 30));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Placa");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        InputPlacaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPlacaEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(InputPlacaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 230, 40));

        eliminarCarro.setText("Eliminar auto");
        eliminarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCarroActionPerformed(evt);
            }
        });
        jPanel5.add(eliminarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        jTabbedPane1.addTab("Eliminar", jPanel5);

        venta.setBackground(new java.awt.Color(255, 255, 255));
        venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ventas");
        venta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        ventasTbla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Auto", "Precio Auto", "Placa", "Fecha Compra", "Total", "Cantidad", "Cliente", "Apellido", "Identificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ventasTbla);

        venta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 810, 380));

        jTabbedPane1.addTab("Agregar", venta);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 860, 440));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_4.setBackground(new java.awt.Color(0, 0, 0));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });
        btn_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btn_4.add(ind_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Eliminar");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        btn_4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 43));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/find_search_card_user_16713.png"))); // NOI18N
        btn_4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 30));

        jPanel7.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 50));

        btn_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });
        btn_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btn_3.add(ind_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agregar");
        btn_3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 44));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new_add_user_info_16706.png"))); // NOI18N
        btn_3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 40));

        jPanel7.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, 50));

        btn_1.setBackground(new java.awt.Color(0, 0, 0));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });
        btn_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btn_1.add(ind_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Disponibles");
        btn_1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, -1));
        btn_1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.png"))); // NOI18N
        btn_1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        jPanel7.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 50));

        vendidodopanel.setBackground(new java.awt.Color(0, 0, 0));
        vendidodopanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendidodopanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vendidodopanelMouseEntered(evt);
            }
        });
        vendidodopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Autos Vendidos");
        vendidodopanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Reportes.png"))); // NOI18N
        vendidodopanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        jPanel7.add(vendidodopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 50));

        CierreSesion.setBackground(new java.awt.Color(0, 0, 0));
        CierreSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        CierreSesion.setForeground(new java.awt.Color(255, 255, 255));
        CierreSesion.setText("Cerrar Sesión");
        CierreSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CierreSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CierreSesionActionPerformed(evt);
            }
        });
        jPanel7.add(CierreSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 90, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMarcaActionPerformed

    }//GEN-LAST:event_inputMarcaActionPerformed

    private void inputModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputModeloActionPerformed

    private void inputPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrecioActionPerformed

    private void inputFechaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFechaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFechaRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String marca = inputMarca.getText();
        String cantidades = cantidad.getText(); 
        int cantidadEntera = 0;


        if (!cantidades.isEmpty() && cantidades.matches("\\d+")) { 
            cantidadEntera = Integer.parseInt(cantidades);

          
            if (cantidadEntera < 1) {
                JOptionPane.showMessageDialog(null, "Debe agregar al menos un carro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (cantidadEntera > 50) {
                JOptionPane.showMessageDialog(null, "Ha superado el limite de carros por agregar.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
              
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        String modelo = inputModelo.getText();
        String precioTexto = inputPrecio.getText();
        String año = cantidad.getText();
        String color = inputColor.getText();
        String tipoMotor = inputTipoMotor.getText();
        String fecha = inputFechaRegistro.getText();
        String Kilometraje = inputKilometraje.getText();
  
        PlacaCarro.cargarPlacasExistentes();

        carsController controller = new carsController();

       
        if (marca.isEmpty() || fecha.isEmpty() || precioTexto.isEmpty() || color.isEmpty()
                || modelo.isEmpty() || Kilometraje.isEmpty() || tipoMotor.isEmpty() || año.isEmpty() || cantidades.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese todos los campos");
            return;
        }

        BigDecimal precio;
        try {
            
            precio = new BigDecimal(precioTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número válido");
            return;
        }
      
        String nuevaPlaca = PlacaCarro.generarPlacaUnica();

        boolean registrado = controller.registroCarro(marca, modelo, año, precioTexto, color, tipoMotor, fecha, Kilometraje, nuevaPlaca);

        if (registrado) {
            JOptionPane.showMessageDialog(this, "Carro añadido exitosamente con placa: " + nuevaPlaca);
        } else {
            JOptionPane.showMessageDialog(this, "El auto no se ha podido añadir, intentelo nuevamente");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

 
    
    private void inputColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputColorActionPerformed

    private void inputKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKilometrajeActionPerformed

    private void InputPlacaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPlacaEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPlacaEliminarActionPerformed

    private void eliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCarroActionPerformed

        String inputPlacaAutoEliminar = InputPlacaEliminar.getText();

        if (inputPlacaAutoEliminar.isEmpty()) {
            JOptionPane.showInternalMessageDialog(null, "Por favor, llene el campo");

        }
        carDelete cD = new carDelete();
        cD.eliminarAuto(inputPlacaAutoEliminar);

    }//GEN-LAST:event_eliminarCarroActionPerformed

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed

    }//GEN-LAST:event_btn_3MousePressed

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed

    }//GEN-LAST:event_btn_1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarProfesoresEnTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed

    }//GEN-LAST:event_cantidadActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void vendidodopanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendidodopanelMouseClicked
                                    
        jTabbedPane1.setSelectedIndex(3);
                                     

    }//GEN-LAST:event_vendidodopanelMouseClicked

    private void vendidodopanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendidodopanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_vendidodopanelMouseEntered

    private void CierreSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CierreSesionActionPerformed
      
       int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION); 
        
        if (confirm ==JOptionPane.YES_OPTION) {
              
             this.dispose();
            
            InicioSesion is = new InicioSesion();
            is.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Cierre de sesión cancelado.");
       
    }                       
    }//GEN-LAST:event_CierreSesionActionPerformed

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
            java.util.logging.Logger.getLogger(adminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adminview().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(adminview.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CierreSesion;
    private javax.swing.JTextField InputPlacaEliminar;
    private javax.swing.JPanel añadir;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton eliminarCarro;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JTextField inputAño1;
    private javax.swing.JTextField inputColor;
    private javax.swing.JTextField inputFechaRegistro;
    private javax.swing.JTextField inputKilometraje;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPrecio;
    private javax.swing.JTextField inputTipoMotor;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPopupMenu ppMenuTabla;
    public javax.swing.JTable tablaAdministrador;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtMarca1;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JPanel vendidodopanel;
    private javax.swing.JPanel venta;
    private javax.swing.JTable ventasTbla;
    // End of variables declaration//GEN-END:variables

    public void cargarProfesoresEnTabla() {
        carroDAO profesorDAO = new carroDAO();
        List<car> listaCarros = profesorDAO.obtenerCarros();

        DefaultTableModel model = (DefaultTableModel) tablaAdministrador.getModel();

        model.setRowCount(0);
        DecimalFormat formatoPrecio = new DecimalFormat("#,##0.00");
        for (car cars : listaCarros) {
            model.addRow(new Object[]{
                cars.getMarca(),
                cars.getModelo(),
                cars.getAño(),
                formatoPrecio.format(cars.getPrecio()), 
                cars.getColor(),
                cars.getTipoMotor(),
                cars.getKilometraje(),
                cars.getFechaIngresoo(),
                cars.getPlaca(),
                cars.getCantidad()

            });
        }
        
        
    }
    
   public void cargarComprasEnTabla() throws SQLException {
    carroDAO carroD = new carroDAO(); 
    List<Compra> listaCarros = carroD.obtenerAutosVendidos(); 

    DefaultTableModel model = (DefaultTableModel) ventasTbla.getModel(); 
    model.setRowCount(0); 

  
    for (Compra compra : listaCarros) {
        model.addRow(new Object[]{
            
            compra.getNombreAuto(),
            compra.getPrecioAuto(),
            compra.getPlaca(),
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
