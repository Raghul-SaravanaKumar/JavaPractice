public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "radar";
        
        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
