# XOR Queries

`Medium`

> Airbnb, Citadel, Goldman Sachs, Intel

## Problem Statement

### Given an array of positive integers and a set of queries, where each query consists of a range [lefti, righti], find the XOR of all elements within that range for each query and return an array of the answers.

> Example 1:

```
Input:

arr = [5, 8, 9, 11]

Queries = [[0,2],[1,3]]

Output:

[4, 10]

Explanation:

For query [0, 2], 5 ^ 8 ^ 9 = 4

For query [1, 3], 8 ^ 9 ^ 11 = 10
```

> Example 2:

```
Input:

arr = [12, 23, 22, 11, 6]

Queries = [[0, 3], [2, 3]]

Output:

[6, 29]
```

> Constraints:

```
1 <= |Queries|, |arr| <= 3 x 10^4

1 <=  arr[i] <= 10^9

0 <=  lefti[i],righti[i] < |arr|
```

## Solution

```java
public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;

        int[]  xor= new int[n];
        xor[0] = arr[0];
        for(int i = 1;i<n ;i++){
            xor[i] = xor[i-1] ^ arr[i];
        }

        int[] ans = new int[queries.length];

        for(int i = 0 ; i < queries.length;i++ ){
            int l = queries[i][0];
            int r = queries[i][1];

            int left = l == 0 ? 0 : xor[l-1];
            int right = xor[r];
            ans[i] = left ^ right;
        }

        return ans;
    }
```
