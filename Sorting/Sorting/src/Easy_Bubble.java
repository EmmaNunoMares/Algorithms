public class Easy_Bubble {

    public static void main(String[] args) {
        int[] sample = {8, 5, 2, 9, 5, 6, 3};
        //int[] sample = {2, 1};
        System.out.println(bubbleSort(sample));
    }

    public static int[] bubbleSort(int[] array) {
        int iteration = array.length;
        while (iteration >= 2) {
            int swap = 0;
            for (int i = 1; i<iteration; i++) {
                if(array[i-1] > array[i]){
                    swap = array[i-1];
                    array[i-1] = array[i];
                    array[i] = swap;
                }
            }
            iteration -= 1;
        }
        return array;
    }
}