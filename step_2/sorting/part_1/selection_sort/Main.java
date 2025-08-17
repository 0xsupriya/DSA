package step_2.sorting.part_1.selection_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = { 15, 46, 24, 52, 20, 9 };
        int n = array.length;
        for (int i = 0; i <= n - 2; i++) {
            int minimum = i;
            for (int j = i; j <= n - 1; j++) {
                if (array[j] < array[minimum])
                    minimum = j;
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        System.out.println("After Selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}