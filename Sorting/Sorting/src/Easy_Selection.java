public class Easy_Selection {
    public static void main(String[] args) {
        int[] sample = {8, 5, 2, 9, 5, 6, 3};
        sample = selectionSort(sample);
        for (int num : sample) {
            System.out.print(num + " ");
        }
    }

    public static int[] selectionSort(int[] array) {
        int iteration = 0;
        while (iteration < array.length-1) {
            int potentialMatch = iteration;
            for (int i = 1+iteration; i < array.length; i++) {
                int a = array[i];
                int b = array[potentialMatch];
                if (a < b) {
                    potentialMatch = i;
                }
            }
            int swap = array[iteration];
            array[iteration] = array[potentialMatch];
            array[potentialMatch] = swap;
            iteration += 1;
        }
        return array;
    }
}