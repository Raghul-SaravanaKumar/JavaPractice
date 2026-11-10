class AcronymGenerator {
    public String generateAcronym(String phrase) {
        if (phrase == null || phrase.isBlank()) return "";
        
        String[] words = phrase.split("[\\s+_-]");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            // Ignore empty elements caused by double spacing
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                if (Character.isLetter(firstChar)) {
                    acronym.append(Character.toUpperCase(firstChar));
                }
            }
        }
        return acronym.toString();
    }
}
