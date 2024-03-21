import java.util.*;
import java.util.stream.Collectors;

public class Easy_CommonCharacters {

    public static void main(String[] args) {
        String[] sample = new String[]{"abc", "bcd", "cbaccd"};
        for (String x : commonCharacters(sample)){
            System.out.print(x);
        }
    }

    public static String[] commonCharacters(String[] strings) {
        String[] letters = strings[0].split("");
        Set<String> potentialMatch = new HashSet<>();

        for (String letter : letters) {
            potentialMatch.add(letter);
        }
        for (int i = 1; i < strings.length; i++) {
            Set<String> temporal = new HashSet<>();
            Iterator iterator = potentialMatch.iterator();
            while (iterator.hasNext()) {
                String value = (String) iterator.next();
                if (strings[i].contains(value)) {
                    temporal.add(value);
                }
            }
            potentialMatch = temporal;
        }

        String out[] = new String[potentialMatch.size()];
        potentialMatch.toArray(out);
        return out;
    }
}