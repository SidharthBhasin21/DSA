package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {

    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(0, s, path, ans);
        return ans;

    }

    private void helper(int i, String s, List<String> path, List<List<String>> ans) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s, i, j)) {
                path.add(s.substring(i, j + 1));
                helper(j + 1, s, path, ans);
                path.remove(path.size() - 1);
            }
        }

    }

    private boolean isPalindrome(String str, int s, int e) {
        while (s <= e) {
            if (str.charAt(s++) != str.charAt(e--))
                return false;
        }
        return true;
    }

}
