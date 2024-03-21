public class Easy_Fibonacci {
    public static void main(String[] args) {
        System.out.println(getNthFib(6));
    }

    public static int getNthFib(int n) {
        int count = 3;
        int auxOne = 0; int auxTwo = 1;
        int helperTotal = 0;
        while (count <= n) {
            helperTotal = auxOne + auxTwo;
            auxOne = auxTwo;
            auxTwo = helperTotal;
            count++;
        }
        return n>1 ? auxTwo : auxOne;
    }
}
