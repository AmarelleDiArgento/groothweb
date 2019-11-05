/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.inter;

import configuracion.DAO;
import java.sql.ResultSet;
import modelo.tabs.usuario;

/**
 *
 * @author Sistemas
 */
public interface Usuario extends DAO<usuario, Long, ResultSet> {

    usuario login(String user, String pass) ;

}
