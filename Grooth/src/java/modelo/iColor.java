/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import configuracion.util.mensajes.msj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.inter.Color;
import modelo.tabs.color;
import modelo.tabs.color;

public class iColor implements Color {

    Connection con;

    final String Insert = "EXEC ";
    final String Update = "EXEC ";
    final String Delete = "EXEC ";
    final String One = "EXEC ";
    final String All = "EXEC [dbo].[spmostrar_colores]";

    public iColor(Connection con) {
        this.con = con;
    }

    @Override
    public msj insertar(color c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj modificar(color c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj Eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public color convertir(ResultSet rs) throws SQLException {
        return new color(
                rs.getLong("idcolor"),
                rs.getString("codi_color"),
                rs.getString("nomb_color"));
    }

    @Override
    public color uno(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<color> todos() throws SQLException {

        System.out.println("Llego");
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<color> cl = new ArrayList<>();

        stat = con.prepareCall(All);
        rs = stat.executeQuery();
        while (rs.next()) {
            cl.add(convertir(rs));
        }
        return cl;
    }

}
