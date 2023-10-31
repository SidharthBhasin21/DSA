# Binary Search

`Easy`

> Amazon, Cisco, Dropbox, Google, Salesforce

## Problem Statement

### Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search. You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.

> Example 1:

```
Input:
arr[] = {1 2 3 4 5}
K = 4
Output: 3
Explanation: 4 appears at index 3.
```

> Example 2:

```
Input:
N = 5
arr[] = {11 22 33 44 55}
K = 445
Output: -1
Explanation: 445 is not present.
```

> Constraints:

```
1 ≤ N ≤ 10^7
1 ≤ arr[i] ≤ 10^18
0 ≤ X ≤ arr[n-1]
```

## Solution

```java
int binarysearch(int arr[], int n, int k) {

        return helper(arr, k, 0, arr.length -1);
    }
    int helper(int arr[], int k,int l,int r){
        if(l > r) return -1;
        int mid = l + (r-l)/2;

        if(arr[mid] == k) return mid;

        if(arr[mid] > k) return helper(arr,k,l,mid -1);
        if(arr[mid] < k) return helper(arr,k,mid+1,r);

        return -1;
    }
```
