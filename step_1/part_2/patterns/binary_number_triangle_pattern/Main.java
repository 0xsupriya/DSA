package step_1.part_2.patterns.binary_number_triangle_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int start;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
        scanner.close();
    }
}
