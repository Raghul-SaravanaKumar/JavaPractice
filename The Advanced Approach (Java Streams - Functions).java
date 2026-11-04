import java.util.Arrays;
import java.util.OptionalInt;

public class LargestNumberAdvanced {
    public static void main(String[] args) {
        int[] numbers = {72, 19, 85, 3, 64};
        
        // Convert array to stream and find the maximum
        OptionalInt max = Arrays.stream(numbers).max();
        
        // Print the result safely using a lambda expression
        max.ifPresentOrElse(
            value -> System.out.println("Largest number (Advanced Streams): " + value),
            () -> System.out.println("Array is empty.")
        );
    }
}
