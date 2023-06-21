package Homework;

import java.util.Scanner;

public class Homework {

    static final int lowestScore = 0;
    static final  int highestScore= 100;
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int score1 = 0;
        do {
            System.out.println("Podaj ocenę z kolokwium numer jeden (możliwy zakres tylko od 0 do 100): ");
            score1 = scanner.nextInt();

            if (score1 < lowestScore || score1 > highestScore) {
                System.out.println("Podana liczba jest poza zakresem.");
                System.out.println();
            }
        } while (score1 < lowestScore || score1 > highestScore);

        int score2 = 0;
        do {
            System.out.println("Podaj ocenę z kolokwium numer jeden (możliwy zakres tylko od 0 do 100): ");
            score2 = scanner.nextInt();

            if (score2 < lowestScore || score2 > highestScore) {
                System.out.println("Podana liczba jest poza zakresem.");
                System.out.println();
            }
        } while (score2 < lowestScore || score2 > highestScore);

        int score3 = 0;
        do {
            System.out.println("Podaj ocenę z kolokwium numer jeden (możliwy zakres tylko od 0 do 100): ");
            score3 = scanner.nextInt();

            if (score3 < lowestScore || score3 > highestScore) {
                System.out.println("Podana liczba jest poza zakresem.");
                System.out.println();
            }
        } while (score3 < lowestScore || score3 > highestScore);


        scanner.close();

        double medium =(double)((score1 + score2 + score3) / 3);


        System.out.println("Średnia ocen z kolokwium to: "+ medium);




        if(medium > 0 && medium <60){
            System.out.println("Sory kolego, musisz bardziej się uczyć, Twoja ocena to JEDYNKA");
        } else if (medium>60 && medium<70) {
            System.out.println("No kolego, DWÓJECZKA. Jak Cie mogę, stać Cię na więcej");
            
        } else if (medium>70 && medium<80) {
            System.out.println("TRÓJKA a powiem że nawet może być");

        } else if (medium>80 && medium<90) {
            System.out.println("No Panie kolego. CZWÓRECZKA, ktoś tu się chyba uczył, bardzo fajnie :) ");

        } else if (medium>90 && medium <=100){
            System.out.println("Chyba mamy tutaj jakiegoś Prymusa, ocena to PIĄTECZKA. Moje gratulacje Panie kolego");
        }


    }}
