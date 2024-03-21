import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy_ProductSum {
    public static void main(String[] args) {
        List<Object> sample = new ArrayList<>();
        sample.add(5);
        sample.add(2);
        sample.add(Arrays.asList(7, -1));
        sample.add(3);
        sample.add(Arrays.asList(6, Arrays.asList(-13, 8), 4));
        System.out.println(productSum(sample));
    }

    public static int productSum(List<Object> array) {
        return helper(array,1);
    }

    public static int helper(List<Object> integers, int deepLevel) {
        int sum = 0;
        for (Object element : integers) {
            if (element instanceof Integer) {
                sum += (Integer) element;
            } else {
                sum += helper((List<Object>) element, deepLevel+1);
            }
        }
        return sum*deepLevel;
    }
}