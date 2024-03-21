import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        int array[] = {4, 7, 1, 5, 3};
        System.out.print(solution(array));
    }

    public static int solution(int[] a) {
        Arrays.sort(a);
        Hashtable<Integer, Integer> dictionary = new Hashtable<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temporal = Math.abs(a[i] - a[j]);
                if (dictionary.containsKey(temporal)) {
                    dictionary.put(temporal, dictionary.get(temporal)+1);
                } else {
                    dictionary.put(temporal, 1);
                }
            }
        }
        List<Integer> output = dictionary.values().stream().collect(Collectors.toList());
        Collections.sort(output);
        System.out.println(output.get(output.size()-1));
        return 0;
    }
}
