# Chocolate Distribution Problem

`Easy`

> Amazon, LinkedIn, Oracle, Asana

## Problem Statement

### Given an array A[ ] of positive integers of size n, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that :

1. Each student gets exactly one packet.
2. The difference between the maximum number of chocolates given to a student and the minimum number of chocolates given to a student is minimum.

> Example 1:

```
Input:

arr = [7, 3, 2, 4, 9, 12, 56]

m = 3

Output:

2

Explanation:

The chocolate packets given are 3 , 2 , 4.Thus the difference is 2

```

```
Example 2:
Input:

N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}

Output:

6

Explanation:

The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing the following m packets: {3, 4, 9, 7, 9}.
```

```
Constraints:
1 <= n <= 105

1 <= arr[i] <=109

1 <= m <= n

```

## Solution

```java
public int findMinDiff(int[] arr, int m)
    {
        if(arr.length == 0|| m == 0) return 0;

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        if(arr.length < m) return -1;

        for( int i =0 ;i+m-1<arr.length;i++){
            minDiff = Math.min(minDiff,arr[i+m-1] - arr[i]);
        }

      return minDiff;
    }
```
