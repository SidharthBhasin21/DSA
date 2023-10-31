# Floor in a Sorted Array

`Easy`

> Bloomberg, LinkedIn, Reddit, Samsung

## Problem Statement

### Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing). The task is to complete the function findFloor() which returns an integer denoting the index value of K or return -1 if there isn't any such number.

> Example 1:

```
Input:
x = 0
arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".
```

> Example 2:

```
Input:
x = 5
arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e K = 2), whose index is 1(0-based indexing).
```

> Constraints:

```
1 ≤ N ≤ 10^7
1 ≤ arr[i] ≤ 10^18
0 ≤ X ≤ arr[n-1]
```

## Solution

```java
    public static int findFloor(long arr[], int n, long x)
    {

        int l =0 , r= n -1;
        int ans = -1;

        while(l<= r){
            int mid = l + (r-l)/2;

            if(arr[mid] == x) return mid;
            if(arr[mid] < x) {
                ans = mid;
                l = mid +1;
            } else {
                r = mid -1;
            }
        }
        return ans;

    }
```
