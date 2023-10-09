# Evaluate Postfix Expression

`Medium`

> Amazon, TCS (Tata Consultancy Services), Slack, Walmart Global Tech

## Problem Statement

### An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation or Postfix Expression. Valid operators are +, -, \*, /. Each string may be an integer or an operator.

> Example 1:

```
Input:

["2", "1", "+", "3", "*"]

Output:

9
```

> Example 2:

```
Input:

["4", "13", "5", "/", "+"]

Output:

6

Explanation:

Above Postfix expression can be written as

4 + 13 / 5 which is

4 + 2 which is

6
```

> Constraints:

```
2 <= |A| <= 100
```

## Solution

```java
 public int evalPostfix(String[] tokens)
    {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token: tokens){
            if(isOperator(token)){
                int second = stack.pop();
                int first = stack.pop();
                int result = 0;
                switch(token){
                    case "+":
                        result = first+second;
                        break;
                    case "-":
                        result = first-second;
                        break;
                    case "*":
                        result = first*second;
                        break;
                    case "/":
                        result = first/second;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();
    }
    private static boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
```
