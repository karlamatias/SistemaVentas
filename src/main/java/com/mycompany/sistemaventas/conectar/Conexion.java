
package com.mycompany.sistemaventas.conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author karla
 */
public class Conexion {
    
    Connection cn = null;
     String url = "jdbc:mysql://localhost:3306/SistemaVentas?useSSL=false";
     String user = "UsuarioVentas";
     String password = "Ventas12345";
    
    /**
     *
     * @return cn
     */
    public Connection Conectar() {
        
        try{
            cn = DriverManager.getConnection(url, user, password);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return cn;     
                
    
    }

    
    
}
