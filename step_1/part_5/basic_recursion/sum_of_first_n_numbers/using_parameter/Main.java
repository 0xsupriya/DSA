package step_1.part_5.basic_recursion.sum_of_first_n_numbers.using_parameter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        sum(n, 0);
        scanner.close();
    }

    public static void sum(int i, int sum) {
        if (i < 1) {
            System.out.println("sum of first n numbers is: " + sum);
            return;
        }
        sum(i - 1, sum + i);
    }
}
