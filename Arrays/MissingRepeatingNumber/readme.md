# Missing and Repeating Number

`Medium`

> Bloomberg, Citadel, Nvidia

## Problem Statement

### You are given an unsorted array of size N. Array elements are from 1 to N. One number from the set {1, 2, …n} is missing, and one number (not missing) occurs twice in the array. Find these two numbers.

> Example 1:

```
Input:

6

[1, 1, 2, 3, 4, 6]

Output:

[5, 1]

```

> Example 2:

```
Input:

4

[4, 2, 3, 2]

Output:

[1, 2]

```

> Constraints:

`2 <= N <= 105`

## Solution

> Approach 1

```java
public static Vector<Integer> findNumbers(int[] a)
    {
        Vector<Integer> ans = new Vector<>();
        int n = a.length;
        int[] hash = new int[n+1];

        for(int i =0 ;i<n;i++){
            hash[a[i]]++;
        }

        int r =-1,m =-1;

        for(int i =1;i<=n;i++){
            if(hash[i] == 2) r = i;
            else if(hash[i] == 0) m = i;
        }
        ans.add(m);
        ans.add(r);
        return ans;

    }
```
