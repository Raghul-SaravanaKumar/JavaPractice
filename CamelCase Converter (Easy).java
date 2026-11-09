public class CamelCaseConverter {
    public static String toCamelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (i == 0) {
                result.append(word); // First word stays lowercase
            } else {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String test = "user naming algorithm easy";
        System.out.println("CamelCase: " + toCamelCase(test)); 
        // Output: userNamingAlgorithmEasy
    }
}
