import java.util.Arrays;
import java.util.OptionalInt;

public class LargestNumberExpert {
    public static void main(String[] args) {
        // Generating a large sample array
        int[] largeArray = {105, 402, 899, 12, 54, 762, 33}; 
        
        // .parallel() utilizes multi-core processing automatically
        OptionalInt max = Arrays.stream(largeArray)
                                .parallel() 
                                .max();
        
        if (max.isPresent()) {
            System.out.println("Largest number (Expert Parallel): " + max.getAsInt());
        }
    }
}
