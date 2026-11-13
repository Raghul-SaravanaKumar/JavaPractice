public class StringCompression {
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1; // reset count for new character
            }
        }
        // Append the last character and its count
        sb.append(str.charAt(str.length() - 1)).append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbc";
        String compressed = compressString(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }
}
