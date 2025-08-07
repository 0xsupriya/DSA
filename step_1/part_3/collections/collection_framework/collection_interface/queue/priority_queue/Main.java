package step_1.part_3.collections.collection_framework.collection_interface.queue.priority_queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue: " + pq); // Order may not look sorted
        System.out.println("Peek: " + pq.peek()); // 10 (smallest)
        System.out.println("Poll: " + pq.poll()); // removes 10
        System.out.println("After Poll: " + pq); // [20, 30]
    }
}
