import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // For loop handles a fixed number of rounds (e.g., 3 inputs)
        for (int i = 1; i <= 3; i++) {
            System.out.print("Round " + i + " - Enter a positive integer: ");
            int num = sc.nextInt();
            
            int sum = 0;
            int temp = num;
            
            // While loop dynamically extracts and sums digits until number is reduced to 0
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            System.out.println("The sum of the digits of " + num + " is: " + sum);
        }
        sc.close();
    }
}
