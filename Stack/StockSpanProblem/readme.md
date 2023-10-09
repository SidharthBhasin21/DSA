# Stock Span Problem

`Medium`

> Amazon, Barclays, DE Shaw, Reddit

## Problem Statement

### The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stocks price for all n days. The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.

> Example 1:

```
Input:

N = 7,

price[] = [100, 80, 60, 70, 60, 75, 85]

Output:
[1, 1, 1, 2, 1, 4, 6]

Explanation:

Traversing the given input span for 100 will be 1, 80 is smaller than 100 so the span is 1, 60 is smaller than 80 so the span is 1, 70 is greater than 60 so the span is 2, 60 is smaller than 70 so the span is 1, 75 is greater than 60, 70 and 60 hence the span is 4 days, and 85 is greater than 5 consecutive days hence span is 6 days.

```

> Example 2:

```
Input:

N = 5,

price[] = [50, 40, 30, 20, 10]

Output:

[1, 1, 1, 1, 1]

```

> Constraints:

```
1 ≤ N ≤ 105
1 ≤ C[i] ≤ 105
```

## Solution

```java
public static int[] calculateSpan(int price[], int n)
    {
        int s[] = new int[n];
        s[0] = 1;

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for(int i =1; i < n ;i++){
            while(!stack.isEmpty()){
                int top = stack.peek();
                if(price[top] > price[i]) break;
                else {
                    stack.pop();

                }
            }
            if(stack.isEmpty()) s[i] = i+1;
            else
                s[i] = i - stack.peek();
            stack.push(i);

        }

        return s;
    }
```
