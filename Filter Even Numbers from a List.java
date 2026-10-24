import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvens {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter numbers that are divisible by 2
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
// Output: Even Numbers: [2, 4, 6, 8, 10]
