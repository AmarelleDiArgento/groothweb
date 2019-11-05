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
import modelo.inter.Grado;
import modelo.tabs.grado;

public class iGrado implements Grado {

    Connection con;

    final String Insert = "EXEC ";
    final String Update = "EXEC ";
    final String Delete = "EXEC ";
    final String One = "EXEC ";
    final String All = "EXEC [dbo].[spmostrar_grado]";

    public iGrado(Connection con) {
        this.con = con;
    }

    @Override
    public msj insertar(grado g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj modificar(grado g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj Eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public grado convertir(ResultSet rs) throws SQLException {
        return new grado(
                rs.getLong("idGrado"),
                rs.getString("Codi_Grado"),
                rs.getString("Nomb_Grado"));
    }

    @Override
    public grado uno(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<grado> todos() throws SQLException {

        System.out.println("Llego");
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<grado> gl = new ArrayList<>();

        stat = con.prepareCall(All);
        rs = stat.executeQuery();
        while (rs.next()) {
            gl.add(convertir(rs));
        }
        return gl;
    }

}
