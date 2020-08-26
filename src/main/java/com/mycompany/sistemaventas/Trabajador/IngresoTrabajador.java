
package com.mycompany.sistemaventas.Trabajador;

import javax.swing.JOptionPane;

/**
 *
 * @author karla
 */
public class IngresoTrabajador extends javax.swing.JFrame {
    
    Vendedor vend = new Vendedor();
    EntidadVendedor vendedor = new EntidadVendedor();

    /**
     *
     */
    public IngresoTrabajador() {
        initComponents();
        this.setLocationRelativeTo(null);
        //declaro las variables de ingreso para no tener que estar ingresandolas. 
        //utilizando el dpi como contraseña y el usuario que le dimos a un inicio. 
        txtusuario.setText("VentasUser");
        txtcontraseña.setText("12345");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Jlabelusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        btningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/seguridad.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 30, 272, 137);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Jlabelusuario.setBackground(new java.awt.Color(255, 255, 255));
        Jlabelusuario.setForeground(new java.awt.Color(0, 0, 0));
        Jlabelusuario.setText("USUARIO:");

        jLabel1.setText("CONTRASEÑA:");

        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(Jlabelusuario)
                            .addComponent(txtusuario)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btningresar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Jlabelusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btningresar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 210, 332, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        validar();
    }//GEN-LAST:event_btningresarActionPerformed

    /**
     *
     */
    public void validar(){
        String dpi = txtcontraseña.getText();
        String usuario = txtusuario.getText();
        if(txtusuario.getText().equals("") ||txtcontraseña.getText().equals("")){
            JOptionPane.showInternalMessageDialog(this, "Debe ingresar el usuario y la contraseña");
            txtusuario.requestFocus();
        }else {
            vendedor = vend .ValidarUsuario(dpi, usuario);
            if(vendedor.getUsuarioVendedor() != null && vendedor.getDPI() != 0){
                PrincipalTrabajadores principal = new PrincipalTrabajadores();
                principal.setVisible(true);
                dispose();
            
            }else{
                JOptionPane.showMessageDialog(this, "Debe ingresar datos validos. ");
                txtusuario.requestFocus();
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabelusuario;
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
