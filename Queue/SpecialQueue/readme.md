# Design a Queue data structure to get minimum or maximum in O(1) time

> ## Design a Data Structure a SpecialQueue which supports following operations enqueue, deque, getMin() or getMax() where getMin() operation takes O(1) time.

```
Let the data to be inserted in queue be -
4, 2, 1, 6

Operation     Queue       Output
push(4)         4           -
push(2)        4, 2         -
push(1)       4, 2, 1       -
getMin()      4, 2, 1       1
push(6)      4, 2, 1, 6     -
pop()         2, 1, 6       4
pop()          1, 6         2
pop()            6          1
getMin()         6          6

// Notice the getMin() function call
// It returns the minimum element
// of all the values present in the queue

```

# Solution

```java
class SpecialQueue {

    Queue<Integer> q = new LinkedList<>();
    ArrayDeque<Integer>  dq = new ArrayDeque<>();

    public void enqueue(int data){
        q.offer(data);
        while(dq.getLast() > data && !dq.isEmpty()){
            dq.pollLast();
        }
        dq.offerLast(data);

    }


    public int dequeue(){

        if(q.isEmpty()) return -1;

        int temp = q.poll();
        if(temp == dq.getFirst()){
            dq.pollFirst();
        }
        return temp;
    }

    public int getMin(){
        return dq.getFirst();
    }

}
```
