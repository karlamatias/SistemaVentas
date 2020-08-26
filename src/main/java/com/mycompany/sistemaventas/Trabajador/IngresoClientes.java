
package com.mycompany.sistemaventas.Trabajador;

import com.mycompany.sistemaventas.conectar.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karla
 */
public class IngresoClientes extends javax.swing.JInternalFrame {
    Conexion con = new Conexion();
    Connection cn = con.Conectar();
    DefaultTableModel ingresocliente;
    
    /**
     *
     */
    public IngresoClientes() {
        initComponents();
        bloquear();
        mostrar("");
    }

    //bloquear los espacios si no se a seleccionado una accion
    void bloquear(){
    txtnit.setEnabled(false);
    txtnombre.setEnabled(false);
    txtapellido.setEnabled(false);
    txtdireccion.setEnabled(false);
    txtcorreo.setEnabled(false);
    txttelefono.setEnabled(false);
    txtcredito.setEnabled(false);
    txtdpi.setEnabled(false);
    btnguardar.setEnabled(false);
    btnnuevo.setEnabled(true);
    btncancelar.setEnabled(false);
    btnactualizar.setEnabled(false);
    }
    
    //limpiar los espacios de texto cuando se guarde o actualice la informacion
    void limpiar(){
    txtnit.setText("");
    txtnombre.setText("");
    txtdireccion.setText("");
    txtdpi.setText("");
    txtcorreo.setText("");
    txtcredito.setText("");
    txttelefono.setText("");
    txtapellido.setText("");   
    }
    
    //desbloquea los txt y los botones al seleccionar una accion
    void desbloquear(){
    txtnit.setEnabled(true);
    txtnombre.setEnabled(true);
    txtapellido.setEnabled(true);
    txtdireccion.setEnabled(true);
    txtcorreo.setEnabled(true);
    txttelefono.setEnabled(true);
    txtcredito.setEnabled(true);
    txtdpi.setEnabled(true);
    btnguardar.setEnabled(true);
    btnnuevo.setEnabled(false);
    btncancelar.setEnabled(true);
    btnactualizar.setEnabled(false);
    }
    
    //muestra todos los datos en la DefaultTableModel de la parte de abajo de la ventana
    void mostrar(String cliente){
        //mando a llamar los datos desde la base de datos
        String mostrar="SELECT * FROM CLIENTE WHERE CONCAT(NITCliente,nombreCliente,apellidoCliente,DPI,Credito, telefonoCliente, Correo, direccionCliente) LIKE '%"+cliente+"%'";
        String []titulos={"NIT","Nombres","Apellidos","DPI","Telefono","Credito","Correo","Direccion"};
        String []Registros=new String[8];
        ingresocliente= new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("NITcliente");
                  Registros[1]= rs.getString("nombreCliente");
                  Registros[2]= rs.getString("apellidoCliente");
                  Registros[3]= rs.getString("DPI");
                  Registros[4]= rs.getString("telefonoCliente");
                  Registros[5]= rs.getString("Credito");
                  Registros[6]= rs.getString("Correo");
                  Registros[7]= rs.getString("direccionCliente");         
                  ingresocliente.addRow(Registros);
              }
              tbclientes.setModel(ingresocliente);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtdpi = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtcredito = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INGRESO CLIENTES");

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnactualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsalir)
                .addContainerGap())
        );

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        btnbuscar.setText("Mostrar Todos");

        jLabel10.setText("BUSCAR:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Cliente"));

        jLabel18.setText("NIT");

        jLabel19.setText("Nombres:");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel20.setText("Apellidos:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        jLabel21.setText("DPI:");

        txtdpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdpiActionPerformed(evt);
            }
        });
        txtdpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdpiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdpiKeyTyped(evt);
            }
        });

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        jLabel22.setText("Telefono:");

        jLabel23.setText("Correo:");

        jLabel24.setText("Direccion:");

        jLabel25.setText("Credito:");

        txtcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcreditoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel18)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtnit)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtdpi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccion))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(txtcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbclientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnbuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(jLabel10)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        desbloquear();
        limpiar();
        txtnit.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String nit,direccion,nombre,apellido,telefono,dpi,correo,credito;
        String sql="";
        nit=txtnit.getText();
        nombre=txtnombre.getText();
        apellido=txtapellido.getText();
        direccion=txtdireccion.getText();
        telefono=txttelefono.getText();
        credito=txtcredito.getText();
        correo= txtcorreo.getText();
        dpi=txtdpi.getText();

        sql="INSERT INTO CLIENTE (NITCliente,nombreCliente,apellidoCliente,DPI,telefonoCliente,Credito,Correo,direccionCliente) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, nit);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, dpi);
            pst.setString(5, telefono);
            pst.setString(6, credito);
            pst.setString(7, correo);
            pst.setString(8, direccion);

            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
                bloquear();
            }
            mostrar("");
        } catch (SQLException ex) {
            Logger.getLogger(IngresoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE CLIENTE SET nombreCliente='"
                +txtnombre.getText()+ "',apellidoCliente='"
                +txtapellido.getText()+ "',DPI='"
                +txtdpi.getText()+ "',telefonoCliente='"
                +txttelefono.getText()+ "',Credito='"
                +txtcredito.getText()+ "',Correo='"
                +txtcorreo.getText()+ "',direccionCliente='"
                +txtdireccion.getText()+ "' WHERE NITCliente='"+txtnit.getText()+"'");
            pst.executeUpdate();
            mostrar("");
            bloquear();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        bloquear();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped

        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtdpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdpiActionPerformed

    private void txtdpiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdpiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdpiKeyPressed

    private void txtdpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdpiKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(txtdpi.getText().length()>=8) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtdpiKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(txttelefono.getText().length()>=9) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtcreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcreditoKeyTyped

    }//GEN-LAST:event_txtcreditoKeyTyped

    
private void mnmodificarActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:
    desbloquear();
     btnactualizar.setEnabled(true);
    int filamodificar= tbclientes.getSelectedRow();
    if(filamodificar>=0)
    {
        txtnit.setText(tbclientes.getValueAt(filamodificar, 0).toString());
        txtnombre.setText(tbclientes.getValueAt(filamodificar, 1).toString());
        txtapellido.setText(tbclientes.getValueAt(filamodificar, 2).toString());
        txtdpi.setText(tbclientes.getValueAt(filamodificar, 4).toString());
        txttelefono.setText(tbclientes.getValueAt(filamodificar, 5).toString());
        txtcredito.setText(tbclientes.getValueAt(filamodificar, 6).toString());
        txtcorreo.setText(tbclientes.getValueAt(filamodificar, 7).toString());
        txtdireccion.setText(tbclientes.getValueAt(filamodificar, 8).toString());
      
    }
    else
    {
        JOptionPane.showMessageDialog(this,"No ha seleccionado ");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcredito;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdpi;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
