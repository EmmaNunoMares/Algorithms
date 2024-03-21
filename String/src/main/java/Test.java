import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //String test = "Hello";
        //test.concat(" World");
        //System.out.println(test);

        String longestString = "ABABAB";
        String shortString = "ABAB";
        System.out.println(shortString.substring(0, 1));
        String test = new String(shortString);

        String potentialCommonDivisor = "";
        for (int i = shortString.length() - 1; i >= 0; i--) {
            shortString = shortString.substring(0, i);
            if (longestString.contains(shortString)) {
                potentialCommonDivisor = shortString;
            } else {
                System.out.println(potentialCommonDivisor);
            }
        }
        System.out.println(potentialCommonDivisor);
    }
}
