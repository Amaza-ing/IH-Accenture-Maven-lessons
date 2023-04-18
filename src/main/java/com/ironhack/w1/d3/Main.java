package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 100);
        Movie esdla = new Movie("El Señor de los Anillos", 200);
//        Movie otherMovie = harryPotter;
//        Movie newMovie = movieCreator("Star Wars", 120);
        Movie madMax = new Movie("Mad Max");

        System.out.println("Title: " + harryPotter.getTitle() + ". Duration: " + harryPotter.getDuration());
        System.out.println("Title: " + esdla.getTitle() + ". Duration: " + esdla.getDuration());
        System.out.println("Harry Potter: " + harryPotter);
        harryPotter.play();
        esdla.play();
        Movie.getAlert();
        System.out.println(harryPotter.IS_GOOD);
        System.out.println(madMax);

        HorrorMovie scream = new HorrorMovie("Scream", 130, false);
        System.out.println(scream.getTitle() + " " + scream.isReallyScary());
        System.out.println(scream);
        scream.play();

    }

//    public static Movie movieCreator(String title, int duration) {
//        return new Movie(title, duration);
//    }
}
