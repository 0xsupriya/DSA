package step_1.collections_03.collection_framework.collection_interface.array_dequeue.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue); // [A, B, C]
        System.out.println("Peek: " + queue.peek()); // A
        System.out.println("Removed: " + queue.remove()); // A
        System.out.println("Queue after remove: " + queue); // [B, C]
    }
}
