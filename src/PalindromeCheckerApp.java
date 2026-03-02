/**
 * =====================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares execution
 * performance of palindrome validation algorithms.
 *
 * The application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Use Two Pointer strategy (efficient one)
        PalindromeStrategy strategy = new TwoPointerStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution duration
        long executionTime = endTime - startTime;

        // Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}


/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * Two Pointer Implementation (Efficient)
 */
class TwoPointerStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}