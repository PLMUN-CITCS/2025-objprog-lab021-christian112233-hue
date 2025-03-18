import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        // Check if the sentence is empty
        if (sentence.isEmpty()) {
            System.out.println("The sentence has 0 words.");
        } else {
            // Split sentence into words using whitespace as delimiter
            String[] words = sentence.split("\\s+");
            System.out.println("The sentence has " + words.length + " words.");
        }

        scanner.close();
    }
}
