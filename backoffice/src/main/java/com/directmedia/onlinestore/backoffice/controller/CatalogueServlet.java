/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.directmedia.onlinestore.backoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.directmedia.onlinestore.core.entity.*;
/**
 *
 * @author yakobrachedi
 */
@WebServlet(name = "CatalogueServlet", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Catalogue catalogue;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
	if(Catalogue.listOfWorks.isEmpty()) {
	    
	Artist tomCruise = new Artist("Tom Cruise");
        Artist michealJackson = new Artist("Micheal Jackson");
        Artist louisDeFunes = new Artist("Louis De Funes");

        Work minorityReport = new Work("Minority Report");
        Work bad = new Work("Bad");
        Work leGendarmeDeSaintTropez = new Work("Le gendarme de Saint-Tropez");

        
        minorityReport.setMainArtist(tomCruise);
        bad.setMainArtist(michealJackson);
        leGendarmeDeSaintTropez.setMainArtist(louisDeFunes);
     
        minorityReport.setAnneeSortie(2002);
        bad.setAnneeSortie(1987);
        leGendarmeDeSaintTropez.setAnneeSortie(1964);
        
        minorityReport.setSummary("Minority Report, ou Rapport minoritaire au Québec, est un film de science-fiction américain réalisé par Steven Spielberg.");
        bad.setSummary(" est le 7e album solo de Michael Jackson et le dernier produit par Quincy Jones. Porté par le tube éponyme et son clip réalisé par Martin Scorsese, il marque un tournant vers une image plus virile et rebelle, s'écoulant à des millions d'exemplaires dans le monde.");
        leGendarmeDeSaintTropez.setSummary("Ludovic Cruchot, un gendarme très strict et ambitieux, est nommé à Saint-Tropez. Il découvre une équipe de collègues paresseux dirigée par l'adjudant Gerber.");
        
        minorityReport.setGenre("Science Fiction");
        bad.setGenre("Pop");
        leGendarmeDeSaintTropez.setGenre("Comédie");
        
            catalogue.listOfWorks.add(leGendarmeDeSaintTropez);
            catalogue.listOfWorks.add(bad);
            catalogue.listOfWorks.add(minorityReport);
        }

	    PrintWriter out = response.getWriter();
        out.print("<HTML><BODY><h1> Oeuvres au catalogue</h1><BR/><BR/>");     
        
        for(Work w : Catalogue.listOfWorks) {
            out.println(w.getTitle() + " " + "(" + w.getAnneeSortie() + ")<BR/>");
        }
        
        out.print("</BODY></HTML>");
        }

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CatalogueServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CatalogueServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
    

}
