package vista;


import com.itextpdf.text.BaseColor;
import javax.swing.JOptionPane;
import model.car;
import model.PlacaCarro;
import model.Sesion;
import model.carroDAO;
import java.sql.SQLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JFileChooser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.usuarios;


public class compraFase extends javax.swing.JFrame {

    private String modeloCarro;
    private car carroSeleccionado;
   private String identificacionUsuario;
  
    
    public compraFase() {
         setLocationRelativeTo(null); 
         this.identificacionUsuario = identificacionUsuario; 
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
      
        mostrarPlacaAleatoria(); 
        
        

    }

    public compraFase(car carro,String identificacionUsuario) {
        initComponents(); 
          setLocationRelativeTo(null); 
       this.identificacionUsuario = identificacionUsuario;
        this.carroSeleccionado = carro; 
        mostrarDatosCarro();
        mostrarPlacaAleatoria();
        
        
        JOptionPane.showMessageDialog(this, "Modelo: " + carroSeleccionado.getModelo() + " - Cantidad disponible: " + carroSeleccionado.getCantidad());
    }

    private void mostrarDatosCarro() {

        if (carroSeleccionado != null) {
          
            modeloLabel.setText(carroSeleccionado.getModelo()); 
            añoLabel.setText(carroSeleccionado.getAño()); 
            double precio = carroSeleccionado.getPrecio();
            precioLabel.setText(String.format("%.2f", precio)); 
            colorLabel.setText(carroSeleccionado.getColor()); 
            tipoMotorLabel.setText(carroSeleccionado.getTipoMotor()); 
            fechaIngresooLabel.setText(carroSeleccionado.getFechaIngresoo()); 
            cantidadLabel.setText(String.valueOf(carroSeleccionado.getCantidad())); 
            marcaLabel.setText(carroSeleccionado.getMarca());
            

            if (carroSeleccionado.getCantidad() == 0) {
                pago.setEnabled(false); 
            } else {
                pago.setEnabled(true); 
            }

        }
        
     
    }
    
     
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
        jButton2 = new javax.swing.JButton();
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
        panelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 0, 0));
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Precio:");
        panelCompra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 31, 99, -1));

        jLabel4.setBackground(new java.awt.Color(51, 0, 0));
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Modelo:");
        panelCompra.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 91, 89, -1));

        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Año: ");
        panelCompra.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 146, 37, -1));

        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("Color:");
        panelCompra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 198, 37, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 208, 91, -1));

        modeloLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        modeloLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(modeloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 113, 99, 27));

        añoLabel.setBackground(new java.awt.Color(0, 0, 0));
        añoLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        añoLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(añoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 168, 99, 24));

        colorLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 220, 101, 26));

        lbal.setForeground(new java.awt.Color(0, 0, 0));
        lbal.setText("Marca:");
        panelCompra.add(lbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 252, 67, -1));

        marcaLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        marcaLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(marcaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 274, 122, 29));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo Motor:");
        panelCompra.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 309, 122, -1));

        tipoMotorLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        tipoMotorLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(tipoMotorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 331, 113, 24));
        panelCompra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 467, 152, -1));

        fi.setForeground(new java.awt.Color(0, 0, 0));
        fi.setText("Fecha ingreso:");
        panelCompra.add(fi, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 361, 128, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Disponibles:");
        panelCompra.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 31, -1, -1));
        panelCompra.add(cantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 31, 57, -1));

        precioLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        precioLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(precioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 53, 154, 26));

        fechaIngresooLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        fechaIngresooLabel.setForeground(new java.awt.Color(0, 0, 0));
        panelCompra.add(fechaIngresooLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 389, 128, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Placa:");
        panelCompra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 429, 48, -1));

        placaLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        panelCompra.add(placaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 429, 164, 27));

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

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 90, 30));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    try {
        pruebaPrincipal dashboard = new pruebaPrincipal(identificacionUsuario);
        dashboard.setVisible(true);
        this.dispose();
    } catch (SQLException ex) {
        // Manejo de excepciones, tal vez mostrar un mensaje al usuario
        JOptionPane.showMessageDialog(this, "Error al cargar el panel principal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compraFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel tipoMotorLabel;
    // End of variables declaration//GEN-END:variables

    
      private void limpiarCampos() {
        dineroCliente.setText("");
       
    }
        private void mostrarPlacaAleatoria() {
        String placaGenerada = PlacaCarro.generarPlacaUnica(); 
        placaLabel.setText(placaGenerada); // Muestra la placa en el JLabel
    }
        
        private void generarPDFFactura(car carr, usuarios user, String dineroCliente, String precioCarro) {
    Document document = new Document();
    try {
        // Seleccionar el lugar donde guardar el PDF
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Factura como");
        int userSelection = fileChooser.showSaveDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));

         
            
            document.open();

            Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, BaseColor.BLUE);
            Font subTitleFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.DARK_GRAY);
            Font bodyFont = new Font(Font.FontFamily.HELVETICA, 10);
            Font footerFont = new Font(Font.FontFamily.HELVETICA, 10, Font.ITALIC, BaseColor.GRAY);
        
            String fechaCompra = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            
            Paragraph empresa = new Paragraph("VOLTRIX", titleFont);
            empresa.setAlignment(Element.ALIGN_CENTER);
            document.add(empresa);
            
          
            document.add(new Paragraph("\n"));

       
            Paragraph fecha = new Paragraph("Fecha de Compra: " + fechaCompra, bodyFont);
            fecha.setAlignment(Element.ALIGN_RIGHT);
            document.add(fecha);
          
            document.add(new Paragraph("\n"));

         
            Paragraph title = new Paragraph("Factura de Compra", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            
        
            document.add(new Paragraph("\n"));

          
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100); 
            
           
            table.addCell(new Phrase("Modelo del Carro", subTitleFont));
            table.addCell(new Phrase(carr.getModelo(), bodyFont));

            table.addCell(new Phrase("Marca", subTitleFont));
            table.addCell(new Phrase(carr.getMarca(), bodyFont));
            
            table.addCell(new Phrase("Color", subTitleFont));
            table.addCell(new Phrase(carr.getColor(), bodyFont));

            table.addCell(new Phrase("Tipo de Motor", subTitleFont));
            table.addCell(new Phrase(carr.getTipoMotor(), bodyFont));
            
            table.addCell(new Phrase("Precio", subTitleFont));
            table.addCell(new Phrase(precioCarro + " COP", bodyFont));          

          
            table.addCell(new Phrase(" ", bodyFont));
            table.addCell(new Phrase(" ", bodyFont)); 

            table.addCell(new Phrase("Nombre del Cliente", subTitleFont));
            table.addCell(new Phrase(user.getNombre() + " " + user.getApellidos(), bodyFont));
            
            table.addCell(new Phrase("Identificación", subTitleFont));
            table.addCell(new Phrase(user.getIdentificacion(), bodyFont));
            
            table.addCell(new Phrase("Correo Electrónico", subTitleFont));
            table.addCell(new Phrase(user.getCorreo(), bodyFont));
            
            table.addCell(new Phrase("Dinero del Cliente", subTitleFont));
            table.addCell(new Phrase(dineroCliente + " USD", bodyFont));
            
            document.add(table);

            document.add(new Paragraph("\n\n"));

            Paragraph thanksMessage = new Paragraph("¡Gracias por su compra!", titleFont);
            thanksMessage.setAlignment(Element.ALIGN_CENTER);
            document.add(thanksMessage);
            
            document.add(new Paragraph("\n"));

            
            Paragraph footer = new Paragraph("VOLTRIX - Calidad y velocidad en cada auto", footerFont);
            footer.setAlignment(Element.ALIGN_CENTER);
            document.add(footer);

            document.close();

            JOptionPane.showMessageDialog(this, "Factura generada con éxito en: " + filePath);
        }

    } catch (DocumentException | IOException e) {
        JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    
}
    




