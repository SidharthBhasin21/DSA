# Multiple Left Rotation of the Array

## Problem Statement

Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in a matrix where the ith row represents the rotated array for the ith value in B.
After every rotation, array A becomes equal to the original.

Example 1:

> Input:

```
5 2

1 2 3 4 5

2 3

```

> Output:

```
[[3, 4, 5, 1, 2], [4, 5, 1, 2, 3]]

```

> Explanation

```

B[0] = 2 which requires 2 times left rotations

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]



B[1] = 3 which requires 3 times left rotation

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

2: [4, 5, 1, 2, 3]

```

> Example 2:

> Input:

```
4 1

5 17 100 11

1

```

> Output:

```
[[17, 100, 11, 5]]
```

> Constraints:

```
1 <= N <= 2 \* 103

1 <= M <= 2 \* 103

-109 <= A[i] <= 109

0 <= B[j] <= 2000

```

# Answer

> Brute force for single rotation k times to the left

```java

void leftRotate(long arr[], int k,int n)
    {
        for(int i =0;i<k;i++){
        long temp = arr[0];
            for(int j =0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }

    }

```

> Optimised for single rotation

```java
void leftRotate(long arr[], int k,int n)
    {
        // int[] ans = new int[n];
        k = k % n;
        long[] temp = new long[n*2];

        for( int i =0 ;i<n;i++){
            temp[i] = arr[i];
            temp[i+n] = arr[i];
        }

        for(int i =0;i<n;i++){
            arr[i] = temp[k+i];
        }


    }

```

> Final answer

```Java

    public static int[][] multipleLeftRotation(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] ans = new int[m][n];

        int[] temp = new int[2 * A.length];

        for (int i = 0; i < n; i++) {
            temp[i] = A[i];
            temp[i + n] = A[i];

        }

        for (int i = 0; i < m; i++) {
            int offset = (B[i]) % n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offset];

            }
        }
        return ans;
    }

```
