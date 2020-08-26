
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
public class IngresoPedidos extends javax.swing.JInternalFrame {
    Conexion con = new Conexion();
    Connection cn = con.Conectar();
    DefaultTableModel ingresopedido;
    
    /**
     *
     */
    public IngresoPedidos() {
        initComponents();
        bloquear();
        mostrar("");
    }

    void bloquear(){
    txtnit.setEnabled(false);
    txttienda.setEnabled(false);
    txtpedido.setEnabled(false);
    txtcant.setEnabled(false);
    txtestado.setEnabled(false);
    txtfechape.setEnabled(false);
    txtentrega.setEnabled(false);
    txtproducto.setEnabled(false);
    btnguardar.setEnabled(false);
    btnnuevo.setEnabled(true);
    btncancelar.setEnabled(false);
    btnactualizar.setEnabled(false);
    }
    
    void limpiar(){
    txtnit.setText("");
    txttienda.setText("");
    txtcant.setText("");
    txtproducto.setText("");
    txtestado.setText("");
    txtentrega.setText("");
    txtfechape.setText("");
    txtpedido.setText("");   
    }
    
    void desbloquear(){
    txtnit.setEnabled(true);
    txttienda.setEnabled(true);
    txtpedido.setEnabled(true);
    txtcant.setEnabled(true);
    txtestado.setEnabled(true);
    txtfechape.setEnabled(true);
    txtentrega.setEnabled(true);
    txtproducto.setEnabled(true);
    btnguardar.setEnabled(true);
    btnnuevo.setEnabled(false);
    btncancelar.setEnabled(true);
    btnactualizar.setEnabled(false);
    }
    void descontarcantidad(String codi,String can)
    {
       int des = Integer.parseInt(can);
       String cap="";
       int desfinal;
       String consul="SELECT * FROM PRODUCTO WHERE  codigoPr='"+codi+"'";
        try {
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(consul);
            while(rs.next())
            {
                cap= rs.getString(4);
            }
            
            
        } catch (Exception e) {
        }
        desfinal=Integer.parseInt(cap)-des;
        String modi="UPDATE PRODUCTO SET cantidadExistente='"+desfinal+"' WHERE codigoPr = '"+codi+"'";
        try {
            PreparedStatement pst = cn.prepareStatement(modi);
            pst.executeUpdate();
        } catch (Exception e) {
        }
        
       
         
    }
    
