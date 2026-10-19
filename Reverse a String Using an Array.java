public class ReverseString {
    public static void main(String[] args) {
        String original = "Java";
        int len = original.length();
        
        // Create a character array of the same size
        char[] reversedArray = new char[len];

        // Fill the array from the end to the start
        for (int i = 0; i < len; i++) {
            reversedArray[i] = original.charAt(len - 1 - i);
        }

        // Convert the character array back into a String
        String reversedString = new String(reversedArray);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversedString);
    }
}
