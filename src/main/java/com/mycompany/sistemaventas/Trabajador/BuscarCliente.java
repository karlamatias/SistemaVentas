
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
public class BuscarCliente extends javax.swing.JInternalFrame {
    Conexion con = new Conexion();
    Connection cn = con.Conectar();
    /*
    clase que implementa TableModel que 
    contiene todos los métodos necesarios para modificar 
    atos en su interior, añadir filas o columnas y 
    darle a cada columna el nombre que se desee
    */
    DefaultTableModel clientes;
   
    /**
     *
     */
    public BuscarCliente() {
        initComponents();
        mostrarclientes();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rddpi = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        txtdpi = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        txtcant = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CLIENTES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(null);

        buttonGroup1.add(rddpi);
        rddpi.setText("Buscar Clientes por DPI:");
        rddpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddpiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdtodo);
        rdtodo.setText("Mostrar todos los clientes");
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rddpi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdtodo))
                .addGap(58, 58, 58)
                .addComponent(btnbuscar)
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rddpi)
                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(8, 8, 8)
                .addComponent(rdtodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 690, 130);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cantidad de Registros");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 360, 170, 15);

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
        jScrollPane1.setViewportView(tbclientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 690, 160);

        txtcant.setEnabled(false);
        jPanel1.add(txtcant);
        txtcant.setBounds(350, 360, 50, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rddpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddpiActionPerformed
        // TODO add your handling code here:
        if(rddpi.isSelected()==true)
        {
            txtdpi.setEnabled(true);
            txtdpi.requestFocus();
        }
    }//GEN-LAST:event_rddpiActionPerformed

    
    void mostrarclientes()          
    {
        DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"NITCliente","nombreCliente","apellidoCliente","telefonoCliente","DPI","Credito","Correo","direccionCliente"};
        modelo.setColumnIdentifiers(Titulos);
         this.tbclientes.setModel(modelo);
        try {
            
            String ConsultaSQL="SELECT * FROM CLIENTE";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("NITCliente");
                registros[1]=rs.getString("nombreCliente");
                registros[2]=rs.getString("apellidoCliente");  
                registros[3]=rs.getString("telefonoCliente");
                registros[4]=rs.getString("DPI");
                registros[5]=rs.getString("Credito");
                registros[6]=rs.getString("Correo");
                registros[7]=rs.getString("direccionCliente");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
        // TODO add your handling code here:
        mostrarclientes();
        txtdpi.setText("");
        txtdpi.setEnabled(false);
    }//GEN-LAST:event_rdtodoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String dpi=txtdpi.getText();

        if(rddpi.isSelected()==true)
        {
            DefaultTableModel modelo= new DefaultTableModel();
            String []Titulos = {"NITCliente","nombreCliente","apellidoCliente","telefonoCliente","DPI","Credito","Correo","direccionCliente"};
            modelo.setColumnIdentifiers(Titulos);
            this.tbclientes.setModel(modelo);
            try {

                String ConsultaSQL="SELECT * FROM CLIENTE WHERE DPI='" +dpi+ "'";

                String []registros= new String[9];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while(rs.next())
                {
                     registros[0]=rs.getString("NITCliente");
                     registros[1]=rs.getString("nombreCliente");
                     registros[2]=rs.getString("apellidoCliente");  
                     registros[3]=rs.getString("telefonoCliente");
                     registros[4]=rs.getString("DPI");
                     registros[5]=rs.getString("Credito");
                     registros[6]=rs.getString("Correo");
                     registros[7]=rs.getString("direccionCliente");
                modelo.addRow(registros);;

                }
                tbclientes.setModel(modelo);
                txtcant.setText(""+tbclientes.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if(rdtodo.isSelected()==true)
        {
            mostrarclientes();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddpi;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtdpi;
    // End of variables declaration//GEN-END:variables
}
