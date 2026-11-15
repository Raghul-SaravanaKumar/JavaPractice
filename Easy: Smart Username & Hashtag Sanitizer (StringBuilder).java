public class UsernameSanitizer {
    public static void main(String[] args) {
        String rawInput = "  @User_Name! #2026$$  ";
        System.out.println("Original: '" + rawInput + "'");
        System.out.println("Clean Handle: " + createCleanHandle(rawInput));
    }

    public static String createCleanHandle(String input) {
        StringBuilder clean = new StringBuilder();
        
        for (char c : input.trim().toCharArray()) {
            // Keep only letters, digits, and underscores
            if (Character.isLetterOrDigit(c) || c == '_') {
                clean.append(Character.toLowerCase(c));
            }
        }
        
        // Prepend '@' at index 0 if the result isn't empty
        if (clean.length() > 0) {
            clean.insert(0, '@');
        }
        
        return clean.toString();
    }
}
