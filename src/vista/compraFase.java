package vista;

<<<<<<< HEAD
=======
import com.itextpdf.text.BaseColor;
>>>>>>> modificarInformacion
import javax.swing.JOptionPane;
import model.Carro;
import model.PlacaCarro;
import model.Sesion;
import model.carroDAO;
import java.sql.SQLException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
<<<<<<< HEAD
import com.itextpdf.text.Image;
=======
>>>>>>> modificarInformacion
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JFileChooser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Usuario;

public class compraFase extends javax.swing.JFrame {
<<<<<<< HEAD

    private String modeloCarro;
    private Carro carroSeleccionado;
    private String identificacionUsuario;

    public compraFase() {
        setLocationRelativeTo(null);
        this.identificacionUsuario = identificacionUsuario;
=======
 private String modeloCarro;
 private Carro carroSeleccionado;
 private String identificacionUsuario;
  
    
    public compraFase() {
        setLocationRelativeTo(null); 
        this.identificacionUsuario = identificacionUsuario; 
>>>>>>> modificarInformacion
        initComponents();

        marcaLabel = new javax.swing.JLabel();
        modeloLabel = new javax.swing.JLabel();
        añoLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        tipoMotorLabel = new javax.swing.JLabel();
        fechaIngresooLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        placaLabel = new javax.swing.JLabel();
<<<<<<< HEAD

        mostrarPlacaAleatoria();

    }

    public compraFase(Carro carro, String identificacionUsuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.identificacionUsuario = identificacionUsuario;
        this.carroSeleccionado = carro;
        mostrarDatosCarro();
        mostrarPlacaAleatoria();

=======
        mostrarPlacaAleatoria(); 
    }

    public compraFase(Carro carro,String identificacionUsuario) {
        initComponents(); 
         setLocationRelativeTo(null); 
       this.identificacionUsuario = identificacionUsuario;
        this.carroSeleccionado = carro; 
        mostrarDatosCarro();
        mostrarPlacaAleatoria();
        
       
>>>>>>> modificarInformacion
    }

    private void mostrarDatosCarro() {

        if (carroSeleccionado != null) {
<<<<<<< HEAD

            modeloLabel.setText(carroSeleccionado.getModelo());
            añoLabel.setText(carroSeleccionado.getAño());
=======
          
          
            modeloLabel.setText(carroSeleccionado.getModelo()); 
            añoLabel.setText(carroSeleccionado.getAño()); 
>>>>>>> modificarInformacion
            double precio = carroSeleccionado.getPrecio();
            precioLabel.setText(String.format("%.2f", precio));
            colorLabel.setText(carroSeleccionado.getColor());
            tipoMotorLabel.setText(carroSeleccionado.getTipoMotor());
            fechaIngresooLabel.setText(carroSeleccionado.getFechaIngresoo());
            cantidadLabel.setText(String.valueOf(carroSeleccionado.getCantidad()));
            marcaLabel.setText(carroSeleccionado.getMarca());
<<<<<<< HEAD

=======
            
>>>>>>> modificarInformacion
            if (carroSeleccionado.getCantidad() == 0) {
                pago.setEnabled(false);
            } else {
                pago.setEnabled(true);
            }
<<<<<<< HEAD
        }
    }

=======
        }   
    }
    
