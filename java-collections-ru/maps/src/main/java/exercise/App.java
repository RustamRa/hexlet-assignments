package exercise;

import java.util.Map;
import java.util.HashMap;


// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static Map getWordCount(String sentence) {
        HashMap<String, Integer> wordsCount = new HashMap<>();
        int count = 1;
        if (!sentence.isEmpty()) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                wordsCount.put(word, wordsCount.getOrDefault(word, 0) + count);
            }
        }
        return wordsCount;
    }

    public static String toString(Map dictionary) {
        Map<String, Integer> hmDictionary = new HashMap<>(dictionary);
        String result = "";
        if (!dictionary.isEmpty()) {
            result = "{" + "\n";
            for (String key : hmDictionary.keySet()) {
                result = result + "  " + key + ": " + hmDictionary.get(key) + "\n";
            }
            result = result + "}";
        } else {
            result = "{}";
        }
        return result;
    }
}
//END
