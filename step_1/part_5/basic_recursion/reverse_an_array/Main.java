package step_1.part_5.basic_recursion.reverse_an_array;

public class Main {
    // Recursive function to reverse the array
    static void reverseArray(int arr[], int start, int end) {
        // Base case: when start index crosses end index
        if (start >= end) {
            return;
        }

        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call for the next positions
        reverseArray(arr, start + 1, end - 1);
    }

    // Function to print array
    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed array:");
        printArray(arr);
    }
}
