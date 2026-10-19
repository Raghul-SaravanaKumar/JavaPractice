public class CharCount {
    public static void main(String[] args) {
        String text = "hello world";
        char target = 'l';
        int count = 0;

        // Convert the string into a character array
        char[] chars = text.toCharArray();

        // Loop through the array to find matches
        for (char c : chars) {
            if (c == target) {
                count++;
            }
        }

        System.out.println("The character '" + target + "' appears " + count + " times.");
    }
}