    void mostrar(String pedido){
        //mando a llamar los datos desde la base de datos
        String mostrar="SELECT * FROM PEDIDOS WHERE CONCAT(codigoPedido,fechaPedido,fechaEntrega,estado,cantidad,CodigoTienda1,codigoProducto,cliente) LIKE '%"+pedido+"%'";
        String []titulos={"codigopedido","fechapedido","fechaentrega","estado","cantidad","codigotienda","codproducto","cliente"};
        String []Registros=new String[8];
        ingresopedido= new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("codigoPedido");
                  Registros[1]= rs.getString("fechaPedido");
                  Registros[2]= rs.getString("fechaEntrega");
                  Registros[3]= rs.getString("estado");
                  Registros[4]= rs.getString("cantidad");
                  Registros[5]= rs.getString("CodigoTienda1");
                  Registros[6]= rs.getString("codigoProducto");
                  Registros[7]= rs.getString("cliente");         
                  ingresopedido.addRow(Registros);
              }
              tbpedido.setModel(ingresopedido);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoPedidos.class.getName()).log(Level.SEVERE, null, ex);
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
        txttienda = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtpedido = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        txtfechape = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtentrega = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbpedido = new javax.swing.JTable();

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

        jLabel18.setText("NIT Cliente");

        jLabel19.setText("Tienda ");

        txttienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttiendaKeyTyped(evt);
            }
        });

        jLabel20.setText("Cod. Pedido");

        txtpedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpedidoKeyTyped(evt);
            }
        });

        jLabel21.setText("Cod. Producto");

        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        txtproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtproductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtproductoKeyTyped(evt);
            }
        });

        txtfechape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechapeKeyTyped(evt);
            }
        });

        jLabel22.setText("Fecha Pedido");

        jLabel23.setText("Estado");

        jLabel25.setText("Fecha Entrega");

        txtentrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtentregaKeyTyped(evt);
            }
        });

        jLabel26.setText("Cantidad");

        jLabel27.setText("Total");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnit)
                            .addComponent(txtestado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttienda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtproducto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpedido)
                                    .addComponent(txtfechape, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txtentrega, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addGap(31, 31, 31)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
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
                    .addComponent(txttienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtfechape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(txtentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbpedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbpedido);

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
                        .addGap(0, 21, Short.MAX_VALUE)))
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
        String codigopedido,fechapedido,fechaentrega,estado,cantidad,codigotienda,codproducto,cliente;
        String sql="";
        cliente=txtnit.getText();
        codigotienda=txttienda.getText();
        codigopedido=txtpedido.getText();
        cantidad=txtcant.getText();
        fechapedido=txtfechape.getText();
        fechaentrega=txtentrega.getText();
        estado= txtestado.getText();
        codproducto=txtproducto.getText();

        sql="INSERT INTO PEDIDOS (codigoPedido,fechaPedido,fechaEntrega,estado,cantidad,CodigoTienda1,codigoProducto,cliente) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, codigopedido);
            pst.setString(2, fechapedido);
            pst.setString(3, fechaentrega);
            pst.setString(4, estado);
            pst.setString(5, cantidad);
            pst.setString(6, codigotienda);
            pst.setString(7, codproducto);
            pst.setString(8, cliente);

            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
                bloquear();
            }
            mostrar("");
        } catch (SQLException ex) {
            Logger.getLogger(IngresoPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE PEDIDOS SET CodigoTienda1='"
                +txttienda.getText()+ "',codigoPedido='"
                +txtpedido.getText()+ "',codigoProducto='"
                +txtproducto.getText()+ "',fechaPedido='"
                +txtfechape.getText()+ "',fechaEntrega='"
                +txtentrega.getText()+ "',estado='"
                +txtestado.getText()+ "',cantidad='"
                +txtcant.getText()+ "' WHERE cliente='"+txtnit.getText()+"'");
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

    private void txttiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttiendaKeyTyped

        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txttiendaKeyTyped

    private void txtpedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpedidoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtpedidoKeyTyped

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoKeyPressed

    private void txtproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproductoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(txtproducto.getText().length()>=8) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtproductoKeyTyped

    private void txtfechapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechapeKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(txtfechape.getText().length()>=9) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtfechapeKeyTyped

    private void txtentregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtentregaKeyTyped

    }//GEN-LAST:event_txtentregaKeyTyped

    
private void mnmodificarActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:
    desbloquear();
     btnactualizar.setEnabled(true);
    int filamodificar= tbpedido.getSelectedRow();
    if(filamodificar>=0)
    {
        txtnit.setText(tbpedido.getValueAt(filamodificar, 0).toString());
        txttienda.setText(tbpedido.getValueAt(filamodificar, 1).toString());
        txtpedido.setText(tbpedido.getValueAt(filamodificar, 2).toString());
        txtproducto.setText(tbpedido.getValueAt(filamodificar, 4).toString());
        txtfechape.setText(tbpedido.getValueAt(filamodificar, 5).toString());
        txtentrega.setText(tbpedido.getValueAt(filamodificar, 6).toString());
        txtestado.setText(tbpedido.getValueAt(filamodificar, 7).toString());
        txtcant.setText(tbpedido.getValueAt(filamodificar, 8).toString());
      
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbpedido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtentrega;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtfechape;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtpedido;
    private javax.swing.JTextField txtproducto;
    private javax.swing.JTextField txttienda;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
