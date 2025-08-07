package step_1.part_3.collections.collection_framework.collection_interface.array_dequeue.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10); // Top -> 10
        stack.push(20); // Top -> 20, 10
        stack.push(30); // Top -> 30, 20, 10

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek()); // 30 (top)
        System.out.println("Popped: " + stack.pop()); // 30 removed
        System.out.println("Stack after pop: " + stack); // [20, 10]
    }
}
