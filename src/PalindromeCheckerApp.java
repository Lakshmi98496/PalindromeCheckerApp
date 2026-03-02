/**
 * =========================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * =========================================
 *
 * Use Case 8: LinkedList Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList by comparing first and last elements.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}