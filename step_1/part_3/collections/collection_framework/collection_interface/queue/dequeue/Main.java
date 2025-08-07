package step_1.part_3.collections.collection_framework.collection_interface.queue.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        // Add elements to both ends
        deque.addFirst("Front"); // ["Front"]
        deque.addLast("Rear"); // ["Front", "Rear"]
        deque.offerFirst("NewFront"); // ["NewFront", "Front", "Rear"]
        deque.offerLast("NewRear"); // ["NewFront", "Front", "Rear", "NewRear"]

        System.out.println("Deque after additions: " + deque);

        // Peek elements
        System.out.println("Peek First: " + deque.peekFirst()); // NewFront
        System.out.println("Peek Last: " + deque.peekLast()); // NewRear

        // Poll elements from both ends
        System.out.println("Poll First: " + deque.pollFirst()); // removes NewFront
        System.out.println("Poll Last: " + deque.pollLast()); // removes NewRear

        System.out.println("Deque after polling: " + deque); // [Front, Rear]
    }
}
