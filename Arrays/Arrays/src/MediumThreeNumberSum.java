import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediumThreeNumberSum {

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> result = MediumThreeNumberSum.threeNumberSum(array, targetSum);
        System.out.println(result);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(array);

        for (int index = 0; index <= array.length-3; index++) {
            int cS = 0;
            int cN = array[index];
            int indexL = index+1;
            int indexR = array.length-1;

            while (indexL<indexR){
                int l = array[indexL];
                int r = array[indexR];
                cS = cN + l + r;

                if(cS == targetSum){
                    output.add(new Integer[]{cN, l, r});
                    indexL++;
                    indexR--;
                }else {
                    if(cS < targetSum){
                        indexL++;
                    }else {
                        indexR--;
                    }
                }
            }
        }
        return output;
    }
}
