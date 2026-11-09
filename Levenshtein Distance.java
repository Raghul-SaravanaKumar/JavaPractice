public class LevenshteinDistance {
    public static int calculate(String x, String y) {
        int[][] dp = new int[x.length() + 1][y.length() + 1];

        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (x.charAt(i - 1) == y.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(
                        dp[i - 1][j] + 1,        // Deletion
                        dp[i][j - 1] + 1),       // Insertion
                        dp[i - 1][j - 1] + cost  // Substitution
                    );
                }
            }
        }
        return dp[x.length()][y.length()];
    }

    public static void main(String[] args) {
        String name1 = "Johnathan";
        String name2 = "Jonathan";
        System.out.println("Edit Distance: " + calculate(name1, name2)); 
        // Output: 1 (One deletion needed)
    }
}
