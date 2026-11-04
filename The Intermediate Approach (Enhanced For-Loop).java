public class LargestNumberIntermediate {
    public static void main(String[] args) {
        int[] numbers = {14, 53, 8, 91, 42};
        
        // Handle potential empty array edge case
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize with the smallest possible integer value
        int max = Integer.MIN_VALUE; 
        
        // Clean, readable for-each loop
        for (int num : numbers) {
            max = Math.max(max, num); // Uses built-in Math library
        }
        
        System.out.println("Largest number (Intermediate): " + max);
    }
}
