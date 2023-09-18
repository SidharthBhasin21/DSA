# Minimum Operation of Given Type to Make all Elements of a Matrix Equal

`Medium`

> Airbnb, Bloomberg, DoorDash

## Problem Statement

### Given an integer K and a matrix of N rows and M columns, the task is to find the minimum number of operations required to make all the elements of the matrix equal. In a single operation, K can be added to or subtracted from any element of the matrix.

Example 1:

```
Input:

A = [[0, 2, 8],

     [8, 2, 0],

     [0, 2, 8]]

K = 2
```

```
Output:

12

```

```
Constraints:

1 <= N, M <= 1000

1 <= | A | <= 105

1 <= Ai <= 105

1 <= k <= 104

```

## Solution

```java
public static int minOperations(int n, int m, int k, int A[][]) {
        if (n == 0)
            return 0;
        int[] b = new int[n * m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i * m + j] = A[i][j];
            }
        }
        Arrays.sort(b);

        int median = b[(n * m) / 2];
        int count = 0;

        for (int i = 0; i < b.length; i++) {

            if (b[i] % k != 0)
                return -1;

            count += Math.abs((b[i] - median) / k);
        }

        return count;

    }
```
