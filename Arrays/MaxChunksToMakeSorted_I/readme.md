# Max Chunks To Make Sorted

`Medium`

> Facebook, Lyft, Nutanix

## Problem Statement

### You are given an integer array A of length n that represents a permutation of the integers in the range [0, n - 1]. We split A into some number of Partitions, and individually sort each chunk. After joining them, the result should equal the sorted array. Return the largest number of chunks we can make to sort the array.

> Example 1:

```
Input:

[0, 1, 2, 4, 3]

Output:

4

Explanation:

Split into the maximum number of chunks like this: [0], [1], [2], [4, 3] and sort the individual chunk to sort the whole array.

```

> Example 2:

```
Input:

[3, 2, 1, 0]

Output:

1
```

```

Constraints:
1 <= n <= 105


```

## Solution

```java

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
```
