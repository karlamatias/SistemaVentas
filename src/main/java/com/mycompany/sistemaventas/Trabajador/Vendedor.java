
package com.mycompany.sistemaventas.Trabajador;

import com.mycompany.sistemaventas.conectar.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author karla
 */
public class Vendedor {
    
    PreparedStatement ps;
    ResultSet rs;

    Conexion con = new Conexion();
    Connection acceso;
    
    /**
     *
     * @param dpi
     * @param usuario
     * @return
     */
    public EntidadVendedor ValidarUsuario(String dpi, String usuario){
        EntidadVendedor vendedor = new EntidadVendedor();
        
        String sql = "SELECT * FROM VENDEDOR where DPI=? and usuarioVendedor=? ";
        
        try{
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dpi);
            ps.setString(2, usuario);
            rs = ps.executeQuery();
            
            //para buscar dentro de la base de datos.
            while (rs.next()){
            vendedor.setID(rs.getInt(1));
            vendedor.setDPI(rs.getInt(2));
            vendedor.setNombreVendedor(rs.getString(3));
            vendedor.setApellidoVendedor(rs.getString(4));
            vendedor.setTelefonoVendedor(rs.getString(5));
            vendedor.setUsuarioVendedor(rs.getString(6));
            }
            
        }catch (Exception e){
        
        }
        
        return vendedor; 
    
    }
} 
