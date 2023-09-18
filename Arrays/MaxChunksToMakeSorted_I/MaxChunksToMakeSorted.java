package Arrays.MaxChunksToMakeSorted_I;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {

    }

    public static int maxChunksToSorted(int[] arr) {
        if (arr.length == 0)
            return 0;
        int count = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            max = Math.max(max, arr[i]);
            if (i == max)
                count++;

        }
        return count;
    }
}
