package step_1.patterns.inverted_star_pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
