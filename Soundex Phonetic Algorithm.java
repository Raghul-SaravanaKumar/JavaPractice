public class Soundex {
    public static String getSoundex(String s) {
        if (s == null || s.isEmpty()) return "0000";
        
        char[] codes = {'0','1','2','3','0','1','2','0','0','2','2','4','5','5','0','1','2','6','0','3','0','1','0','2','0','2'};
        s = s.toUpperCase();
        
        StringBuilder code = new StringBuilder();
        code.append(s.charAt(0));
        
        for (int i = 1; i < s.length() && code.length() < 4; i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char currentCode = codes[c - 'A'];
                if (currentCode != '0' && currentCode != codes[s.charAt(i - 1) - 'A']) {
                    code.append(currentCode);
                }
            }
        }
        
        while (code.length() < 4) {
            code.append('0');
        }
        return code.toString();
    }

    public static void main(String[] args) {
        System.out.println("Soundex 'Robert': " + getSoundex("Robert")); // R163
        System.out.println("Soundex 'Rupert': " + getSoundex("Rupert")); // R163
    }
}
