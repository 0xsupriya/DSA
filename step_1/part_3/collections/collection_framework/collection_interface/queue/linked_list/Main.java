package step_1.part_3.collections.collection_framework.collection_interface.queue.linked_list;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // offer() - Add elements
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue after offers: " + queue); // [A, B, C]

        // peek() - View head without removing
        System.out.println("Peek: " + queue.peek()); // A
        System.out.println("Queue after peek: " + queue); // [A, B, C]

        // poll() - Remove head
        System.out.println("Polled: " + queue.poll()); // A
        System.out.println("Queue after poll: " + queue); // [B, C]

        // another poll
        queue.poll(); // removes B
        queue.poll(); // removes C

        System.out.println("Queue after removing all: " + queue); // []

        // peek() or poll() on empty queue
        System.out.println("Peek on empty: " + queue.peek()); // null
        System.out.println("Poll on empty: " + queue.poll()); // null
    }
}
