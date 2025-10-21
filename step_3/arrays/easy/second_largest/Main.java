public class Main {
    public static void main(String[] args) {
        System.out.println(second_largest());
    }

    public static int second_largest() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
