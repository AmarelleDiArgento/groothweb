/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion.util.mensajes;

import java.io.Serializable;

/**
 *
 * @author Sistemas
 */
public class msj implements Serializable {

    private String Tipo;
    private String Titulo;
    private String Detalle;

    public msj() {
    }

    public msj(String Tipo, String Titulo, String Detalle) {
        this.Tipo = Tipo;
        this.Titulo = Titulo;
        this.Detalle = Detalle;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Detalle
     */
    public String getDetalle() {
        return Detalle;
    }

    /**
     * @param Detalle the Detalle to set
     */
    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    @Override
    public String toString() {
        return "msj{\n" + "Tipo=" + Tipo + ", \nTitulo=" + Titulo + ", \nDetalle=" + Detalle + '}';
    }

}
