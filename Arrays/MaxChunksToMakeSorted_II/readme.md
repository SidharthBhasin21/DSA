# Max Chunks To Make Sorted II

`Hard`

> Amazon, Flipkart, Uber, Twitter

## Problem Statement

### You are given an integer array arr. We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array. Return the largest number of chunks we can make to sort the array.

> Example 1:

```
Input:

arr = [5,4,3,2,1]

Output:

1

Explanation:

Splitting into two or more chunks will not return the required result.
For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3], which isn't sorted.

```

> Example 2:

```
Input:

arr = [8, 2, 5, 2]

Output:

1

```

```

Constraints:
1 <= arr.length <= 20000

0 <= arr[i] <= 108

```

## Solution

```java
public int maxChunksToSorted(int[] arr) {
        int n = arr.length, count =0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i =1 ;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int i =n-2 ;i>=0;i--){
            right[i] = Math.min(right[i+1],arr[i]);
        }
        for(int i =0 ; i<n-1;i++){
            if(left[i] <= right[i+1]) count++;
        }
        return count+1;
    }
```
