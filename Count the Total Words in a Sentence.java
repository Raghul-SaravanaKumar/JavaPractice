public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java programming is fun";

        // Split the string by spaces to create an array of words
        String[] words = sentence.split(" ");

        // The length of the array gives the word count
        int totalWords = words.length;

        System.out.println("Total words: " + totalWords);
    }
}
