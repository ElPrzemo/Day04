package cinema;

import cinema.movi.Movie;

public class Cinema {
    public static void main(String[] args) {

        Movie movie = new Movie();


        Movie m2 = new Movie();

        movie.showInfo();

        m2.play();

        movie.setTitle("star wars");
        movie.play();

    }
}
