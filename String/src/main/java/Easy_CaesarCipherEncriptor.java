public class Easy_CaesarCipherEncriptor {

    //char a = 'a';
    //char z = 'z';
    //System.out.println((int)a);//97
    //System.out.println((int)z);//122
    //System.out.println((char)97);//a
    //System.out.println((char)122);//z
    public static void main(String[] args) {
        String sample = "xyz";
        int key = 2;
        System.out.println(caesarCypherEncryptor(sample, key));
    }
    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder response = new StringBuilder();
        int moveCipher = key % 26;
        for (int i=0; i<=str.length()-1; i++){
            if (moveCipher == 0) {
                return str;
            }

            char tempChar = str.charAt(i);
            int temp = tempChar + moveCipher;
            if (temp<=122) {
                response.append((char) temp);
            }else {
                int adjustment = temp - 123 + 97;
                response.append((char) adjustment);
            }
        }
        return response.toString();
    }
}
