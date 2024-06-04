import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        int upperCount = 0;
        int lowerCount = 0;

        // Count uppercase and lowercase letters
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        // Determine the conversion based on counts
        if (upperCount > lowerCount) {
            // Convert to uppercase
            word = word.toUpperCase();
        } else {
            // Convert to lowercase (also handles the case when upperCount == lowerCount)
            word = word.toLowerCase();
        }

        // Print the result
        System.out.println(word);
    }
}
