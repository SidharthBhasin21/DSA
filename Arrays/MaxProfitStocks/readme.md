# Max Profit in Stocks

`Easy`

> Airbnb, Amazon, Cisco, Dropbox, Google

## Problem Statement

### You are given an array of prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day to sell that stock in the future. Return the maximum profit you can achieve from this transaction. If you cannot accomplish any profit, return 0.

> Example 1:

```
Input:

[10, 19, 1, 30, 32]

Output:

31

Explanation:

Buy at Rs. 1 and Sell at Rs. 32 for a Profit of Rs. 31

```

> Example 2:

```
Input:

[9, 17, 18, 5]

Output:

9

Explanation:

Buy at Rs. 9 and Sell at Rs. 18 for a Profit of Rs. 9

```

```
Constraints:
1 <= |prices| <= 100000

0 <= prices[i] <= 10000


```

## Solution

```java
public int maxProfit(int[] prices)
    {
        int max = Integer.MIN_VALUE;
        int temp = prices[0];

        for( int  i= 0;i< prices.length;i++){

            if(temp > prices[i]) temp = prices[i];

            max = Math.max(max, prices[i] - temp );
        }

        return max;
    }
```
