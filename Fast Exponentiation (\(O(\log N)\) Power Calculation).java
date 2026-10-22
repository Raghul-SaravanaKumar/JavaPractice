public class FastExponentiation {
    public static long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) { // If exp is odd
                result *= base;
            }
            base *= base;
            exp >>= 1; // Divide exp by 2
        }
        return result;
    }

    public static void main(String[] args) {
        long base = 3, exp = 13;
        System.out.println(base + "^" + exp + " = " + power(base, exp));
    }
}
