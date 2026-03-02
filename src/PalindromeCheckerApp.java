/**
 * =========================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * =========================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using both Queue (FIFO) and Stack (LIFO).
 *
 * @author Developer
 * @version 6.0
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until queue becomes empty
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // front element
            char fromStack = stack.pop();    // top element

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}