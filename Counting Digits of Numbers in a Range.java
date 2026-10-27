public class DigitCounter {
    public static void main(String[] args) {
        int start = 120;
        int end = 125;

        System.out.println("Counting total digits for numbers from " + start + " to " + end + ":");

        // 'for' loop manages the fixed range
        for (int i = start; i <= end; i++) {
            int temp = i;
            int digitCount = 0;

            // 'while' loop processes dynamically until the number becomes 0
            while (temp > 0) {
                digitCount++;
                temp /= 10; // Remove the last digit
            }

            System.out.println("Number: " + i + " -> Total Digits: " + digitCount);
        }
    }
}
