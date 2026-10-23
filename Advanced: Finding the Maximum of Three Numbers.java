public class MaxOfThree {
    public static void main(String[] args) {
        int a = 45, b = 82, c = 19;

        // Nested structure: if a > b, evaluate (a > c), else evaluate (b > c)
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
