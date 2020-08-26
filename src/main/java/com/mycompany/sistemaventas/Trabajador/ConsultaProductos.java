
package com.mycompany.sistemaventas.Trabajador;

import com.mycompany.sistemaventas.conectar.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karla
 */
public class ConsultaProductos extends javax.swing.JInternalFrame {
    Conexion con = new Conexion();
    Connection cn = con.Conectar();
    
    /**
     *
     */
    public ConsultaProductos() {
        initComponents();
        mostrartodosproductos();
    }

    //mostrar los productos en una tabla en la parte inferior de la ventana
    void mostrartodosproductos()
    {
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"codigoPr", "nombreProducto", "cantidadExistente", "precio","codigoTienda"};
        tabla.setColumnIdentifiers(titulos);
        this.tablaproductos.setModel(tabla);
        String consulta= "SELECT * FROM PRODUCTO";
        String []Datos= new String [5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("codigoPr");
                Datos[1]=rs.getString("nombreProducto");
                Datos[2]=rs.getString("cantidadExistente");
                Datos[3]=rs.getString("precio");
                Datos[4]=rs.getString("codigoTienda");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        codigo = new javax.swing.JRadioButton();
        todos = new javax.swing.JRadioButton();
        txtcod = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAR PRODUCTOS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaproductos);

        buttonGroup1.add(codigo);
        codigo.setSelected(true);
        codigo.setText("Mostrar Productos por Codigo");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(todos);
        todos.setText("Mostrar todos los Productos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar))
                    .addComponent(todos))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
        if(codigo.isSelected()==true)
        {
            txtcod.setEnabled(true);
            txtcod.requestFocus();
        }
    }//GEN-LAST:event_codigoActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        // TODO add your handling code here:
        if(todos.isSelected()==true)
        {
            txtcod.setText("");
            txtcod.setEnabled(false);
            mostrartodosproductos();
        }
    }//GEN-LAST:event_todosActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String buscar=txtcod.getText();
        if(codigo.isSelected()==true)
        {
            DefaultTableModel tabla= new DefaultTableModel();
            String []titulos={"codigoPr", "nombreProducto", "cantidadExistente", "precio","codigoTienda"};
            tabla.setColumnIdentifiers(titulos);
            this.tablaproductos.setModel(tabla);
            String consulta= "SELECT * FROM PRODUCTO WHERE codigoPr LIKE '%"+buscar+"%'";
            String []Datos= new String [5];
            try {
                Statement st = cn.createStatement();
                ResultSet rs= st.executeQuery(consulta);
                while(rs.next())
                {
                     Datos[0]=rs.getString("codigoPr");
                     Datos[1]=rs.getString("nombreProducto");
                     Datos[2]=rs.getString("cantidadExistente");
                     Datos[3]=rs.getString("precio");
                     Datos[4]=rs.getString("codigoTienda");
                     tabla.addRow(Datos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaProductos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else
        {
            mostrartodosproductos();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton codigo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JRadioButton todos;
    private javax.swing.JTextField txtcod;
    // End of variables declaration//GEN-END:variables
}
