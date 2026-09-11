package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import java.util.List;

public class Catalogue {
    
    public static HashSet<Work> listOfWorks = new HashSet();
    
    public static HashSet<Work> getListOfWorks() {
        for(Work w : listOfWorks) {
            System.out.println(w.getTitle() + " " + "(" + w.getAnneeSortie() + ")");
        }
        return listOfWorks;

       
    }
    
}
