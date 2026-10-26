public class PrimeFactorization {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 98, 100};

        // Enhanced for loop iterates through array items
        for (int num : numbers) {
            System.out.print("Prime factors of " + num + " are: ");
            int temp = num;
            int factor = 2;

            // While loop reduces the current number dynamically
            while (temp > 1) {
                if (temp % factor == 0) {
                    System.out.print(factor + " ");
                    temp /= factor; // Divide and continue checking the same factor
                } else {
                    factor++; // Advance to the next potential factor
                }
            }
            System.out.println();
        }
    }
}
