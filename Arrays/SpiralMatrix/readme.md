# Spiral Order Matrix II

`Medium`

> Amazon, Expedia, Google

## Problem Statement

### You are given a positive integer N. You need to generate an N X N matrix, in which elements are from 1 to N2 in spiral order.

> Example 1:

```
Input:

3

Output:

[[1, 2, 3],

 [8, 9, 4],

 [7, 6, 5]]

```

> Example 2:

```
Input:

4

Output:

[[1, 2, 3, 4],

 [12, 13, 14, 5],

 [11, 16, 15, 6],

 [10, 9, 8, 7]]

```

> Constraints:

`1 <= N <= 10^3`

## Solution

```java

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
```
