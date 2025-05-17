package Labtask;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    private String name;
    private int date;

    public Q3(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public void display() {
        System.out.println("Q3's Name:" + name + " and Date:" + date);
    }

    public void update() {
        Scanner Movie = new Scanner(System.in);
        name = Movie.next();
        date = Movie.nextInt();
    }

    public static void main(String[] args) {

        Scanner Movie = new Scanner(System.in);

        System.out.println("How many Movies you want to create: ");
        int r = Movie.nextInt();

        ArrayList<Q3> MovieNobel = new ArrayList<Q3>(r);

        for (int i = 0; i < r; i++) {
            System.out.println("Enter name and Date for Movies: " + (i + 1));

            MovieNobel.add(new Q3(Movie.next(), Movie.nextInt()));
        }

        for (int i = 0; i < r; i++) {
            MovieNobel.get(i).display();
        }

        System.out.println("Enter the index number of a Movie you want to search:");
        int r2 = Movie.nextInt();
        MovieNobel.get(r2).display();
        System.out.println("Enter the index number in which position you want to update:");
        int r3 = Movie.nextInt();
        System.out.println("Enter name and date for that new Movie:");
        MovieNobel.set(r3, MovieNobel.get(r3)).update();
        System.out.println("After Updating: ");
        for (int i = 0; i < r; i++) {
            MovieNobel.get(i).display();
        }
        System.out.println("Enter the index number from where you want to remove a Movie: ");
        int MovieNobel4 = Movie.nextInt();
        MovieNobel.remove(MovieNobel4);
        System.out.println("After Removing: ");
        for (int i = 0; i < MovieNobel.size(); i++) {
            MovieNobel.get(i).display();
        }
    }
}
