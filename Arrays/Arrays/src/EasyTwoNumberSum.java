import java.util.HashSet;
import java.util.Set;

public class EasyTwoNumberSum {

    public static void main(String[] args) {
        int array[] = {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        int[] result = EasyTwoNumberSum.twoNumberSum(array, targetSum);
        System.out.println(result[0]+", "+result[1]);
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> hashSet = new HashSet<>();
        int y = 0;
        for(int i=0; i<array.length; i++){
            y = targetSum - array[i];
            if(hashSet.contains(y)){
                return new int[]{array[i], y};
            }else {
                hashSet.add(array[i]);
            }
        }
        return new int[0];
    }
}