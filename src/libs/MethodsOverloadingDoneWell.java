package libs;

public class MethodsOverloadingDoneWell {

    static int plusMethod(int a, int b){
        return a+b;
    }

    static double plusMethod(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        int x = (int) plusMethod(7.3, 4.5);
        int y = plusMethod(2,5);
    }
}
