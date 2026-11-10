class VariableAnonymizer {
    public String maskIdentifier(String variableName) {
        if (variableName == null || variableName.isBlank()) return "ANONYMOUS_VAR";
        
        // Split by underscores or camelCase boundaries
        String[] parts = variableName.split("(?=[A-Z])|_|\\s+");
        StringBuilder masked = new StringBuilder("MOCKED");

        for (String part : parts) {
            if (!part.isEmpty()) {
                // Keep the first character of each word, mask the rest with X
                masked.append("_").append(Character.toUpperCase(part.charAt(0)))
                      .append("X".repeat(Math.max(0, part.length() - 1)));
            }
        }
        return masked.toString();
    }
}
