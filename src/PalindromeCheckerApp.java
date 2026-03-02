public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC3: Reverse-based palindrome check
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}