public class FibonacciExample {
    // Recursive method
    public static int fibonacci(int n) {
        if (n <= 1) { // Base Cases
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive Call
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
