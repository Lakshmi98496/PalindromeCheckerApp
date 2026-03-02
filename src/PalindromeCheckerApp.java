import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = cleanedInput.length() - 1; i >= 0; i--) {
            reversed += cleanedInput.charAt(i);
        }

        // Check palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("Result: It is a PALINDROME ");
        } else {
            System.out.println("Result: It is NOT a palindrome ");
        }
    }
}