class Solution {

    public int[] findColumnWidth(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] ans = new int[n];

        for(int j = 0; j < n; j++) {

            int max = 0;

            for(int i = 0; i < m; i++) {

                int len = String.valueOf(grid[i][j]).length();
                max = Math.max(max, len);
            }

            ans[j] = max;
        }

        return ans;
    }
}
