public class Easy_Insertion {
    public static void main(String[] args) {
        int[] sample = {8, 5, 2, 9, 5, 6, 3};
        System.out.println(insertionSort(sample));
    }

    public static int[] insertionSort(int[] array) {
        int iteration = 1;
        while (iteration < array.length) {
            for (int index = iteration; index > 0; index--) {
                if (array[index] < array[index - 1]) {
                    int swap = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = swap;
                } else {
                    break;
                }
            }
            iteration += 1;
        }
        return array;
    }
}