# Multiple Left Rotation of the Array

## Problem Statement

Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in a matrix where the ith row represents the rotated array for the ith value in B.
After every rotation, array A becomes equal to the original.

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
