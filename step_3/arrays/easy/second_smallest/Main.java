public class Main {
    public static void main(String[] args) {
        System.out.println(second_smallest());
    }

    public static int second_smallest() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
