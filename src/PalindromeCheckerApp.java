/**
 * =====================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 12: Strategy Pattern – Stack Implementation
 *
 * Description:
 * This class uses the PalindromeStrategy interface
 * and StackStrategy implementation to validate palindrome.
 *
 * Demonstrates Strategy Design Pattern.
 *
 * @author Developer
 * @version 12.0
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Use Stack-based strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * Stack-based implementation of PalindromeStrategy
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}