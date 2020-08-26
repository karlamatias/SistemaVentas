
package com.mycompany.sistemaventas.principal;

import com.mycompany.sistemaventas.Cliente.PrincipalCliente;
import com.mycompany.sistemaventas.Trabajador.IngresoTrabajador;
import com.mycompany.sistemaventas.Trabajador.PrincipalTrabajadores;

public class IngresoPrincipal extends javax.swing.JFrame {

  
    public IngresoPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtncliente = new javax.swing.JRadioButton();
        rbtntrabajador = new javax.swing.JRadioButton();
        btnaceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        rbtncliente.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(rbtncliente);
        rbtncliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbtncliente.setForeground(new java.awt.Color(0, 0, 0));
        rbtncliente.setText("CLIENTE");
        jPanel1.add(rbtncliente);
        rbtncliente.setBounds(172, 193, 130, 30);

        rbtntrabajador.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(rbtntrabajador);
        rbtntrabajador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbtntrabajador.setForeground(new java.awt.Color(0, 0, 0));
        rbtntrabajador.setText("TRABAJADOR");
        jPanel1.add(rbtntrabajador);
        rbtntrabajador.setBounds(172, 229, 180, 30);

        btnaceptar.setBackground(new java.awt.Color(255, 153, 0));
        btnaceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnaceptar);
        btnaceptar.setBounds(444, 303, 90, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/top_logo_new_white.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(163, 54, 281, 91);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
         seleccion();
    }//GEN-LAST:event_btnaceptarActionPerformed

    public void seleccion(){
        if(rbtncliente.isSelected()){
            PrincipalCliente cliente = new PrincipalCliente();
            cliente.setVisible(true);
            this.dispose();
            
        } else if(rbtntrabajador.isSelected()){
            IngresoTrabajador trabajador = new IngresoTrabajador();
            trabajador.setVisible(true);
            this.dispose();
    }
    }
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
            java.util.logging.Logger.getLogger(IngresoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtncliente;
    private javax.swing.JRadioButton rbtntrabajador;
    // End of variables declaration//GEN-END:variables
}
