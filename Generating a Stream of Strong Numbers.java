public class StrongNumbersCount {
    public static void main(String[] args) {
        int targetCount = 4; // Find the first 4 Strong Numbers
        int foundCount = 0;
        int currentNum = 1;

        System.out.println("Finding the first " + targetCount + " Strong Numbers:");

        // Outer while loop runs indefinitely until the specific quantity is discovered
        while (foundCount < targetCount) {
            int temp = currentNum;
            int totalSum = 0;

            // Extract each digit and calculate its factorial
            while (temp > 0) {
                int digit = temp % 10;
                int factorial = 1;

                // Inner for loop executes explicit, predetermined iterations for factorial calculation
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }

                totalSum += factorial;
                temp /= 10;
            }

            // A Strong number equals the sum of the factorials of its digits (e.g., 145 = 1! + 4! + 5!)
            if (totalSum == currentNum) {
                System.out.println("Found: " + currentNum);
                foundCount++;
            }
            
            currentNum++;
        }
    }
}
