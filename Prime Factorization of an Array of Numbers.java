public class PrimeFactorization {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 99};

        // 'for' loop iterates over the elements in the array
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            System.out.print("Prime factors of " + n + " are: ");

            int factor = 2;
            // 'while' loop dynamically divides the number until it reduces to 1
            while (n > 1) {
                if (n % factor == 0) {
                    System.out.print(factor + " ");
                    n /= factor; // Reduce the number
                } else {
                    factor++; // Move to the next potential factor
                }
            }
            System.out.println();
        }
    }
}
