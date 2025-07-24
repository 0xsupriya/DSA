package step_1.patterns.inverted_numered_right_pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}