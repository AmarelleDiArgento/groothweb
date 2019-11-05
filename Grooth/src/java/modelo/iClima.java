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
import modelo.inter.Clima;
import modelo.tabs.clima;

public class iClima implements Clima {

    Connection con;

    final String Insert = "EXEC ";
    final String Update = "EXEC ";
    final String Delete = "EXEC ";
    final String One = "EXEC ";
    final String All = "EXEC [dbo].[spmostrar_clima]";

    public iClima(Connection con) {
        this.con = con;
    }

    @Override
    public msj insertar(clima c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj modificar(clima c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj Eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clima convertir(ResultSet rs) throws SQLException {
        return new clima(
                rs.getLong("idclima"),
                rs.getString("finca"),
                rs.getDate("fecha"),
                rs.getFloat("tmax"),
                rs.getFloat("tmin"),
                rs.getFloat("t6am"),
                rs.getFloat("precipitacion")
        );
    }

    @Override
    public clima uno(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<clima> todos() throws SQLException {

        System.out.println("Llego");
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<clima> cl = new ArrayList<>();

        stat = con.prepareCall(All);
        rs = stat.executeQuery();
        while (rs.next()) {
            cl.add(convertir(rs));
        }
        return cl;
    }

}
