package step_1.part_3.collections.generics_and_wrappers.generic_methods;

public class Main {
    // Generic method
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie" };
        Integer[] numbers = { 1, 2, 3, 4 };

        printArray(names); // Prints Strings
        printArray(numbers); // Prints Integers
    }
}
