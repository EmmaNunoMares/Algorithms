public class Hard_QuickSort {
    public static void main(String[] args) {
        int[] sample = {8, 5, 2, 9, 5, 6, 3};
        quickSort(sample);
        for (int num : sample) {
            System.out.print(num + " ");
        }
    }

    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if(startIndex >= endIndex){
            return;
        }
        int pivotIndex = startIndex;
        int leftIndex = startIndex + 1;
        int rightIndex = endIndex;

        while (rightIndex >= leftIndex) {
            int pivot = array[pivotIndex];
            int left = array[leftIndex];
            int right = array[rightIndex];

            if (left > pivot && right < pivot) {
                swap(array, leftIndex, rightIndex);
            }
            if (left <= pivot) {
                leftIndex += 1;
            }
            if (right >= pivot) {
                rightIndex -= 1;
            }
        }
        swap(array, rightIndex, pivotIndex);
        boolean leftSubIsSmaller = rightIndex - 1 - startIndex < endIndex - (rightIndex + 1);
        if (leftSubIsSmaller) {
            quickSort(array, startIndex, rightIndex - 1);
            quickSort(array, rightIndex + 1, endIndex);
        } else {
            quickSort(array, rightIndex + 1, endIndex);
            quickSort(array, startIndex, rightIndex - 1);
        }
    }

    public static int[] swap(int[] array, int a, int b) {
        int swap = array[a];
        array[a] = array[b];
        array[b] = swap;
        return array;
    }
}