>>>>>>> modificarInformacion
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        panelCompra = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        modeloLabel = new javax.swing.JLabel();
        añoLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        lbal = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipoMotorLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        fechaIngresooLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        placaLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dineroCliente = new javax.swing.JTextField();
        pago = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fase de compra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Completamente 0 km.");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 20));

        panelCompra.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(51, 0, 0));
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Precio:");

        jLabel4.setBackground(new java.awt.Color(51, 0, 0));
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Modelo:");

        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Año: ");

        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("Color:");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));

        modeloLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        modeloLabel.setForeground(new java.awt.Color(0, 0, 0));

        añoLabel.setBackground(new java.awt.Color(0, 0, 0));
        añoLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        añoLabel.setForeground(new java.awt.Color(0, 0, 0));

        colorLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(0, 0, 0));

        lbal.setForeground(new java.awt.Color(0, 0, 0));
        lbal.setText("Marca:");

        marcaLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        marcaLabel.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo Motor:");

        tipoMotorLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        tipoMotorLabel.setForeground(new java.awt.Color(0, 0, 0));

        fi.setForeground(new java.awt.Color(0, 0, 0));
        fi.setText("Fecha ingreso:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Disponibles:");

        precioLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        precioLabel.setForeground(new java.awt.Color(0, 0, 0));

        fechaIngresooLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        fechaIngresooLabel.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Placa:");

        placaLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelCompraLayout = new javax.swing.GroupLayout(panelCompra);
        panelCompra.setLayout(panelCompraLayout);
        panelCompraLayout.setHorizontalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCompraLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(modeloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addComponent(añoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(marcaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoMotorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaIngresooLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        panelCompraLayout.setVerticalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cantidadLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modeloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(añoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12))
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoMotorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fi)
                .addGap(12, 12, 12)
                .addComponent(fechaIngresooLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(placaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 460, 480));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ingrese el dinero disponible:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        dineroCliente.setBackground(new java.awt.Color(255, 255, 255));
        dineroCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dineroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dineroClienteActionPerformed(evt);
            }
        });
        jPanel1.add(dineroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 180, 30));

        pago.setBackground(new java.awt.Color(0, 0, 0));
        pago.setForeground(new java.awt.Color(255, 255, 255));
        pago.setText("Comprar");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        jPanel1.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 90, 30));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image 2.jpg"))); // NOI18N
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 470, 90, 70));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Voltrix car's");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 310, -1));

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 90, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Aseñoradedo.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 212, 350, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
<<<<<<< HEAD
        try {
            if (dineroCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un monto.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
=======
     try {
        if (dineroCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un monto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double dineroDisponible = Double.parseDouble(dineroCliente.getText());

        if (carroSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un carro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double precio = carroSeleccionado.getPrecio();
        String dineroFormato = String.format("%.2f", dineroDisponible);
        String precioFormato = String.format("%.2f", precio);

     
        JOptionPane.showMessageDialog(this, 
            "Datos del carro seleccionado:\n" +
            "Modelo: " + carroSeleccionado.getModelo() + "\n" +
            "Marca: " + carroSeleccionado.getMarca() + "\n" +
            "Cantidad disponible: " + carroSeleccionado.getCantidad() + "\n" +
            "Precio: " + precioFormato + "\n" +
            "Dinero disponible: " + dineroFormato, 
            "Depuración", JOptionPane.INFORMATION_MESSAGE);

        if (dineroDisponible < precio) {
            JOptionPane.showMessageDialog(this, "El dinero ingresado no es suficiente para comprar este carro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (dineroDisponible > precio) {
            JOptionPane.showMessageDialog(this, "Ingrese el valor exacto.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        if (dineroDisponible == precio) {
            int idUsuario = Sesion.getUsuarioActual().getId(); 
            Usuario user = Sesion.getUsuarioActual(); 
            int idAuto = carroSeleccionado.getId(); 

            carroDAO vc = new carroDAO();
            
            if (carroSeleccionado.getCantidad() > 0) {
                vc.ventacarro(carroSeleccionado.getModelo(), precio, idUsuario, idAuto);

               
                int nuevaCantidad = carroSeleccionado.getCantidad() - 1;

                boolean actualizado = vc.actualizarCantidadCarro(idAuto, nuevaCantidad);
                
                if (actualizado) {
                    JOptionPane.showMessageDialog(this, "Compra realizada con éxito.");
                  
                    generarPDFFactura(carroSeleccionado, user, dineroFormato, precioFormato);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar la cantidad del carro.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ya no hay unidades disponibles.");
>>>>>>> modificarInformacion
            }

            double dineroDisponible = Double.parseDouble(dineroCliente.getText());

            if (carroSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado un carro.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double precio = carroSeleccionado.getPrecio();
            String dineroFormato = String.format("%.2f", dineroDisponible);
            String precioFormato = String.format("%.2f", precio);

            JOptionPane.showMessageDialog(this,
            "Datos del carro seleccionado:\n"
          + "Modelo: " + carroSeleccionado.getModelo() + "\n"
                    + "Marca: " + carroSeleccionado.getMarca() + "\n"
                    + "Cantidad disponible: " + carroSeleccionado.getCantidad() + "\n"
                    + "Precio: " + precioFormato + "\n"
                    + "Dinero disponible: " + dineroFormato,
                    "Depuración", JOptionPane.INFORMATION_MESSAGE);

            if (dineroDisponible < precio) {
                JOptionPane.showMessageDialog(this, "El dinero ingresado no es suficiente para comprar este carro.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dineroDisponible > precio) {
                JOptionPane.showMessageDialog(this, "Ingrese el valor exacto.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dineroDisponible == precio) {
                int idUsuario = Sesion.getUsuarioActual().getId();
                
                
                usuarios user = Sesion.getUsuarioActual();
                
                
                int idAuto = carroSeleccionado.getId();

                carroDAO vc = new carroDAO();

                if (carroSeleccionado.getCantidad() > 0) {

                    vc.ventacarro(carroSeleccionado.getModelo(), precio, idUsuario, idAuto);
                    int nuevaCantidad = carroSeleccionado.getCantidad() - 1;
                    boolean actualizado = vc.actualizarCantidadCarro(idAuto, nuevaCantidad);

                    if (actualizado) {
                        JOptionPane.showMessageDialog(this, "Compra realizada con éxito.");

                        generarPDFFactura(carroSeleccionado, user, dineroFormato, precioFormato);

                    } else {
                        JOptionPane.showMessageDialog(this, "Error al actualizar la cantidad del carro.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ya no hay unidades disponibles.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un monto válido en formato numérico.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al procesar la compra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


    }//GEN-LAST:event_pagoActionPerformed

    private void dineroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dineroClienteActionPerformed


    }//GEN-LAST:event_dineroClienteActionPerformed

<<<<<<< HEAD
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed

        try {
            Cliente dashboard = new Cliente(identificacionUsuario);
            dashboard.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el panel principal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_regresarActionPerformed

=======
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    try {
        PrincipalUsuario dashboard = new PrincipalUsuario(identificacionUsuario);
        dashboard.setVisible(true);
        this.dispose();
    } catch (SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error al cargar el panel principal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    
>>>>>>> modificarInformacion
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
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compraFase().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel añoLabel;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField dineroCliente;
    private javax.swing.JLabel fechaIngresooLabel;
    private javax.swing.JLabel fi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbal;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JButton pago;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JLabel placaLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel tipoMotorLabel;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        dineroCliente.setText("");

    }
<<<<<<< HEAD

    private void mostrarPlacaAleatoria() {
        String placaGenerada = PlacaCarro.generarPlacaUnica();
        placaLabel.setText(placaGenerada);
    }

   private void generarPDFFactura(Carro carr, usuarios user, String dineroCliente, String precioCarro) {
    Document document = new Document(PageSize.A4, 50, 50, 50, 50); // Márgenes más equilibrados
=======
        private void mostrarPlacaAleatoria() {
        String placaGenerada = PlacaCarro.generarPlacaUnica(); 
        placaLabel.setText(placaGenerada);
    }
    private void generarPDFFactura(Carro carr, Usuario user, String dineroCliente, String precioCarro) {
    Document document = new Document();
>>>>>>> modificarInformacion
    try {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Factura como");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }
<<<<<<< HEAD

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            Image logo = Image.getInstance("C:\\Users\\ASUS\\Desktop\\Sistema_Automotriz\\src\\imagenes\\voltrixIcon.jpg");
            logo.scaleToFit(100, 100);
            logo.setAlignment(Image.ALIGN_LEFT); 
            document.add(logo);

            String codigoFactura = "FACT-" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

            Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.BOLD, BaseColor.BLACK); // Título elegante
            Font subTitleFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.DARK_GRAY); // Subtítulos elegantes
            Font bodyFont = new Font(Font.FontFamily.TIMES_ROMAN, 11, Font.NORMAL, BaseColor.DARK_GRAY); // Texto en gris oscuro
            Font footerFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC, BaseColor.LIGHT_GRAY); // Pie de página

            Rectangle rect = new Rectangle(577, 825, 18, 15);
            rect.enableBorderSide(Rectangle.BOX);
            rect.setBorderWidth(2);
            rect.setBorderColor(BaseColor.DARK_GRAY);
            writer.setBoxSize("borde", rect);
            
            document.add(rect);

            // Encabezado: Nombre de la empresa y código de factura
            Paragraph empresa = new Paragraph("VOLTRIX", titleFont);
            empresa.setAlignment(Element.ALIGN_CENTER);
            document.add(empresa);

            Paragraph codigoFacturaParrafo = new Paragraph("Código de Factura: " + codigoFactura, bodyFont);
            codigoFacturaParrafo.setAlignment(Element.ALIGN_CENTER);
            document.add(codigoFacturaParrafo);

            document.add(new Paragraph("\n"));

            String fechaCompra = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            Paragraph fecha = new Paragraph("Fecha de Compra: " + fechaCompra, bodyFont);
            fecha.setAlignment(Element.ALIGN_CENTER);
            document.add(fecha);

            document.add(new Paragraph("\n"));

            // Título de la factura
=======

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));

           
            document.open();

            
            Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.BOLD, BaseColor.BLACK); // Título en negro
            Font subTitleFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.DARK_GRAY); // Subtítulos en gris oscuro
            Font bodyFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.GRAY); // Texto en gris
            Font footerFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC, BaseColor.LIGHT_GRAY); // Pie de página en gris claro

         
            String fechaCompra = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

         
            Rectangle rect = new Rectangle(577, 825, 18, 15); 
            rect.enableBorderSide(Rectangle.BOX);
            rect.setBorderWidth(2); 
            rect.setBorderColor(BaseColor.DARK_GRAY);
            writer.setBoxSize("borde", rect); 

           
            document.add(rect);

         
            Paragraph empresa = new Paragraph("VOLTRIX", titleFont);
            empresa.setAlignment(Element.ALIGN_CENTER);
            document.add(empresa);

         
            Paragraph fecha = new Paragraph("Fecha de Compra: " + fechaCompra, bodyFont);
            fecha.setAlignment(Element.ALIGN_CENTER);
            document.add(fecha);

            document.add(new Paragraph("\n"));

>>>>>>> modificarInformacion
            Paragraph title = new Paragraph("Factura de Compra", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingAfter(10f); // Espaciado para separar el título
            document.add(title);
<<<<<<< HEAD
=======

            document.add(new Paragraph("\n"));
>>>>>>> modificarInformacion

            // Tabla de detalles
            PdfPTable table = new PdfPTable(2);
<<<<<<< HEAD
            table.setWidthPercentage(90); // Ancho del 90% de la página
            table.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar la tabla

            // Encabezados de la tabla
            PdfPCell header1 = new PdfPCell(new Phrase("Campo", subTitleFont));
            header1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header1.setBorderColor(BaseColor.GRAY);
            header1.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar el texto
            table.addCell(header1);

            PdfPCell header2 = new PdfPCell(new Phrase("Detalles", subTitleFont));
            header2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header2.setBorderColor(BaseColor.GRAY);
            header2.setHorizontalAlignment(Element.ALIGN_CENTER); // Centrar el texto
            table.addCell(header2);

            // Añadir detalles del carro
            agregarCeldaTabla(table, "Modelo del Carro", carr.getModelo(), bodyFont);
            agregarCeldaTabla(table, "Marca", carr.getMarca(), bodyFont);
            agregarCeldaTabla(table, "Placa", placaLabel.getText(), bodyFont);
            agregarCeldaTabla(table, "Color", carr.getColor(), bodyFont);
            agregarCeldaTabla(table, "Tipo de Motor", carr.getTipoMotor(), bodyFont);
            agregarCeldaTabla(table, "Precio", precioCarro + " COP", bodyFont);
            agregarCeldaTabla(table, "Nombre del Cliente", user.getNombre() + " " + user.getApellidos(), bodyFont);
            agregarCeldaTabla(table, "Identificación", user.getIdentificacion(), bodyFont);
            agregarCeldaTabla(table, "Correo Electrónico", user.getCorreo(), bodyFont);
            agregarCeldaTabla(table, "Dinero del Cliente", dineroCliente + " COP", bodyFont);

            document.add(table);

            document.add(new Paragraph("\n"));

            // Mensaje de agradecimiento
            Paragraph thanksMessage = new Paragraph("¡Gracias por su compra!", titleFont);
            thanksMessage.setAlignment(Element.ALIGN_CENTER);
            thanksMessage.setSpacingBefore(20f); // Espaciado antes
            thanksMessage.setSpacingAfter(20f); // Espaciado después
            document.add(thanksMessage);

            // Pie de página
=======
            table.setWidthPercentage(100);

        
            PdfPCell header1 = new PdfPCell(new Phrase("Campo", subTitleFont));
            header1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header1.setBorderColor(BaseColor.GRAY);
            table.addCell(header1);

            PdfPCell header2 = new PdfPCell(new Phrase("Detalles", subTitleFont));
            header2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header2.setBorderColor(BaseColor.GRAY);
            table.addCell(header2);

        
            table.addCell(new Phrase("Modelo del Carro", bodyFont));
            table.addCell(new Phrase(carr.getModelo(), bodyFont));

            table.addCell(new Phrase("Marca", bodyFont));
            table.addCell(new Phrase(carr.getMarca(), bodyFont));

            String placaGenerada = placaLabel.getText();
            table.addCell(new Phrase("Placa", bodyFont));
            table.addCell(new Phrase(placaGenerada, bodyFont));

            table.addCell(new Phrase("Color", bodyFont));
            table.addCell(new Phrase(carr.getColor(), bodyFont));

            table.addCell(new Phrase("Tipo de Motor", bodyFont));
            table.addCell(new Phrase(carr.getTipoMotor(), bodyFont));

            table.addCell(new Phrase("Precio", bodyFont));
            table.addCell(new Phrase(precioCarro + " COP", bodyFont));

            table.addCell(new Phrase("Nombre del Cliente", bodyFont));
            table.addCell(new Phrase(user.getNombre() + " " + user.getApellidos(), bodyFont));

            table.addCell(new Phrase("Identificación", bodyFont));
            table.addCell(new Phrase(user.getIdentificacion(), bodyFont));

            table.addCell(new Phrase("Correo Electrónico", bodyFont));
            table.addCell(new Phrase(user.getCorreo(), bodyFont));

            table.addCell(new Phrase("Dinero del Cliente", bodyFont));
            table.addCell(new Phrase(dineroCliente + " USD", bodyFont));

            document.add(table);

            document.add(new Paragraph("\n\n"));

          
            Paragraph thanksMessage = new Paragraph("¡Gracias por su compra!", titleFont);
            thanksMessage.setAlignment(Element.ALIGN_CENTER);
            thanksMessage.setSpacingBefore(10f);
            thanksMessage.setSpacingAfter(10f);
            document.add(thanksMessage);

           
>>>>>>> modificarInformacion
            Paragraph footer = new Paragraph("VOLTRIX - Calidad y velocidad en cada auto", footerFont);
            footer.setAlignment(Element.ALIGN_CENTER);
            footer.setSpacingBefore(50f); // Espaciado antes del pie de página
            document.add(footer);

            // Cerrar el documento
            document.close();

            JOptionPane.showMessageDialog(this, "Factura generada con éxito en: " + filePath);
        }

    } catch (DocumentException | IOException e) {
        JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

<<<<<<< HEAD
// Método para añadir celdas de la tabla de manera elegante
private void agregarCeldaTabla(PdfPTable table, String campo, String detalle, Font font) {
    PdfPCell campoCell = new PdfPCell(new Phrase(campo, font));
    campoCell.setHorizontalAlignment(Element.ALIGN_LEFT); // Alinear a la izquierda
    campoCell.setBorderColor(BaseColor.LIGHT_GRAY); // Color de borde suave
    table.addCell(campoCell);

    PdfPCell detalleCell = new PdfPCell(new Phrase(detalle, font));
    detalleCell.setHorizontalAlignment(Element.ALIGN_CENTER); // Alinear al centro
    detalleCell.setBorderColor(BaseColor.LIGHT_GRAY); // Color de borde suave
    table.addCell(detalleCell);
}
=======
>>>>>>> modificarInformacion
}
