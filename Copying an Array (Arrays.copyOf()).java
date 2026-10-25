import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        String[] original = {"Apple", "Banana", "Cherry"};

        // Copying the entire array
        String[] clone = Arrays.copyOf(original, original.length);

        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Copied Array: " + Arrays.toString(clone));
    }
}
