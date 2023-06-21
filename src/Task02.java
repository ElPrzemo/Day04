public class Task02 {
    public static void main(String[] args) {

        System.out.println(isEven(4));
        System.out.println(isEven(3));

    }

    static boolean isEven(int number){
        boolean result = ((number%2) ==0);
        return result;
    }
}
