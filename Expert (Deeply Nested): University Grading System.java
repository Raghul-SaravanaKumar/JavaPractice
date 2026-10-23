public class GradingSystem {
    public static void main(String[] args) {
        int score = 85;

        // Evaluates multiple conditions sequentially down the chain
        char grade = (score >= 90) ? 'A' 
                   : (score >= 80) ? 'B' 
                   : (score >= 70) ? 'C' 
                   : (score >= 60) ? 'D' : 'F';

        System.out.println("A score of " + score + " earns a grade of: " + grade);
    }
}
