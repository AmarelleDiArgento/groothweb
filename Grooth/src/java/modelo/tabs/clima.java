/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tabs;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Sistemas
 */
public class clima implements Serializable {

    private long idclima;
    private String finca;
    private Date fecha;
    private float tmax;
    private float tmin;
    private float t6am;
    private float precipitacion;

    public clima() {
    }

    public clima(String finca, Date fecha, float tmax, float tmin, float t6am, float precipitacion) {
        this.finca = finca;
        this.fecha = fecha;
        this.tmax = tmax;
        this.tmin = tmin;
        this.t6am = t6am;
        this.precipitacion = precipitacion;
    }

    public clima(long idclima, String finca, Date fecha, float tmax, float tmin, float t6am, float precipitacion) {
        this.idclima = idclima;
        this.finca = finca;
        this.fecha = fecha;
        this.tmax = tmax;
        this.tmin = tmin;
        this.t6am = t6am;
        this.precipitacion = precipitacion;
    }

    /**
     * @return the idclima
     */
    public long getIdclima() {
        return idclima;
    }

    /**
     * @param idclima the idclima to set
     */
    public void setIdclima(long idclima) {
        this.idclima = idclima;
    }

    /**
     * @return the finca
     */
    public String getFinca() {
        return finca;
    }

    /**
     * @param finca the finca to set
     */
    public void setFinca(String finca) {
        this.finca = finca;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tmax
     */
    public float getTmax() {
        return tmax;
    }

    /**
     * @param tmax the tmax to set
     */
    public void setTmax(float tmax) {
        this.tmax = tmax;
    }

    /**
     * @return the tmin
     */
    public float getTmin() {
        return tmin;
    }

    /**
     * @param tmin the tmin to set
     */
    public void setTmin(float tmin) {
        this.tmin = tmin;
    }

    /**
     * @return the t6am
     */
    public float getT6am() {
        return t6am;
    }

    /**
     * @param t6am the t6am to set
     */
    public void setT6am(float t6am) {
        this.t6am = t6am;
    }

    /**
     * @return the precipitacion
     */
    public float getPrecipitacion() {
        return precipitacion;
    }

    /**
     * @param precipitacion the precipitacion to set
     */
    public void setPrecipitacion(float precipitacion) {
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "clima{" + "idclima=" + idclima + ", finca=" + finca + ", fecha=" + fecha + ", tmax=" + tmax + ", tmin=" + tmin + ", t6am=" + t6am + ", precipitacion=" + precipitacion + '}';
    }

}
