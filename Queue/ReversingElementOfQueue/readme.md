# Reversing Element of Queue

`Easy`

> Bloomberg, eBay, Intel, Microsoft

## Problem Statement

### Given an integer k and a queue of integers, The task is to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order. Only the following standard operations are allowed on the queue:

`enqueue(x):` Add an item x to the rear of queue
`dequeue():` Remove an item from the front of the queue
`size():` Returns the number of elements in the queue.
`front():` Finds front item.

> Example 1:

```
Input:

k = 3 queue = [10, 20, 30, 40, 50]

Output:

[30, 20, 10, 40, 50]

Explanation:

Reverse the first 3 elements of the queue and leave the remaining elements in the same order as before.
```

> Example 2:

```
Input:

k = 2, queue = [60, 75, 80]

Output:

[75, 60, 80]
```

> Constraints:

```
1 <= |queue| <= 10^5
1 <= queue[i] <= 10^7
```

## Solution

```java
public static Queue<Integer> reverseQueueFirstKElements(int k, Queue<Integer> q) {
        if(q.size() == 0 || k<= 0 ) return q;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i =0;i< k ;i++){
            stack.push(q.peek());
            q.remove();
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        for(int i = 0; i< q.size() - k;i++){
            q.add(q.remove());
        }
        return q;


	}
```
