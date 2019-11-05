/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import modelo.inter.Clima;
import modelo.inter.Color;
import modelo.inter.Grado;
import modelo.inter.Usuario;

/**
 *
 * @author Sistemas
 */
public interface AdminSql {

    Usuario getUsuario();

    Clima getClima();

    Color getColor();

    Grado getGrado();

}
