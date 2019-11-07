/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import configuracion.Admin;
import configuracion.util.mensajes.msj;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.tabs.usuario;

/**
 *
 * @author Sistemas
 */
public class loginCtrl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession ses = request.getSession(true);
        String ruta = "";

        usuario u = null;
        String usu;
        String pass;

        msj m = new msj();

        try {
            usu = request.getParameter("inputUsuario");
            pass = request.getParameter("inputPassword");

            Admin a = new Admin();

            u = a.getUsuario().login(usu, pass);
            if (u != null) {

                ses.setAttribute("log", u);
                m.setTipo("success");
                m.setTitulo("Bienvenido");
                m.setDetalle(u.getNombre());
                ruta = "home.jsp";

            } else {
                ses.setAttribute("log", null);
                m.setTipo("error");
                m.setTitulo("Datos invalidos");
                m.setDetalle("Verifica la informacion suministrada");
                ruta = "index.jsp";
            }
        } catch (SQLException ex) {
            ses.setAttribute("log", null);
            m.setTipo("error");
            m.setTitulo("Codigo: " + ex.getErrorCode());
            m.setDetalle(ex.getMessage());
            ruta = "index.jsp";

        }

        /* TODO output your page here. You may use following sample code. */
        ses.setAttribute("msj", m);
        request.getRequestDispatcher(ruta).forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
