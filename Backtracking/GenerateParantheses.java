package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*Given an integer N representing the number of pairs of parentheses,
 The goal is to produce all possible combinations of balanced and 
 well-formed brackets. Return the answer according to sorted order 
 where '(' comes first and then ')'.  */

public class GenerateParantheses {
    public static void main(String[] args) {

    }

    public List<String> AllParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, "", 0, 0, ans, 0);
        return ans;
    }

    private void helper(int n, String cur, int opening, int closing, List<String> ans, int i) {
        if (i == 2 * n) {
            ans.add(cur);
            return;
        }
        if (opening < n) {
            cur += '(';
            helper(n, cur, opening + 1, closing, ans, i + 1);
            cur = cur.substring(0, cur.length() - 1);
        }
        if (closing < n && closing < opening) {
            cur += ')';
            helper(n, cur, opening, closing + 1, ans, i + 1);
        }

    }

}
