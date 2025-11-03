import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static String findMostFrequentWord(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return null;
        }

       
        String[] words = paragraph.toLowerCase().split("\\W+");

        // Use a HashMap to count frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

      
        String mostFrequent = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String paragraph = "This is a test paragraph. This paragraph has some words that repeat. This is a test.";
        String result = findMostFrequentWord(paragraph);
        System.out.println("Most frequent word: " + result); 
    }
}
