# Queue using one Stack

`Medium`

> Amazon, Dropbox, LinkedIn, Slack

## Problem Statement

### Implement a Queue using 1 stack.

A Query Q is of 2 Types

1. Push(x): (a query of this type means pushing 'x' into the queue)
2. Pop(): (a query of this type means to pop an element from the queue and return it)

`Note:-` If there is no element return -1 as the answer while popping.

### After every operation, put the remaining elements in the given stack. For order please look at the examples.

> Example 1:

```
Input:

10
push(5)
push(10)
pop()
push(15)
push(20)
push(25)
pop()
push(30)
pop()
push(35)

Output:

20 25 30 35

Explanation:

push(5): the queue will be {2}
push(10): the queue will be {2, 10}
pop(): popped element will be 2, the queue will be {10}
push(15): the queue will be {10, 15}
push(20): the queue will be {10, 15, 20}
push(25): the queue will be {10, 15, 20, 25}
pop(): popped element will be 10, the queue will be {15, 20, 25}
push(30): the queue will be {15, 20, 25, 30}
pop(): popped element will be 15, the queue will be {20, 25, 30}
push(35): the queue will be {20, 25, 30, 35}

So, the final queue will be [20, 25, 30, 35] and 35 should be present in the given stack's top , then 30, then 25 and 20 should be at bottom of the stack.
```

> Example 2:

```
Input:

5
push(2)
push(3)
pop()
push(4)
pop()

Output:

4

Explanation:
push(2): the queue will be {2}
push(3): the queue will be {2, 3}
pop(): popped element will be 2, the queue will be {3}
push(4): the queue will be {3, 4}
pop(): popped element will be 3

So, the final queue will be [4] and 4 should be present in the given stack's top as it is the only element.
```

> Example 3:

```
Input:
3
push(4)
push(5)
pop()

Output:

5

Explanation:
push(4): the queue will be {4}
push(5): the queue will be {4, 5}

So, the final queue will be [4, 5] and 5 should be present in the given stack's top and 4 should be present at given stack's bottom.
```

> Constraints:

```
1 <= Q <= 100
1 <= x <= 100
```

## Solution

```java
import java.util.Stack;

class MyQueue {
    Stack<Integer> stack = new Stack<>();

    void Push(int x) {
      //You can code here
        stack.push(x);


    }

    int Pop() {
        if(stack.isEmpty()) return -1;
        if(stack.size() ==1 ) return stack.pop();

        int top = stack.pop();
        int ans = Pop();
        stack.push(top);


        return ans;


    }
}
```
