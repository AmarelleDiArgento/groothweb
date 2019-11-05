/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion.util.mensajes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sistemas
 */
public abstract class mensajero {

    public msj m = new msj();

    public msj Error() {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, hago debió salir mal");
        m.setDetalle("por favor verifica la información ingresada");
        return m;
    }

    public msj notFound(Long Id) {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, hago debió salir mal");
        m.setDetalle("por favor verifica la información ingresada \n ID: " + Id + ", no se encuentra.");
        return m;
    }

    public msj notFound(String Id) {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, hago debió salir mal");
        m.setDetalle("por favor verifica la información ingresada \n ID: " + Id + ", no se encuentra.");
        return m;
    }

    public msj Error(SQLException ex) {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, hago debió salir mal");
        m.setDetalle("!ERROR¡ SQL \n Error: " + ex.getMessage() + ". \n Detalle: \n" + ex);
        return m;
    }

    public msj Error(Exception ex) {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, hago debió salir mal");
        m.setDetalle("!ERROR¡ \n Error: " + ex.getMessage() + ". \n Detalle: \n" + ex);
        return m;
    }

    public msj NotAccess() {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, No debes entrar ahí");
        m.setDetalle("No tienes permisos para ingresar a esta area");
        return m;
    }

    public msj NotSession() {
        m.setTipo("Error");
        m.setTitulo("'¡Ups!, No has iniciado sesión");
        m.setDetalle("Debes iniciar sesion para poder acceder a esta area");
        return m;
    }

    public msj InsertOk(String nombre) {
        m.setTipo("Ok");
        m.setTitulo("Registro exitoso");
        m.setDetalle(nombre + ", se ha ingresado satisfactoriamente");
        return m;
    }

    public msj UpdateOk(String nombre) {
        m.setTipo("Ok");
        m.setTitulo("Actualizacion exitosa");
        m.setDetalle(nombre + ", se ha modificado satisfactoriamente");
        return m;
    }

    public msj DeleteOk(String nombre) {
        m.setTipo("Ok");
        m.setTitulo("Elimiando exitosa");
        m.setDetalle(nombre + ", se ha eliminado satisfactoriamente");
        return m;
    }

    public void StatClose(PreparedStatement ps) throws SQLException {
        if (ps != null) {
            ps.close();
        }
    }

    public void StatClose(PreparedStatement ps, ResultSet rs) throws SQLException {
        if (ps != null) {
            ps.close();
        }

        if (rs != null) {
            rs.close();
        }
    }
}
