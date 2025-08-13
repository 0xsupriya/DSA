package step_1.part_5.basic_recursion.reverse_an_array.using_only_i;

public class Main {
    static void reverseArray(int[] a, int i) {
        int n = a.length;

        // Base case: if i crosses the middle
        if (i >= n / 2) {
            return;
        }

        // Swap elements
        int temp = a[i];
        a[i] = a[n - i - 1];
        a[n - i - 1] = temp;

        // Recursive call
        reverseArray(a, i + 1);
    }

    static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr, 0); // i starts at 0

        System.out.println("Reversed array:");
        printArray(arr);
    }
}
