public class Task03 {
    public static void main(String[] args) {

        for (int i=1; i <=100; i++){
            System.out.println("Liczba: " + i +" jest parzysta: " + isEven(i));
        }

    }

    static boolean isEven(int number){
        boolean result = ((number%2) ==0);
        return result;
    }
}
