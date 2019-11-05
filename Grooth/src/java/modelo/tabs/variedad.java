/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tabs;

import java.io.Serializable;

/**
 *
 * @author Sistemas
 */
public class variedad implements Serializable {

    private long idVariedad;
    private String codi_Varied;
    private String nomb_varied;
    private String nomb_varco;
    private String imagen;
    private int idInventario;
    private long idColor;

    public variedad() {
    }

    public variedad(String codi_Varied, String nomb_varied, String nomb_varco, String imagen, int idInventario, long idColor) {
        this.codi_Varied = codi_Varied;
        this.nomb_varied = nomb_varied;
        this.nomb_varco = nomb_varco;
        this.imagen = imagen;
        this.idInventario = idInventario;
        this.idColor = idColor;
    }

    public variedad(long idVariedad, String codi_Varied, String nomb_varied, String nomb_varco, String imagen, int idInventario, long idColor) {
        this.idVariedad = idVariedad;
        this.codi_Varied = codi_Varied;
        this.nomb_varied = nomb_varied;
        this.nomb_varco = nomb_varco;
        this.imagen = imagen;
        this.idInventario = idInventario;
        this.idColor = idColor;
    }

    /**
     * @return the idVariedad
     */
    public long getIdVariedad() {
        return idVariedad;
    }

    /**
     * @param idVariedad the idVariedad to set
     */
    public void setIdVariedad(long idVariedad) {
        this.idVariedad = idVariedad;
    }

    /**
     * @return the codi_Varied
     */
    public String getCodi_Varied() {
        return codi_Varied;
    }

    /**
     * @param codi_Varied the codi_Varied to set
     */
    public void setCodi_Varied(String codi_Varied) {
        this.codi_Varied = codi_Varied;
    }

    /**
     * @return the nomb_varied
     */
    public String getNomb_varied() {
        return nomb_varied;
    }

    /**
     * @param nomb_varied the nomb_varied to set
     */
    public void setNomb_varied(String nomb_varied) {
        this.nomb_varied = nomb_varied;
    }

    /**
     * @return the nomb_varco
     */
    public String getNomb_varco() {
        return nomb_varco;
    }

    /**
     * @param nomb_varco the nomb_varco to set
     */
    public void setNomb_varco(String nomb_varco) {
        this.nomb_varco = nomb_varco;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the idInventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario the idInventario to set
     */
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    /**
     * @return the idColor
     */
    public long getIdColor() {
        return idColor;
    }

    /**
     * @param idColor the idColor to set
     */
    public void setIdColor(long idColor) {
        this.idColor = idColor;
    }

    @Override
    public String toString() {
        return "variedad{" + "idVariedad=" + idVariedad + ", codi_Varied=" + codi_Varied + ", nomb_varied=" + nomb_varied + ", nomb_varco=" + nomb_varco + ", imagen=" + imagen + ", idInventario=" + idInventario + ", idColor=" + idColor + '}';
    }

}
