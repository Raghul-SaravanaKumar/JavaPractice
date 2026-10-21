public class StringReverser {
    public static String reverseWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        // Traverse backwards to build the reversed word sequence directly
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                if (currentWord.length() > 0) {
                    result.append(currentWord.reverse().toString()).append(" ");
                    currentWord.setLength(0); // Reset buffer
                }
            }
        }
        
        // Append the very first word if it exists
        if (currentWord.length() > 0) {
            result.append(currentWord.reverse().toString());
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Java Intermediate Interview Programs";
        // Expected Output: "Programs Interview Intermediate Java"
        System.out.println(reverseWords(input)); 
    }
}
