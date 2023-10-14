# Implement Queue using Array

`Easy`

> Adobe, Atlassian, DocuSign, Google, Oracle

## Problem Statement

### Implement a Queue using an Array. Queries in the Queue are of the following type:

1. Push(x): (a query of this type means pushing 'x' into the queue)
2. Pop(): (a query of this type means to pop an element from the queue and return it)

### You are required to complete the two methods push() which take one argument an integer 'x' to be pushed into the queue and pop() which returns an integer poped out from the queue. If the queue is empty, it should return -1 on a pop operation.

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

4

Explanation:
push(2):    the queue will be {2}
push(3):    the queue will be {2 3}
pop():      poped element will be 2, the queue will be {3}
push(4):    the queue will be {3 4}
pop():      poped element will be 3

And the final configuration of the queue is [4]
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

5
```

> Constraints:

```
1 ≤ Q ≤ 105
1 ≤ x ≤ 105
```

## Solution

```java
class MyQueue {
    int front;
    int rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    void push(int a) {
        arr[rear] = a;
        rear++;


    }

    int pop() {
        if(front >= rear) return -1;

        int temp = arr[front];
        front++;

        return temp;

    }
}
```
