public class Easy_LongestPalindromeSubstring {
    public static void main(String[] args) {
        String sample = "abaxyzzyxf";
        //String sample = "a";
        //String sample = "aa";
        System.out.println(Easy_LongestPalindromeSubstring.longestPalindromicSubstring(sample));
    }

    public static String longestPalindromicSubstring(String str) {
        String potentialSubstring = "";
        str = str.trim();
        if(str.length() == 1 ){
            return str;
        }

        if(str.length() == 2){
            return getLongestPalindrome(str, 0,1);
        }

        for (int i = 1; i < str.length() - 1; i++) {
            String odd = getLongestPalindrome(str, i - 1, i + 1);
            String even = getLongestPalindrome(str, i - 1, i);
            if(odd.length() > even.length()){
                potentialSubstring = potentialSubstring.length() > odd.length() ? potentialSubstring : odd;
            } else {
                potentialSubstring = potentialSubstring.length() > even.length() ? potentialSubstring : even;
            }
        }
        return potentialSubstring;
    }

    public static String getLongestPalindrome(String sample, int left, int right) {
        while (left >= 0 && right < sample.length()) {
            if(sample.charAt(left) != sample.charAt(right)){
                break;
            }
            left-=1;
            right+=1;
        }
        return sample.substring(left+1,right);
    }
}