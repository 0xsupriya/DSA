package step_1.part_2.patterns.alpha_triangle_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (int) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        scanner.close();
    }
}
