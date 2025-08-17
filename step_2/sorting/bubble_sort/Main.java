package step_2.sorting.bubble_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = { 13, 46, 24, 52, 20, 9 };
        int n = array.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
