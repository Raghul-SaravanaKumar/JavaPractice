public class ReverseStringExample {
    // Recursive method
    public static String reverse(String str) {
        if (str.isEmpty()) { // Base Case
            return str;
        }
        // Recursive Call: take substring from index 1 + first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Java";
        System.out.println("Reversed string: " + reverse(input));
    }
}
