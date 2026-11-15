public class DataCompressor {
    public static void main(String[] args) {
        String rawSensorData = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB";
        String compressed = compressString(rawSensorData);
        
        System.out.println("Original Length: " + rawSensorData.length());
        System.out.println("Compressed: " + compressed);
        System.out.println("Compressed Length: " + compressed.length());
    }

    public static String compressString(String data) {
        if (data == null || data.isEmpty()) return "";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < data.length(); i++) {
            // Check if the next character is the same
            if (i + 1 < data.length() && data.charAt(i) == data.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(data.charAt(i)).append(count);
                count = 1; // Reset counter for the next character
            }
        }

        // Return the shorter version
        return compressed.length() < data.length() ? compressed.toString() : data;
    }
}
