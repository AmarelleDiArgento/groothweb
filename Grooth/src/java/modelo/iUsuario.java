/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import configuracion.util.mensajes.mensajero;
import configuracion.util.mensajes.msj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.inter.Usuario;
import modelo.tabs.usuario;

public class iUsuario extends mensajero implements Usuario {

    Connection con;

    final String Insert = "EXEC ";
    final String Update = "EXEC ";
    final String Delete = "EXEC ";
    final String One = "EXEC ";
    final String All = "EXEC [dbo].[spmostrar_usuarios]";
    final String Login = "EXEC [dbo].[splogin]\n"
            + "		@usuario = ?,\n"
            + "		@password = ?";

    public iUsuario(Connection con) {
        this.con = con;
    }

    @Override
    public usuario login(String user, String pass) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        usuario u = null;
        try {
            ps = con.prepareCall(Login);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                u = convertir(rs);
            } else {
                m = notFound(user);
            }
        } catch (SQLException ex) {
            m = Error(ex);
        } finally {
            try {
                StatClose(ps, rs);
            } catch (SQLException ex) {
                m = Error(ex);
            }
        }
        return u;
    }

    @Override
    public msj insertar(usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj modificar(usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public msj Eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public usuario convertir(ResultSet rs) throws SQLException {
        return new usuario(
                rs.getLong("idtercero"),
                rs.getString("identificacion"),
                rs.getString("Nombre"),
                rs.getString("Usuario"),
                rs.getString("Acceso")
        );
    }

    @Override
    public usuario uno(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<usuario> todos() throws SQLException {
        System.out.println("Llego");
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<usuario> ul = new ArrayList<>();

        ps = con.prepareCall(All);
        rs = ps.executeQuery();
        while (rs.next()) {
            ul.add(convertir(rs));
        }
        return ul;
    }

}
