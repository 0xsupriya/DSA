package step_1.part_2.patterns.reverse_letter_triangle_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        scanner.close();
    }
}
