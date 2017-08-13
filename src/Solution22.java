import java.util.LinkedList;
import java.util.List;

/**
 * Created by _xiaoxiao7 on 2017/8/13.
 */
public class Solution22 {
    public static void help(int n, int x, int y, String now, List<String> ans) {
        if (y == n) {
            ans.add(now);
            return;
        }
        if (x < n) {
            help(n, x + 1, y, now + "(", ans);
        }
        if(x > y) {
            help(n, x, y + 1, now + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new LinkedList<String>();
        help(n, 0, 0, "", ans);
        return ans;
    }
}
