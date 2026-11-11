import java.util.Arrays;

public class TravelingSalespersonDP {
    private static final int INF = 100000000;

    public static int tsp(int[][] dist) {
        int n = dist.length;
        int VISITED_ALL = (1 << n) - 1;
        int[][] memo = new int[n][1 << n];
        for (int[] row : memo) Arrays.fill(row, -1);

        return tspRec(0, 1, n, dist, VISITED_ALL, memo);
    }

    private static int tspRec(int mask, int pos, int n, int[][] dist, int VISITED_ALL, int[][] memo) {
        if (mask == VISITED_ALL) {
            return dist[pos][0]; // return to starting city
        }
        if (memo[pos][mask] != -1) {
            return memo[pos][mask];
        }

        int ans = INF;
        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = dist[pos][city] + tspRec(mask | (1 << city), city, n, dist, VISITED_ALL, memo);
                ans = Math.min(ans, newAns);
            }
        }
        return memo[pos][mask] = ans;
    }

    public static void main(String[] args) {
        int[][] dist = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };
        System.out.println("Minimum TSP Cost: " + tsp(dist));
    }
}
