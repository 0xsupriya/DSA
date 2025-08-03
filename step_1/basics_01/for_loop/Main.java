//Take a integer as an input and print the multiplication table of that number using a for loop.

package step_1.basics_01.for_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter table of a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i);
        }

        scanner.close();
    }
}
