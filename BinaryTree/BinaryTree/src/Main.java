import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        int[] sample_00 = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        //System.out.println(test.longestArithSeqLength(sample_00));
        System.out.print(test.longestConsecutive(sample_00));
    }

    //https://leetcode.com/problems/longest-arithmetic-subsequence/description/
    public int longestArithSeqLength(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> helper = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = Math.abs(nums[j] - nums[i]);

                /**
                 int temp = Math.abs(nums[i-1] - nums[i]);
                 if(helper.containsKey(temp)){
                 helper.put(temp, helper.get(temp)+1);
                 }else {
                 helper.put(temp, 1);
                 }*/
            }
        }

        return 0;
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int help = 0;
        int maxSoFar = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    help += 1;
                } else {
                    maxSoFar = maxSoFar < help ? help : maxSoFar;
                    help = 0;
                }
            }
        }
        return Math.max(maxSoFar, help) + 1;
    }
}