
package com.mycompany.sistemaventas.principal;


import com.mycompany.sistemaventas.conectar.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;;
import javax.swing.filechooser.FileNameExtensionFilter;




public class IngresarDatos extends javax.swing.JFrame {
   
    static Conexion cl = new Conexion();
    static Connection cn = cl.Conectar();
    static PreparedStatement ps;
    
    JFileChooser ch = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public IngresarDatos() {
        initComponents();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnseleccionar = new javax.swing.JButton();
        txtarchivo = new javax.swing.JTextField();
        btnimportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnseleccionar.setText("Seleccionar Archivo");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        btnimportar.setText("Importar Informacion");
        btnimportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtarchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnseleccionar)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnimportar)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseleccionar)
                    .addComponent(txtarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(btnimportar)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        JFileChooser ch = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("SQL","sql","txt");
        ch.setFileFilter(fil);
        
        int se = ch.showOpenDialog(null);
        if(se == JFileChooser.APPROVE_OPTION){
            String ruta = ch.getSelectedFile().getPath();
            txtarchivo.setText(ruta);
        
        }
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void btnimportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimportarActionPerformed
        /*    
        try {
                
            FileInputStream input = new FileInputStream(archivo);
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs);

            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                row = sheet.getRow(i);
                

                String sql = "LOAD DATA LOCAL INFILE 'ruta'" +
                             "INTO DATABASE 'SistemaVentas' " +
                             "FIELDS TERMINATED BY ','\n";

                ps = cn.prepareStatement(sql);
                ps.executeUpdate();
                System.out.println("Import rows " + i);
            }
            input.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Existio Algun Error ");
        } catch (IOException ex) {
            Logger.getLogger(IngresarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_btnimportarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnimportar;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JTextField txtarchivo;
    // End of variables declaration//GEN-END:variables
}
