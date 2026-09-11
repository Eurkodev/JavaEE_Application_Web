package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {
    public static void main(String[] args) {
    
       
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
        
        Catalogue catalogue = new Catalogue();
         
        catalogue.listOfWorks.add(leGendarmeDeSaintTropez);
        catalogue.listOfWorks.add(bad);
        catalogue.listOfWorks.add(minorityReport);

        for(Work w : catalogue.listOfWorks) {
            System.out.println(w.getTitle() + " " + "(" + w.getAnneeSortie() + ")");
        
            
        }
    }
    
}
