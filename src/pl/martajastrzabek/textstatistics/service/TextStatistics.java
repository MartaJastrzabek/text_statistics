package pl.martajastrzabek.textstatistics.service;

public class TextStatistics {
    public int countWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public int countSigns(String text) {
        return text.length();
    }

    public int countSignsNoSpace(String text) {
        String textNoSpace = text.replace(" ", "");
        return textNoSpace.length();
    }

    public boolean isPalindrome(String text) {
        text = text.toLowerCase();
        String textWordCharactersOnly = text.replaceAll("[^a-zA-Z0-9ąęćłńóśżźĄĘĆŁŃÓŚŻŹ]", "");

        int i = 0;
        int j = textWordCharactersOnly.length() - 1;

        while (i < j) {
            if (textWordCharactersOnly.charAt(i) != textWordCharactersOnly.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
