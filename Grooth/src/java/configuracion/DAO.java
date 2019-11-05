/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import configuracion.util.mensajes.msj;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sistemas
 */
public interface DAO<O, K, R> {

    msj insertar(O o);

    msj modificar(O o);

    msj Eliminar(K id);

    O convertir(R rs) throws SQLException;

    O uno(K id) throws SQLException;

    List<O> todos() throws SQLException;
}
