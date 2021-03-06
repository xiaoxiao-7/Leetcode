import java.util.*;
/**
 * Created by _xiaoxiao7 on 2017/8/12.
 */
public class Solution71 {
     public String simplifyPath(String path) {
         Deque<String> stack = new LinkedList<>();
         Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
         for (String dir : path.split("/")) {
             if (dir.equals("..") && !stack.isEmpty()) stack.pop();
             else if (!skip.contains(dir)) stack.push(dir);
         }
         String res = "";
         for (String dir: stack) res = "/" + dir + res;
         return res.isEmpty() ? "/" : res;
     }
}

//  Open a Linux Terminal window, and try some paths.
// For example: . means current folder, .. means parent folder.
// So "/a/b/.." means from a to b folder, and from b to b's parent folder,
// finally we can simplified it as "/a".
// '.' means 'right here in the current directory'. It means no change.
