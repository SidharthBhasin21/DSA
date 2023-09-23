# Find Pairs Whose Sum is Present in Array

`Easy`

> Airbnb, Amazon, Goldman Sachs

## Problem Statement

### Given an array arr of n positive elements. Return the pairs in sorted order (in case of the same first element sort on the basis of the second element) whose sum already exists in the given array.

> Example 1:

```
Input:

arr = [10, 4, 8, 13, 5]

Output:

[[5, 8]]

Explanation:

5+8 = 13 is present in the array

```

> Example 2:

```
Input:

arr[] = {2, 8, 7, 1, 5}

Output:

[[1, 7], [2, 5]]

```

> Constraints:

```
1 <= n <= 103

1<= arr[i] <=104

```

## Solution

```java
public static List<Integer> find123Digits(int[] arr,int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (contains123(arr[i])) {
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    private static boolean contains123(int num) {
        String str = Integer.toString(num);
        return str.contains("1") && str.contains("2") && str.contains("3");
    }

```
