import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] scores = new int[5];

        // Filling the entire array with the number 100
        Arrays.fill(scores, 100);

        System.out.println("Filled Array: " + Arrays.toString(scores));
    }
}
