/**
 * Created by _xiaoxiao7 on 2017/8/13.
 */
public class Solution200 {
    public static void help(char[][] grid, int i, int j, int m, int n) {
        if ((i < 0 || j<0) || i >= m || j >= n || grid[i][j] != '1') return;
        grid[i][j] = '0';
        help(grid, i-1, j, m, n);
        help(grid, i+1, j, m, n);
        help(grid, i, j+1, m, n);
        help(grid, i, j-1, m, n);
    }

    public int numIslands(char[][] grid) {
        if (grid == null) return 0;
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    help(grid, i, j, m, n);
                    ans++;
                }
            }
        }
        return ans;
    }
}
