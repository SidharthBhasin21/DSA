# Get Minimum Element from Stack

`Medium`

> Amazon, DE Shaw, Lyft, Paypal, Yahoo

## Problem Statement

### You are given N elements and your task is to Implement a Stack in which you can get a minimum element in O(1) time.

> Example 1:

```
Input:

push(2)
push(3)
pop()
getMin()
push(1)
getMin()

Output:

[2, 1]

Explanation:

push(2): This operation pushes the integer 2 onto the stack. The stack now contains [2].
push(3): This operation pushes the integer 3 onto the stack. The stack now contains [2, 3].
pop(): This operation pops the top element from the stack, which is 3. After this operation, the stack contains [2]. However, this operation doesn't produce any output.
getMin(): This operation is asking for the minimum element in the stack. The minimum element in the stack is 2, and this operation doesn't remove any elements from the stack. So, the output is [2].
push(1): This operation pushes the integer 1 onto the stack. The stack now contains [2, 1].
getMin(): Again, this operation is asking for the minimum element in the stack. The minimum element in the stack is still 1, and this operation doesn't remove any elements from the stack. So, the output is [1].
So, the final output based on these operations is [2, 1].

```

> Example 2:

```
Input:

5
pop()
push(4)
push(5)
getMin()
pop()


Output:
[4]

```

> Constraints:

```
1 <= Number of queries <= 100
1 <= values of the stack <= 100
```

## Solution

```java
import java.util.Stack;

class MyStack {
    int minEle;
    Stack<Integer> s;

    MyStack() {
        s = new Stack<>();

    }

    int getMin() {
        //You can code here
        if(s.isEmpty() ) return -1;
        return minEle;

    }

    int pop() {
        if(s.isEmpty()) return -1;

        int y = s.pop();
        if(y< minEle){
            int nextMin = 2*minEle -y ;
            int temp = minEle;
            minEle = nextMin;
            return temp;
        }
        return y;

    }

    void push(int x) {
        if(s.isEmpty()){
            minEle = x;
            s.push(x);
            return ;
        }

        if(x< minEle){
            s.push(2*x -minEle);
            minEle = x;
            return ;
        } else {
            s.push(x);
        }


    }
}

```
