package step_1.part_5.basic_recursion.sum_of_first_n_numbers.using_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        System.out.println("sum is: " + sum(n));
        scanner.close();
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }
}
