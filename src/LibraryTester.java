import libs.AnotherLibrary;
import libs.SuberLib;

import java.util.Scanner;

// import statyczny, możemy odwoływać się do składników klasy, metod, zmiennych bez używania nazwy klasy
//import static libs.SuberLib.youAreCool;
//import static libs.SuberLib.youAreGreat;

import static libs.SuberLib.*;

public class LibraryTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        boolean isUserInputEven = MethodsLibrary.isEven(userInput);

        System.out.println("Czy jest parzysta " + isUserInputEven);

        AnotherLibrary.greet();

        youAreGreat("Wacław");
        youAreCool("Heniek");
        String greeting = SuberLib.GREETING;
        System.out.println(greeting);
    }
}
