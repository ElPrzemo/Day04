import java.util.Scanner;

public class LocalVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber1;
        int userNumber2;

        userNumber1 = scanner.nextInt();
        userNumber2 = scanner.nextInt();

        sum(userNumber1, userNumber2);

        //nie działa bo ma zasięg tylko w sum
        //System.out.println(total);
        //System.out.println(num1);
    }

    static void sum(int num1, int num2){
        int total;
        total = num1 + num2;
        System.out.println("Suma to: "+ total);

        //istnieje tylko w main
        //System.out.println(userNumber1);
    }
}
