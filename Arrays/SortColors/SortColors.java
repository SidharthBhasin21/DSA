package Arrays.SortColors;

public class SortColors {
    public static void main(String[] args) {

    }

    public static void sortColors(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0)
                swap(nums, l++, i++);
            else if (nums[i] == 2)
                swap(nums, i, r--);
            else
                i++;
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
