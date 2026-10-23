public class AbsoluteValue {
    public static void main(String[] args) {
        int input = -25;
        
        // If negative, multiply by -1 to make it positive; else keep it
        int absoluteValue = (input < 0) ? (input * -1) : input;
        
        System.out.println("The absolute value of " + input + " is " + absoluteValue);
    }
}
