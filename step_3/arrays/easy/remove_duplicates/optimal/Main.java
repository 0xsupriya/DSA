public class Main {
    public static void main(String[] args) {
        System.out.println("Array after remove duplicates: " + remove_duplicates());
    }

    public static int remove_duplicates() {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
