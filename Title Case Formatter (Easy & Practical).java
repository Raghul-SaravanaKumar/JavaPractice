import java.util.Set;

class TitleCaseFormatter {
    private static final Set<String> MINOR_WORDS = Set.of(
        "and", "but", "or", "a", "an", "the", "in", "on", "at", "to", "for", "by", "of"
    );

    public String toTitleCase(String input) {
        if (input == null || input.isBlank()) return "";
        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder title = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i > 0 && MINOR_WORDS.contains(word)) {
                title.append(word).append(" ");
            } else {
                title.append(Character.toUpperCase(word.charAt(0)))
                     .append(word.substring(1)).append(" ");
            }
        }
        return title.toString().trim();
    }
}
