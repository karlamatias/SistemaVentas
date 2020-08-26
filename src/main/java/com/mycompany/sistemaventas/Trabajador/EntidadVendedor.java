
package com.mycompany.sistemaventas.Trabajador;

/**
 *
 * @author karla
 */
public class EntidadVendedor {
    int ID;
    int DPI;
    String nombreVendedor;
    String apellidoVendedor;
    String telefonoVendedor;
    String usuarioVendedor;
    
    /**
     *
     */
    public EntidadVendedor(){
    }
    
    /**
     *
     * @param Id
     * @param dpi
     * @param nombre
     * @param apellido
     * @param telefono
     * @param usuario
     */
    public EntidadVendedor(int Id, int dpi, String nombre, String apellido, String telefono, String usuario){
        this.ID = Id;
        this.DPI = dpi;
        this.nombreVendedor =  nombre;
        this.apellidoVendedor = apellido;
        this.telefonoVendedor = telefono;
        this.usuarioVendedor = usuario;
    
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    public int getDPI() {
        return DPI;
    }

    /**
     *
     * @param DPI
     */
    public void setDPI(int DPI) {
        this.DPI = DPI;
    }
    
    /**
     *
     * @return
     */
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    /**
     *
     * @param nombreVendedor
     */
    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    /**
     *
     * @return
     */
    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    /**
     *
     * @param apellidoVendedor
     */
    public void setApellidoVendedor(String apellidoVendedor) {
        this.apellidoVendedor = apellidoVendedor;
    }

    /**
     *
     * @return
     */
    public String getTelefonoVendedor() {
        return telefonoVendedor;
    }

    /**
     *
     * @param telefonoVendedor
     */
    public void setTelefonoVendedor(String telefonoVendedor) {
        this.telefonoVendedor = telefonoVendedor;
    }

    /**
     *
     * @return
     */
    public String getUsuarioVendedor() {
        return usuarioVendedor;
    }

    /**
     *
     * @param usuarioVendedor
     */
    public void setUsuarioVendedor(String usuarioVendedor) {
        this.usuarioVendedor = usuarioVendedor;
    }
    
    
}
