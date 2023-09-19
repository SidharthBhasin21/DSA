package Arrays.SumMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfMinMax {

    public static void main(String[] args) {
        // int[] num1 = {-10, 2, 4, 5, 6};
        List<Long> nums = new ArrayList<>(num1);

        System.out.println(sumMaxMin(nums));
    }

    public static long sumMaxMin(List<Long> nums) {
        Collections.sort(nums);
        return nums.get(0) + nums.get(nums.size() - 1);
    }
}
