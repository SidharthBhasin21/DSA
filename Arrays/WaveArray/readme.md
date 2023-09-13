# Wave Array

## Problem Statement

### Given an array of integers A, sort the array into a wave-like array and return it. Arrange the elements into a sequence such that -` a1 >= a2 <= a3 >= a4 <= a5.....`

#### NOTE: If multiple answers are possible, return the lexicographically smallest one.

_Example 1:_

> Input:
> `A = [1, 2, 3, 4]`

> Output:
> `[2, 1, 4, 3]`

_Example 2:_

> Input:
> `A[] = [2, 4, 7, 8, 9, 10]`

> Output:
> `[4, 2, 8, 7, 10, 9]`

_Constraints:_

```
1 <= | A | <= 106
1 <= Ai <= 106
```

## Solution

```java
public ArrayList<Integer> wave(ArrayList<Integer> A) {


        int n = A.size();
        Collections.sort(A);

        for(int i =1;i<n;i++){
            int temp = A.get(i);
            A.set(i,A.get(i-1));
            A.set(i-1,temp);
            i++;
        }
        return A;
    }

```

## _But if it is given no answer without the lexological order_

```Java

public static void waveNotLexographic(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i - 1]) {
                swap(a, i, i - 1);
            }
            if (i < n - 1 && a[i] > a[i + 1]) {
                swap(a, i, i + 1);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

```
