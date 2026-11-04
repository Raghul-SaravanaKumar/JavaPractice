public class LargestNumberBeginner {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 9, 45, 2, 21};
        
        // Assume the first element is the largest
        int max = numbers[0];
        
        // Loop through the rest of the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }
        
        System.out.println("Largest number (Beginner): " + max);
    }
}
