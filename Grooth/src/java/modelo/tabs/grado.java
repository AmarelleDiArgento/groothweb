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
public class grado implements Serializable {

    private Long idGrado;
    private String codi_Grado;
    private String nomb_Grado;

    public grado() {
    }

    public grado(String codi_Grado, String nomb_Grado) {
        this.codi_Grado = codi_Grado;
        this.nomb_Grado = nomb_Grado;
    }

    public grado(Long idGrado, String codi_Grado, String nomb_Grado) {
        this.idGrado = idGrado;
        this.codi_Grado = codi_Grado;
        this.nomb_Grado = nomb_Grado;
    }

    /**
     * @return the idGrado
     */
    public Long getIdGrado() {
        return idGrado;
    }

    /**
     * @param idGrado the idGrado to set
     */
    public void setIdGrado(Long idGrado) {
        this.idGrado = idGrado;
    }

    /**
     * @return the codi_Grado
     */
    public String getCodi_Grado() {
        return codi_Grado;
    }

    /**
     * @param codi_Grado the codi_Grado to set
     */
    public void setCodi_Grado(String codi_Grado) {
        this.codi_Grado = codi_Grado;
    }

    /**
     * @return the nomb_Grado
     */
    public String getNomb_Grado() {
        return nomb_Grado;
    }

    /**
     * @param nomb_Grado the nomb_Grado to set
     */
    public void setNomb_Grado(String nomb_Grado) {
        this.nomb_Grado = nomb_Grado;
    }

    @Override
    public String toString() {
        return "Grado{" + "idGrado=" + idGrado + ", codi_Grado=" + codi_Grado + ", nomb_Grado=" + nomb_Grado + '}';
    }

}
