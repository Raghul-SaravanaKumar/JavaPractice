class LeetObfuscator {
    public String toLeetSpeak(String input) {
        if (input == null || input.isEmpty()) return "";
        
        return input.trim()
                    .replaceAll("\\s+", "_") // Spaces to underscores
                    .replace('e', '3').replace('E', '3')
                    .replace('l', '1').replace('L', '1')
                    .replace('i', '1').replace('I', '1')
                    .replace('o', '0').replace('O', '0')
                    .replace('a', '4').replace('A', '4')
                    .replace('t', '7').replace('T', '7')
                    .replace('s', '5').replace('S', '5');
    }
}
