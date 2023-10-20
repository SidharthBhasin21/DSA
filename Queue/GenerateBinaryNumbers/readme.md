# Generate Binary Numbers

`Medium`

> Apple, LinkedIn, eBay, Uber

## Problem Statement

### Given a number N. The task is to generate all the binary numbers with from 1 to N.

> Example 1:

```
Input:
N = 2

Output:
[1, 10]

Explanation:
Binary numbers from 1 to 2 are:

1 -> 1
2 -> 10
```

> Example 2:

```
Input:
N = 5

Output:
[1, 10, 11, 100, 101]

Explanation:

Binary numbers from 1 to 5 are

1 -> 1,

2 -> 10

3 -> 11

4 -> 100 and

5 -> 101.
```

```
Constraints:
1 ≤ N ≤ 10^6
```

## Solution

```java
 public static ArrayList<String> generate(int N)
    {

        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<String>();


        q.add("1");


        while (N-- > 0) {

            String s1 = q.peek();
            q.remove();
            ans.add(s1);

            String s2 = s1;

            q.add(s1 + "0");

            q.add(s2 + "1");
        }
        return ans;
    }
```
