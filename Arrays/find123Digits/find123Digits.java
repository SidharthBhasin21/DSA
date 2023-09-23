package Arrays.find123Digits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * find123Digits
 */
public class find123Digits {

    public static void main(String[] args) {
        int[] arr = { 321, 123, 89, 32, 11 };
        System.out.println(find123Digits(arr, 5));
    }

    public static List<Integer> find123Digits(int[] arr, int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (contains123(arr[i])) {
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    private static boolean contains123(int num) {
        String str = Integer.toString(num);
        return str.contains("1") && str.contains("2") && str.contains("3");
    }

}