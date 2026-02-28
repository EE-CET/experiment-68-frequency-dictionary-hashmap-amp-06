import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().trim();
        String[] words = text.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        StringBuilder output = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            output.append(entry.getKey())
                  .append(": ")
                  .append(entry.getValue())
                  .append("\n");
        }

        System.out.print(output.toString());

        scanner.close();
    }
}
