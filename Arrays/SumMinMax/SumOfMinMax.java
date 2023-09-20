package Arrays.SumMinMax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfMinMax {

    public static void main(String[] args) {
        long[] num1 = { -10, 2, 4, 5, 6 };
        List<Long> nums = Arrays.stream(num1).boxed().collect(Collectors.toList());

        System.out.println(sumMaxMin(nums));
    }

    public static long sumMaxMin(List<Long> nums) {
        Collections.sort(nums);
        return nums.get(0) + nums.get(nums.size() - 1);
    }
}
