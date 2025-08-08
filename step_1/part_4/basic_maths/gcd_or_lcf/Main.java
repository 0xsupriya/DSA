package step_1.part_4.basic_maths.gcd_or_lcf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number 1: ");
        int number_1 = scanner.nextInt();
        System.out.print("Enter a Number 2: ");
        int number_2 = scanner.nextInt();

        for (int i = Math.min(number_1, number_2); i >= 1; i--) {
            if (number_1 % i == 0 && number_2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
