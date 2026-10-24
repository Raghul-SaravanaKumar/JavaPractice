import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(45, 12, 89, 67, 34);

        // Find the maximum value
        Optional<Integer> maxScore = scores.stream()
                                           .max(Integer::compareTo);

        // Print the result if it exists
        maxScore.ifPresent(max -> System.out.println("Maximum Value: " + max));
    }
}
// Output: Maximum Value: 89
