/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.agy.football.servlets;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stagjava
 */
@WebServlet(name = "Donnees", urlPatterns = {"/donnees"})
public class Donnees extends HttpServlet {

    // Constantes
    public static final String VUE = "/WEB-INF/donnees.jsp";

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
        
        HashMap<String, String> urls = new HashMap<>();
        urls.put("Fédérations", "./Federation");
        urls.put("Compétitions", "./Competition");
        urls.put("Saisons", "./Saison");
        urls.put("Equipes", "./Equipe");
        urls.put("Journées", "./Journee");
        request.setAttribute("urls", urls);

        // Affichage du sous-menu données
        this.getServletContext().getRequestDispatcher(VUE).
                forward(request, response);
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
