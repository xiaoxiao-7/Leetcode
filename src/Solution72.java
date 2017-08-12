/**
 * Created by _xiaoxiao7 on 2017/8/12.
 */
public class Solution72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] cost = new int[m + 1][n + 1];
        for(int i = 0; i <= n; i++) cost[0][i] = i;
        for(int j = 0; j <= m; j++) cost[j][0] = j;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    cost[i + 1][j + 1] = cost[i][j];
                }
                else {
                    int a = cost[i][j + 1];
                    int b = cost[i + 1][j];
                    int c = cost[i][j];
                    cost[i + 1][j + 1] = (a < b) ? (a < c ? a : c) : (b < c ? b: c);
                    cost[i + 1][j + 1]++;
                }
            }
        }
        return cost[m][n];
    }
}
