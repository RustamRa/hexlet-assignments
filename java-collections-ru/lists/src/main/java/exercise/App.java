package exercise;

import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static void main(String[] args) {

    }

    public static boolean scrabble(String letters, String word) {
        String[] lettersArray = letters.split("");
        List<String> lettersList = Arrays.asList(lettersArray);
        String[] lettersWordArray = word.split("");
        List<String> lettersWordList = Arrays.asList(lettersWordArray);
        boolean find = false;
        for (String lw : lettersWordList) {
            find = false;
            for (String l : lettersList) {
                if (l.equalsIgnoreCase(lw)) {
                    find = true;
                    lettersList.set(lettersList.indexOf(l), "");
                    break;
                }
            }
            if (!find) {
                break;
            }
        }
        return find;
    }
}
//END
