public class Medium_ThreeNumberSort {
    public static void main(String[] args) {
        //int[] array = {1, 0, 0, -1, -1, 0, 1, 1};
        //int[] order = {0, 1, -1};
        int[] array = {-2,-3,-3,-3,-3,-3,-2,-2,-3};
        int[] order = {-2,-3,0};
        for (int n : threeNumberSort(array, order)) {
            System.out.print(n + " ");
        }
    }

    public static int[] threeNumberSort(int[] array, int[] order) {
        int first = 0;
        int second = 0;
        int third = array.length - 1;
        while (second <= third) {
            int value = array[second];
            if (value == order[0]) {
                array = swap(array, first, second);
                first += 1;
                second += 1;
            } else if (value == order[1]) {
                second += 1;
            } else {
                array = swap(array, second, third);
                third -=1;
            }
        }
        return array;
    }

    public static int[] swap(int[] array, int a, int b) {
        int swap = array[a];
        array[a] = array[b];
        array[b] = swap;
        return array;
    }
}