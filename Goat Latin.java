class Solution {

    public String toGoatLatin(String sentence) {

        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            if(vowels.indexOf(word.charAt(0)) >= 0) {
                result.append(word);
            } else {
                result.append(word.substring(1))
                      .append(word.charAt(0));
            }

            result.append("ma");

            for(int j = 0; j <= i; j++) {
                result.append("a");
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}
