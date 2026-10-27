public class PrimeFinder {
    public static void main(String[] args) {
        int limit = 30;
        System.out.println("Prime numbers up to " + limit + ":");

        // 'for' loop generates the candidates
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            int divisor = 2;

            // 'while' loop dynamically evaluates factors up to the square root
            while (divisor * divisor <= num) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break; // Exit the while loop early if a factor is found
                }
                divisor++;
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
