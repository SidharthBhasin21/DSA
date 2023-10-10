# Nearest Smaller Element

`Medium`

> Morgan Stanley, Expedia, Atlassian, Visa

## Problem Statement

### Given an array arr of length n, return a vector result where result[i] is the nearest smaller element for every element arr[i] in the array such that the element has an index smaller than i. In case no smaller element before arr[i], put -1 in the array.

> Example 1:

```
Input:
arr = [3, 4, 2, 7, 8, 1, 9]


Output:
result = [-1, 3, -1, 2, 7, -1, 1]


Explanation:

As follow
No smaller element before 3(first element) therefore -1
Nearest smaller element before 4(second element) is 3
No smaller element before 2(third element) therefore -1.
Similarly, every element goes on.
```

> Example 2:

```
Input:

arr = [1, 2, 3, 4, 3, 2, 1]

Output:

result = [-1, 1, 2, 3, 2, 1, -1]

```

> Constraints:

```
 1 <= |A| <= 104

-107 <= A[i] <= 107
```

## Solution

```java
 public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(Integer i: A){
            while(!stack.isEmpty() && stack.peek() >= i){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans.add(-1);
                stack.push(i);
            } else {
                ans.add(stack.peek());
            }
            stack.push(i);

        }

        return ans;

    }
```
