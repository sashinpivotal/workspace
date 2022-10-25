package misc2;

import java.util.Arrays;
import java.util.Locale;

public class WordCountingUsingOnlyArrays {

    public static void main(String[] args) {

        String initialSentence
                = "Hello I love Boston. Yes, you do Love Boston.";
        String upperCasedString = initialSentence.toUpperCase();

        String[] initialWords = initialSentence.split("[, ?.@]+");

        String[] uniqueWords = new String[initialWords.length];
        int[] numberOfTimes = new int[initialWords.length];
        int currentIndex = 0;

        for (int i = 0; i < initialWords.length; i++) {

            // if initialWords[i] is already found
            //   - then I need to know the index of the
            //     location where the previous word is located
            // else
            //   - use currentIndex to uniqueWords[currentIndex] = initialWords[i]
            //   - numberOfTimes[currentIndex] = 1
            String initialWord = initialWords[i];
            int foundIndex = isThisWordAlreadyFound(uniqueWords, initialWord);
            if (foundIndex >= 0) {
                numberOfTimes[foundIndex]++;
            } else {
                uniqueWords[currentIndex] = initialWord;
                numberOfTimes[currentIndex] = 1;
            }

        }

    }

    private static String[] makeAllWordsUpperCase(String[] initialWords) {
        String[] resultStringArray = new String[initialWords.length];
        for (int i = 0; i < initialWords.length; i++) {
            resultStringArray[i] = initialWords[i].toUpperCase();
        }
        return resultStringArray;
    }

    private static int isThisWordAlreadyFound(String[] uniqueWords, String initialWord) {
        int foundIndex = -1;
        for (int i = 0; i < uniqueWords.length; i++) {
            if (uniqueWords[i].equalsIgnoreCase(initialWord)) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }
}
