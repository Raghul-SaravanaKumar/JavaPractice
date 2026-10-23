public class EvenOddChecker {
    public static void main(String[] args) {
        int number = 15;

        // Condition checks if remainder is 0
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result + ".");
    }
}
