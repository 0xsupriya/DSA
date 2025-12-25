public class Main {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int temp = array[0];
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }

}
