import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "cherry");

        // Convert each string to uppercase
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase List: " + upperCaseNames);
    }
}
// Output: Uppercase List: [APPLE, BANANA, CHERRY]
