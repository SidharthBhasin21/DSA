# Minimum Sum Subarray

`Medium`

> Amazon, Flipkart, Google

## Problem Statement

### Given an array of positive integers A and a positive integer K, return the minimal length of a Subarray whose sum is greater than or equal to the target. If there is no such subarray, return 0 instead.

> Example 1:

```
Input:
target = 7
nums = [2,3,1,2,4,3]
```

```
Output:
2
```

```
Explanation:
The subarray [4,3] has the minimal length under the problem constraint.
```

> Example 2:

```
Input:
target = 4
nums = [1,4,4]
```

```
Output:
1
```

> Constraints:

```
1 <= K <= 109

1 <= A.length <= 105

1 <= A[i] <= 104
```

## Solution

```java
public static int minSubArrayLen(int K, int[] A) {
        int l = 0;
        int r = 0;
        int n = A.length;
        int curSum = 0;
        int minlen = Integer.MAX_VALUE;

        while (r < n) {
            curSum += A[r];
            while (curSum >= K) {
                minlen = Math.min(minlen, r - l + 1);
                curSum -= A[l];
                l++;
            }
            r++;
        }
        if (minlen == Integer.MAX_VALUE)
            minlen = 0;

        return minlen;
    }
```
