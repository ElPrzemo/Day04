public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSquare(2.5));

        System.out.println(isFive(4));
        boolean x = isFive(6);
        System.out.println(x);

        System.out.println(calculateSquare2(3.3));


    }

    static double calculateSquare (double number){
        double sq = number * number;
        return sq;
    }

    static boolean isFive(int number){
        boolean result = (number ==5);
        return result;
    }

    static double calculateSquare2(double number){
        return number * number;
    }

    static boolean isFive2 (int number){
        return (number ==5);
    }
}
