package Collections.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.offer(12);
        que.offer(22);
        que.offer(32);
        que.offer(42);

        System.out.println(que);
    }
}
