 package com.mycompany.sistemaventas.Trabajador;

import com.mycompany.sistemaventas.principal.IngresoPrincipal;

/**
 *
 * @author karla
 */
public class PrincipalTrabajadores extends javax.swing.JFrame {

    /**
     *
     */
    public PrincipalTrabajadores() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        tienda = new javax.swing.JMenu();
        consultatienda = new javax.swing.JMenuItem();
        nuevatienda = new javax.swing.JMenuItem();
        ingresarvendedor = new javax.swing.JMenuItem();
        producto = new javax.swing.JMenu();
        consultaPro = new javax.swing.JMenuItem();
        modificarPro = new javax.swing.JMenuItem();
        pedidos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenu();
        consultaCli = new javax.swing.JMenuItem();
        nuevoCli = new javax.swing.JMenuItem();
        tiempo = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 153, 0));
        escritorio.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/top_logo_new_white.png")); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(6, 6, 340, 103);

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 102, 0));

        tienda.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/tienda.png")); // NOI18N
        tienda.setText("Tienda ");

        consultatienda.setText("Consulta");
        consultatienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultatiendaActionPerformed(evt);
            }
        });
        tienda.add(consultatienda);

        nuevatienda.setText("Nueva Tienda");
        nuevatienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevatiendaActionPerformed(evt);
            }
        });
        tienda.add(nuevatienda);

        ingresarvendedor.setText("Ingresar Vendedor");
        ingresarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarvendedorActionPerformed(evt);
            }
        });
        tienda.add(ingresarvendedor);

        jMenuBar1.add(tienda);

        producto.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/Productos.png")); // NOI18N
        producto.setText("Productos");

        consultaPro.setText("Consulta");
        consultaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProActionPerformed(evt);
            }
        });
        producto.add(consultaPro);

        modificarPro.setText("Modificar Productos");
        modificarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProActionPerformed(evt);
            }
        });
        producto.add(modificarPro);

        jMenuBar1.add(producto);

        pedidos.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/pedidos.png")); // NOI18N
        pedidos.setText("Pedidos");
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Nuevo Pedido");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        pedidos.add(jMenuItem1);

        jMenuBar1.add(pedidos);

        clientes.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/clientes.png")); // NOI18N
        clientes.setText("Clientes");

        consultaCli.setText("Consulta");
        consultaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCliActionPerformed(evt);
            }
        });
        clientes.add(consultaCli);

        nuevoCli.setText("Nuevo Cliente");
        nuevoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoCliActionPerformed(evt);
            }
        });
        clientes.add(nuevoCli);

        jMenuBar1.add(clientes);

        tiempo.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/tiempo.png")); // NOI18N
        tiempo.setText("Tiempo");
        jMenuBar1.add(tiempo);

        salir.setIcon(new javax.swing.ImageIcon("/home/karla/NetBeansProjects/SistemaVentas/src/main/resources/Imagenes/salir.png")); // NOI18N
        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaCliActionPerformed
        BuscarCliente cliente = new BuscarCliente();
        escritorio.add(cliente);
        cliente.show();
    }//GEN-LAST:event_consultaCliActionPerformed

    private void consultaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProActionPerformed
        ConsultaProductos productos= new ConsultaProductos();
        escritorio.add(productos);
        productos.show();
    }//GEN-LAST:event_consultaProActionPerformed

    private void modificarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProActionPerformed
        NuevosProductos productos= new NuevosProductos();
        escritorio.add(productos);
        productos.show();
    }//GEN-LAST:event_modificarProActionPerformed

    private void nuevoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoCliActionPerformed
        IngresoClientes clientes = new IngresoClientes();
        escritorio.add(clientes);
        clientes.show();
    }//GEN-LAST:event_nuevoCliActionPerformed

    private void ingresarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarvendedorActionPerformed
        IngresarVendedores vendedor = new IngresarVendedores();
        escritorio.add(vendedor);
        vendedor.show();
    }//GEN-LAST:event_ingresarvendedorActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        
    }//GEN-LAST:event_pedidosActionPerformed

    private void nuevatiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevatiendaActionPerformed
        IngresoTiendas tienda = new IngresoTiendas();
        escritorio.add(tienda);
        tienda.show();
    }//GEN-LAST:event_nuevatiendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IngresoPedidos pedido = new IngresoPedidos();
        escritorio.add(pedido);
        pedido.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       
    }//GEN-LAST:event_salirActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        IngresoPrincipal principal = new IngresoPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void consultatiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultatiendaActionPerformed
        ConsultaTienda tienda = new ConsultaTienda();
        escritorio.add(tienda);
        tienda.show();;
    }//GEN-LAST:event_consultatiendaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalTrabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem consultaCli;
    private javax.swing.JMenuItem consultaPro;
    private javax.swing.JMenuItem consultatienda;
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenuItem ingresarvendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem modificarPro;
    private javax.swing.JMenuItem nuevatienda;
    private javax.swing.JMenuItem nuevoCli;
    private javax.swing.JMenu pedidos;
    private javax.swing.JMenu producto;
    private javax.swing.JMenu salir;
    private javax.swing.JMenu tiempo;
    private javax.swing.JMenu tienda;
    // End of variables declaration//GEN-END:variables
}
