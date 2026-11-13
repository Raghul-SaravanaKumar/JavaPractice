public class BasicStringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending new strings
        sb.append(" Java");
        sb.append(" Programming");
        sb.append(" - ").append(2026);

        // Converting StringBuilder to immutable String and printing
        System.out.println("Result: " + sb.toString());
    }
}
