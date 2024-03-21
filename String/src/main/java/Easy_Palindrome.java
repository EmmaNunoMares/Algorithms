public class Easy_Palindrome {

    public static void main(String[] args) {
        String sample = "abcdcbaz";
        System.out.println(isPalindrome(sample));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int rigth = str.length() - 1;
        while (left < rigth) {
            char charLeft = str.charAt(left);
            char charRight = str.charAt(rigth);
            if (str.charAt(left) != str.charAt(rigth)) {
                return false;
            }
            left += 1;
            rigth -= 1;
        }
        return true;
    }
}
