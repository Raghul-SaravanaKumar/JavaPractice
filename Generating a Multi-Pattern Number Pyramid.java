public class AdvancedNumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        // 'for' loop controls the row progression
        for (int i = 1; i <= rows; i++) {
            int spaces = rows - i;

            // First 'while' loop handles dynamic left padding/spaces
            while (spaces > 0) {
                System.out.print("   ");
                spaces--;
            }

            int val = i;
            int count = 0;
            
            // Second 'while' loop prints increasing powers or multiples sequentially
            while (count < i) {
                System.out.printf("%-3d", val);
                val += i; 
                count++;
            }

            System.out.println(); // Move to the next row
        }
    }
}
