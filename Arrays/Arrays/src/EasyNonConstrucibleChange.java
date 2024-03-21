import java.util.Arrays;

public class EasyNonConstrucibleChange {
    public static void main(String[] args) {
        int[] sample = {5, 7, 1, 1, 2, 3, 22};
        System.out.print(nonConstructibleChange(sample));
    }

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentChange = 0;
        for (int coin: coins) {
            if (coin > currentChange+1){
                return currentChange+1;
            }
            currentChange += coin;
        }
        return currentChange+1;
    }
}
