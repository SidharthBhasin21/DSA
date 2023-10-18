package Queue.FirstNegativeNumberinWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FirstNegativeN {
    public static void main(String[] args) {
        int[] arr = { -8, 2, 3, -6, 10 };
        List<Integer> ans = firstNegative(arr, 5, 2);
        System.out.println(ans);
    }

    public static List<Integer> firstNegative(int[] arr, int n, int k) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i = 0;
        while (i < k)
            if (arr[i] < 0)
                dq.offerLast(arr[i]);

        i++;

        for (; i < n; i++) {
            if (dq.isEmpty())
                ans.add(0);
            else
                ans.add(dq.peekFirst());

            if (!dq.isEmpty() && dq.peekFirst() == arr[i - k]) {
                dq.pollFirst();
            }
            if (arr[i] < 0)
                dq.offerLast(arr[i]);

        }
        if (dq.isEmpty())
            ans.add(0);
        else
            ans.add(dq.peekFirst());

        return ans;

    }

}
