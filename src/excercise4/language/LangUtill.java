package excercise4.language;

public class LangUtill {

    public static boolean isVowel(char letter){
        boolean result; // (x == 'a', 'ą', 'e', 'ę', 'i', 'o', 'u' ('ó'), 'y');

        switch (letter){
            //faltrough
            case 'a':
            case 'ą':
            case 'e':
            case 'ę':
            case 'i':
            case 'o':
            case 'u':
            case 'ó':
            case 'y':
            result=true;
            break;
            default:
                result=false;
        }
        return result;
    }
}
