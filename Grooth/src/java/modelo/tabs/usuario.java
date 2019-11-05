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
public class usuario implements Serializable {

    private Long idtercero;
    private String identificacion;
    private String Nombre;
    private String Usuario;
    private String Acceso;

    public usuario() {
    }

    public usuario(String identificacion, String Nombre, String Usuario, String Acceso) {
        this.identificacion = identificacion;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Acceso = Acceso;
    }

    public usuario(Long idtercero, String identificacion, String Nombre, String Usuario, String Acceso) {
        this.idtercero = idtercero;
        this.identificacion = identificacion;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Acceso = Acceso;
    }

    /**
     * @return the idtercero
     */
    public Long getIdtercero() {
        return idtercero;
    }

    /**
     * @param idtercero the idtercero to set
     */
    public void setIdtercero(Long idtercero) {
        this.idtercero = idtercero;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Acceso
     */
    public String getAcceso() {
        return Acceso;
    }

    /**
     * @param Acceso the Acceso to set
     */
    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }

    @Override
    public String toString() {
        return "usuario{" + "idtercero=" + idtercero + ", identificacion=" + identificacion + ", Nombre=" + Nombre + ", Usuario=" + Usuario + ", Acceso=" + Acceso + '}';
    }

}
