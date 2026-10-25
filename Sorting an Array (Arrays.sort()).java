import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {15, 3, 9, 1, 22, 7};

        // Using built-in sort method
        Arrays.sort(numbers);

        // Printing the sorted array using Arrays.toString()
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
