public class Easy_RunLengthEncoding {
    public static void main(String[] args) {
        String sample = "AAAAAAAAAAAAABBCCCCDD";
        System.out.println(runLengthEncoding(sample));
    }

    public static String runLengthEncoding(String string) {
        StringBuilder output = new StringBuilder();
        String[] arrayString = string.split("");

        int counter = 1;
        for (int i = 0; i < arrayString.length; i++) {
            if (i+1<arrayString.length && arrayString[i].equals(arrayString[i+1]) && counter < 9) {
                counter += 1;
            } else {
                output.append(counter + arrayString[i]);
                counter = 1;
            }
        }
        return output.toString();
    }
}