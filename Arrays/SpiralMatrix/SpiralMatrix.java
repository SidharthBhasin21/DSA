package Arrays.SpiralMatrix;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = spiralOrderMatrix(7);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(spiralOrderMatrix(3)));
    }

    public static int[][] spiralOrderMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int cnt = 1;
        while (cnt <= n * n) {

            for (int i = left; i <= right; i++) {
                arr[top][i] = cnt;
                cnt++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                arr[i][right] = cnt;
                cnt++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = cnt;
                cnt++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = cnt;
                cnt++;

            }
            left++;
        }
        return arr;

    }
}
