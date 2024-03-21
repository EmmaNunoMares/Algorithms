public class Easy_GenerateDocumment {

    public static void main(String[] args) {
        String characters = "Bste!hetsi ogEApelrt x ";
        String document = "AlgoExpert is the Best!";
        System.out.println(generateDocument(characters, document));
    }
    public static boolean generateDocument(String characters, String document) {
        String[] docArray = document.split("");
        StringBuilder chars = new StringBuilder(characters);
        for (String letter: docArray) {
            int indexLetter = chars.indexOf(letter);
            if(indexLetter != -1){
                chars.deleteCharAt(indexLetter);
            }else {
                return false;
            }
        }
        return chars.length() == 0;
    }
}
