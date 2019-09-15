package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
        //只要左括号小于括号对数，就可以继续添
        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        //只要同时，只要右括号少于左括号，就可以继续添
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }
}
