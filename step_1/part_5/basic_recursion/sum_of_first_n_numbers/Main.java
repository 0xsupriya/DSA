package step_1.part_5.basic_recursion.sum_of_first_n_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        number(n);
        scanner.close();
    }

    public static void number(int n) {
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        System.out.println(sum);
    }
}
