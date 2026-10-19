import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String original = "software";

        // Convert string to character array
        char[] charArray = original.toCharArray();

        // Sort the array alphabetically
        Arrays.sort(charArray);

        // Convert the sorted array back into a String
        String sortedString = new String(charArray);

        System.out.println("Original: " + original);
        System.out.println("Sorted: " + sortedString);
    }
}
