public class MediumLongestPeak {
    public static void main(String[] args) {
        //int[] sample = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int[] sample = {1, 3, 2};
        System.out.print(longestPeak(sample));
    }

    public static int longestPeak(int[] array) {
        int sizePick = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                //Calculate Peak Size
                int temp = 3 + getSize(i, 1, array) + getSize(i, -1, array);
                if (temp > sizePick) {
                    sizePick = temp;
                }
            }
        }
        return sizePick;
    }

    public static int getSize(int index, int step, int[] array) {
        int sizeSide = 0;
        while (index + step > 0 && index + step < array.length-1) {
            index += step;
            if (array[index] > array[index + step]) {
                sizeSide += 1;
            } else {
                break;
            }
        }
        return sizeSide;
    }
}