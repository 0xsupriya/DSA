// Write a Java program to find the elements in the array are even numbers.

package step_1.basics_01.arrays;

public class Main {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
