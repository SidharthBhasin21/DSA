package Queue.SpecialQueue;

import java.util.*;

/**
 * SpecialQueue
 */
public class SpecialQueue {

    Queue<Integer> q = new LinkedList<>();
    ArrayDeque<Integer> dq = new ArrayDeque<>();

    public void enqueue(int data) {
        q.offer(data);
        while (dq.getLast() > data && !dq.isEmpty()) {
            dq.pollLast();
        }
        dq.offerLast(data);

    }

    public int dequeue() {

        if (q.isEmpty())
            return -1;

        int temp = q.poll();
        if (temp == dq.getFirst()) {
            dq.pollFirst();
        }
        return temp;
    }

    public int getMin() {
        return dq.getFirst();
    }
}