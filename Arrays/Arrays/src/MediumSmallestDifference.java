import java.util.Arrays;

public class MediumSmallestDifference {

    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] result = MediumSmallestDifference.smallestDifference(arrayOne, arrayTwo);
        System.out.println(result);
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] potentialOutput_Array = {0, 0};
        int potentialOutput_Dif = Integer.MAX_VALUE;
        int pOne = 0;
        int pTwo = 0;

        while (pOne < arrayOne.length && pTwo < arrayTwo.length) {

            int one = arrayOne[pOne];
            int two = arrayTwo[pTwo];
            int result = Math.abs((one - two));

            if (result == 0) {
                return new int[]{one, two};
            }

            if (one < two) {
                pOne++;
                if (result < potentialOutput_Dif) {
                    potentialOutput_Array[0] = one;
                    potentialOutput_Array[1] = two;
                    potentialOutput_Dif = result;
                }
            } else {
                pTwo++;
                if (result < potentialOutput_Dif) {
                    potentialOutput_Array[0] = one;
                    potentialOutput_Array[1] = two;
                    potentialOutput_Dif = result;
                }
            }
        }
        return potentialOutput_Array;
    }
}