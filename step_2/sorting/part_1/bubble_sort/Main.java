package step_2.sorting.part_1.bubble_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int n = array.length;
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
            System.out.println("run");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
