package com.directmedia.onlinestore.core.entity;

public class Work {
    private String title;
    private String genre;
    private int anneeSortie;
    private String summary;
    private Artist mainArtist;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getAnneeSortie() {
        return anneeSortie;
    }
    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public Artist getMainArtist() {
        return mainArtist;
    }
    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
        

    }
    public Work() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Work(String title) {
        super();
        this.title = title;

    }
    
    
}
