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
public static List<List<Integer>> findPair(int[] arr)
    {

      List<List<Integer>> ans = new ArrayList<>();
      int n = arr.length;
      int[] a = Arrays.copyOf(arr,n);
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n ; j++){
        if(exist(a , arr[i] + arr[j], n)){

          ans.add(new ArrayList<>(Arrays.asList(arr[i],arr[j])));
        }
        }
      }
       ans.sort((x, y) -> {
            int minLen = Math.min(x.size(), y.size());
            for (int i = 0; i < minLen; i++) {
                int cmp = x.get(i).compareTo(y.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(x.size(), y.size());
        });
      return ans;

    }
    public static boolean exist(int [] arr, int sum, int n){
      for(int i=0; i<n; i++){
        if(arr[i] == sum)
          return true;
      }
      return false;
    }

```
