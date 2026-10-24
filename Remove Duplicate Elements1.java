import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "Java", "C++", "Python");

        // Use distinct() to extract unique elements
        List<String> uniqueLanguages = languages.stream()
                                                .distinct()
                                                .collect(Collectors.toList());

        System.out.println("Unique Elements: " + uniqueLanguages);
    }
}
// Output: Unique Elements: [Java, Python, C++]
