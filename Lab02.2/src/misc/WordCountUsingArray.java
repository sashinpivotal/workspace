package misc;

import java.util.Arrays;

public class WordCountUsingArray {

    public static void main(String[] args) {

        String testString = "Hello I love Boston. Yes you do Love Boston.";
        String[] initialWords = testString.split("[, ?.@]+");
        String[] uniqueWords = new String[initialWords.length];
        int[] wordsCounter = new int[initialWords.length];
        int currentIndex = 0;
        for (String word : initialWords) {
            int wordAlreadyPresentIndex = isWordAlreadyPresent(uniqueWords, word);
            if (wordAlreadyPresentIndex > 0) {
                wordsCounter[wordAlreadyPresentIndex]++;
            } else {
                uniqueWords[currentIndex] = word;
                wordsCounter[currentIndex] = 1;
                currentIndex++;
            }
        }
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(uniqueWords[i] + ": " + wordsCounter[i]);
            System.out.println();
        }

        System.out.println(Arrays.toString(uniqueWords));
        System.out.println(Arrays.toString(wordsCounter));
    }

    private static int isWordAlreadyPresent(String[] uniqueWords, String word) {
        int index = 0;

        for (String uniqueWord : uniqueWords) {
            if (uniqueWord != null && uniqueWord.equalsIgnoreCase(word)) {
                return index;
            }
            index++;
        }
        return 0;
    }
}
