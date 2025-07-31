package step_1.patterns.alpha_hill_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // alphabet
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j >= breakPoint) {
                    ch--;
                } else {
                    ch++;
                }
            }
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}