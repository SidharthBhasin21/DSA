# Balanced Parantheses

`Medium`

> Asana, LinkedIn, Microsoft

## Problem Statement

### Given a string A consisting only of '(' and ')'. You need to find whether parentheses in A are balanced or not, if it is balanced then return 1 else return 0.

> Example 1:

```
Input:

 A = "(()())"

Output:

1

Explanation:

Here String A contains balanced Parentheses

```

> Example 2:

```
Input:

 A = "())("

Output:

0
```

> Constraints:

```
1 <= |A| <= 105
```

## Solution

```java
public int isBalanced(String A) {
        int n = A.length();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        // if(A.charAt(0) == ')') return 0;

        for(int i = 0;i< n;i++){
            if(A.charAt(i) == '('){
                stack.push('(');

            }
            else if(A.charAt(i) == ')' &&  !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            } else return 0;
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
```
