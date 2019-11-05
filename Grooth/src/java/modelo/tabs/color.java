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
public class color implements Serializable {

    private Long idColor;
    private String codi_color;
    private String nomb_color;

    public color() {
    }

    public color(String codi_color, String nomb_color) {
        this.codi_color = codi_color;
        this.nomb_color = nomb_color;
    }

    public color(Long idColor, String codi_color, String nomb_color) {
        this.idColor = idColor;
        this.codi_color = codi_color;
        this.nomb_color = nomb_color;
    }

    /**
     * @return the idColor
     */
    public Long getIdcolor() {
        return idColor;
    }

    /**
     * @param idColor the idColor to set
     */
    public void setIdcolor(Long idColor) {
        this.idColor = idColor;
    }

    /**
     * @return the codi_color
     */
    public String getCodi_color() {
        return codi_color;
    }

    /**
     * @param codi_color the codi_color to set
     */
    public void setCodi_color(String codi_color) {
        this.codi_color = codi_color;
    }

    /**
     * @return the nomb_color
     */
    public String getNomb_color() {
        return nomb_color;
    }

    /**
     * @param nomb_color the nomb_color to set
     */
    public void setNomb_color(String nomb_color) {
        this.nomb_color = nomb_color;
    }

    @Override
    public String toString() {
        return "color{" + "idColor=" + idColor + ", codi_color=" + codi_color + ", nomb_color=" + nomb_color + '}';
    }

}
