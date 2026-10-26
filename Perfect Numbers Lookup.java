public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 10000:");

        // For loop steps through a designated search range
        for (int num = 1; num <= 10000; num++) {
            int sum = 0;
            int divisor = 1;

            // While loop systematically checks for proper factors
            while (divisor <= num / 2) {
                if (num % divisor == 0) {
                    sum += divisor;
                }
                divisor++;
            }

            // Verification check
            if (sum == num) {
                System.out.println(num + " is a Perfect Number.");
            }
        }
    }
}
