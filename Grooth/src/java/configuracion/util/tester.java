/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion.util;

import configuracion.Admin;
import configuracion.util.mensajes.msj;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import configuracion.AdminSql;
import java.util.List;
import modelo.tabs.clima;
import modelo.tabs.usuario;
import modelo.tabs.color;
import modelo.tabs.grado;

/**
 *
 * @author Sistemas
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tester t = new tester();
        t.test();
    }

    void test() {
        msj m = new msj();
        try {

            Admin a = new Admin();
            //List<grado> lu = a.getGrado().todos();
            usuario u = a.getUsuario().login("cdiaz", "79350403");
            System.out.println(u);

        } catch (SQLException ex) {
            m.setTipo("Code: " + ex.getErrorCode());
            m.setTipo(ex.getLocalizedMessage());
            m.setDetalle(ex.getMessage());
            System.out.println(m.toString());
        }

    }
}
