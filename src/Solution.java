import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a single line of text
        String text = scanner.nextLine();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequencies
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Print words and their counts
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
