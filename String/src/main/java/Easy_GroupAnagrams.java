import java.util.*;
import java.util.stream.Collectors;

public class Easy_GroupAnagrams {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        HashMap<String, List<String>> output = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            List<String> temporal = Arrays.asList(words.get(i).split(""));
            Collections.sort(temporal);
            StringBuilder helper = new StringBuilder();

            for (String letter : temporal) {
                helper.append(letter);
            }

            List<String> x;
            if (output.containsKey(helper.toString())) {
                x = output.get(helper.toString());
                x.add(words.get(i));
                output.put(helper.toString(), x );
            } else {
                x = new ArrayList<>();
                x.add(words.get(i));
                output.put(helper.toString(), x);
            }
        }
        return output.values().stream().collect(Collectors.toList());
    }
}