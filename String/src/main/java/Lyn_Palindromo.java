public class Lyn_Palindromo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abacaba"));
    }

    public static boolean isPalindrome(String sample) {
        String[] variableNameArray = sample.split("");

        //Ciclo de forma incremental
        System.out.println("Incremental:   ");
        for (int index = 0; index < variableNameArray.length; index++) {
            System.out.print(variableNameArray[index]);
        }
        //Ciclo de forma decremental
        System.out.println("Decremental:   ");
        for (int index_2 = variableNameArray.length -1; index_2 >=0; index_2--) {
            System.out.print(variableNameArray[index_2]);
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        return false;
    }
}
