package step_3.arrays.easy.largest_element;

public class Main {
    public static void main(String[] args) {
        System.out.println("Largest element of Array: " + array());
    }

    public static int array() {
        int arr[] = { 1, 2, 3, 5, 4 };
        int n = arr.length;
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
