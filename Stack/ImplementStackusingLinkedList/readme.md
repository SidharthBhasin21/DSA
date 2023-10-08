# Implement Stack using Linked List

`Easy`

> Apple, ByteDance, Expedia, Microsoft, Samsung

## Problem Statement

### You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list. Your task is to use the class as shown in the code editor and complete the functions push() and pop() to implement a stack.

### You are required to complete two methods push() and pop(). The push() method takes one argument, an integer 'x' to be pushed into the stack and pop() which returns an integer present at the top and popped out from the stack. If the stack is empty then return -1 from the pop() method.

> Example 1:

```
Input:

5
push(2)
push(3)
pop()
push(4)
pop()


Output:

[2]


Explanation:

There are a total of 5 operations
push(2): the stack will be {2}
push(3): the stack will be {2 3}
pop(): poped element will be 3, the stack will be {2}
push(4): the stack will be {2 4}
pop(): poped element will be 4

Final Stack: [2]
```

> Example 2:

```
Input:
4
pop()
push(4)
push(5)
pop()

Output:

[4]

```

> Constraints:

```
1 <= Number of Operations <= 100
1 <= x <= 100

```

## Solution

```java
class MyStack {
    class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a) {
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;

    }

    //Function to remove an item from top of the stack.
    int pop() {
        if(top == null) return -1;
        int temp = top.data;
        top = top.next;
        return temp;
    }
}
```
