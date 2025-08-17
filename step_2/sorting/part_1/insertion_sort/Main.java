package step_2.sorting.part_1.insertion_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = { 15, 46, 24, 52, 20, 9 };
        int n = array.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        System.out.println("After Selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
