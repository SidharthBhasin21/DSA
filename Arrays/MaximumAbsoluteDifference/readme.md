# Maximum Absolute Difference

`Medium`

> Adobe, Cisco, Etsy

## Problem Statement

### You are given an array of N integers, A1, A2 ,..., AN. Return maximum value of `f(i, j) for all 1 ≤ i, j ≤ N`. `f(i, j)` is defined as `|A[i] - A[j]| + |i - j|`, where `|x|` denotes absolute value of `x`.

> Example 1:

Input:

`A = [1, 3, -1]`

Output:

`5`

Explanation:

```
f(1, 1) = f(2, 2) = f(3, 3) = 0

f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3

f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4

f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
```

> Example 2:

Input:

`A = {3, -2, 5, -4}`

Output:

`10`

> Constraints:

```
1 <= |A| <= 105

-109 <= Ai <= 109
```

## Solution

```Java
public static int maxArr(ArrayList<Integer> A) {

        int n = A.size();
        int[] aipi = new int[n];
        int[] aimi = new int[n];

        for (int i = 0; i < n; i++) {
            aipi[i] = A.get(i) + i;
            aimi[i] = A.get(i) - i;
        }

        int maxaipi = Integer.MIN_VALUE;
        int minaipi = Integer.MAX_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for (int e : aipi) {
            maxaipi = Math.max(maxaipi, e);
            minaipi = Math.min(minaipi, e);
        }
        for (int e : aimi) {
            maxaimi = Math.max(maxaimi, e);
            minaimi = Math.min(minaimi, e);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi, diffaimi);

    }
```
