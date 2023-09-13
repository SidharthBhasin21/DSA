package Collections.QueueInterface;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ArrayDeque
 */
public class LearnArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        Queue<Integer> q = new PriorityQueue<>((a, b) -> a - b);

        q.offer(45);
        q.offer(4);
        q.offer(67);
        q.offer(10);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        dq.offerFirst(21);
        dq.offerLast(23);
    }
}