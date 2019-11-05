/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;
import modelo.iClima;
import modelo.iColor;
import modelo.iGrado;
import modelo.iUsuario;
import modelo.inter.Clima;
import modelo.inter.Color;
import modelo.inter.Grado;
import modelo.inter.Usuario;

public class Admin implements AdminSql {

    Connection con;
    DataSource ds;

    final String User = "Taller1";
    final String Pass = "Taller1";
    final String DataBase = "taller1";
    final String Url = "jdbc:mysql://localhost:3306/";

    Usuario usu = null;
    Clima cli = null;
    Color col = null;
    Grado gra = null;

    // Conexion directa, con seguridad integrada
    public Admin() throws SQLException {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://PHY-SRV-DES\\PHYTOTEC;databaseName=Phytodata;integratedSecurity=true");

        } catch (ClassNotFoundException e) {
            System.out.println("Error Class Not Found: \n" + e);
        }

    }

    // Conexion Pool, pendiente. (Requiere controlador)
    public Admin(DataSource ds) throws SQLException {
        this.ds = ds;
        this.con = ds.getConnection();
    }

    @Override
    public Usuario getUsuario() {
        if (usu == null) {
            System.out.println("Hola");
            usu = new iUsuario(con);
        }
        return usu;
    }

    @Override
    public Clima getClima() {
        if (cli == null) {
            System.out.println("Hola");
            cli = new iClima(con);
        }
        return cli;
    }

    @Override
    public Color getColor() {
        if (col == null) {
            System.out.println("Hola");
            col = new iColor(con);
        }
        return col;
    }

    @Override
    public Grado getGrado() {
        if (gra == null) {
            System.out.println("Hola");
            gra = new iGrado(con);
        }
        return gra;
    }

}
