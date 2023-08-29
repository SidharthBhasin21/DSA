package Backtracking;

import java.util.ArrayList;

public class SubsequenceOfArray {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1 };
        ArrayList<ArrayList<Integer>> ans = Subsequences(a);

        for (ArrayList<Integer> arrayList : ans) {
            System.out.println(arrayList);
        }

    }

    public static ArrayList<ArrayList<Integer>> Subsequences(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        helper(arr, 0, ans, new ArrayList<>());

        return ans;
    }

    private static void helper(int[] a, int i, ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> curList) {
        if (!ans.contains(curList))
            ans.add(new ArrayList<>(curList));

        for (int j = i; j < a.length; j++) {
            curList.add(a[j]);
            helper(a, j + 1, ans, curList);
            curList.remove(curList.size() - 1);
        }
    }

}
