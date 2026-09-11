package com.directmedia.onlinestore.frontoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import static com.directmedia.onlinestore.core.entity.Catalogue.listOfWorks;
import com.directmedia.onlinestore.core.entity.Work;


@WebServlet("/catalogue")
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
                
                
                
                
                
                
             
                
	    
	}




