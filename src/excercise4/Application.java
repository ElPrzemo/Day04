package excercise4;

import excercise4.language.LangUtill;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Podaj napis: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowelsCounter = 0;

        for (int i = 0; i< text.length(); i++){
            // pobieranie litery z danego miejsca w napisie
            char currentCharacter = text.charAt(i);
            if (LangUtill.isVowel(currentCharacter)){
                vowelsCounter ++;
            }
        }

        System.out.println("Liczba samogłosek to: " + vowelsCounter);

    }
}
