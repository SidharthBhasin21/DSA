# Minimum Number of K Consecutive Bit Flips

`Hard`

## Problem Statement

### You are given a binary array nums and an integer k. A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0. Return the minimum number of k-bit flips required so that there is no 0 in the array. If it is not possible, return -1. A subarray is a contiguous part of an array.

> Example 1:

```
Input:

nums = [1,1,0], k = 2

Output: -1

Explanation:

No matter how we flip subarrays of size 2, we cannot make the array become [1,1,1].
```

> Example 2:

```
Input:

nums = [0,1,0], k = 1

Output: 2

Explanation:

Flip nums[0], then flip nums[2].
```

> Constraints:

```
1 <= nums.length <= 10^5
1 <= k <= nums.length
```

## Solution

```java
public int minKBitFlips(int[] nums, int k) {

        Queue<Integer> q = new LinkedList<>();
        int n = nums.length;

        int count = 0;

        for(int i =0 ;i< n;i++){
            if( (q.size() &1) != 0){
                nums[i] = nums[i] ^1;

            }
            if(nums[i] == 0){
                if(i+k-1> n) return -1;
                count++;
                q.offer(i+k-1);

            }
            if(!q.isEmpty()&& q.peek() == i){
                q.poll();
            }
        }
        // if(q.size() > 0 )
        return q.size() > 0 ? -1 : count;

    }
```
