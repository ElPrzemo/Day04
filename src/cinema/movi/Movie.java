package cinema.movi;

import java.util.Locale;

public class Movie {
    private String title;

    private int productionYear;

    private double length;

    public void showInfo(){
        System.out.println("Film o tytule: "+ title + " nagrany w- " +productionYear + "trwa czasu "+ length);
    }

    public void play(){
        System.out.println("Odtwarzam film: " + title);

    }

    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }
}
