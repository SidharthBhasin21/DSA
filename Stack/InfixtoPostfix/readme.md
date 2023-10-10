# Infix to Postfix

`Medium`

> LinkedIn, IBM, Infosys, Visa

## Problem Statement

### Given an infix expression in the form of string str. Convert this infix expression to a postfix expression.

### `Note:` The expression will contain +, -, /, \*, ^ as operators (where ^ denotes the order or power having the highest precedence), And operands will only contain alphabets.

> Example 1:

```
Input:

str = "a+b*(c^d-e)^(f+g*h)-i"

Output:

abcd^e-fgh*+^*+i-

Explanation:

After converting the infix expression into a postfix expression, the resultant expression will be abcd^e-fgh*+^*+i-
```

> Example 2:

```
Input:

str = "A*(B+C)/D"

Output:

ABC+*D/
```

> Constraints:

```
1 ≤ |str| ≤ 105
```

## Solution

```java
public static String infixToPostfix(String infixExpression) {
      String tokens[] = infixExpression.split("");
      ArrayDeque<String> stack = new ArrayDeque<>();
      StringBuilder str = new StringBuilder();

      for(String token: tokens){
        if(token.equals("(")){
            stack.push(token);

        } else if(isOperator(token)){

            while(!stack.isEmpty() && prec(stack.peek()) >= prec(token))
                str.append(stack.pop());

            stack.push(token);

        } else if(token.equals(")")){
            while(!stack.isEmpty() && !stack.peek().equals("("))
                str.append(stack.pop());
            stack.pop();
        } else {
            str.append(token);
        }
      }
      while(!stack.isEmpty()) str.append(stack.pop());


        return str.toString().replaceAll(" ","");

    }
    private static boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
     }
    private static int prec(String s){
        switch(s){
            case "^": return 3;
            case "*":
            case "/": return 2;
            case "-":
            case "+": return 1 ;
            default :
            return -1;
        }
    }
```
