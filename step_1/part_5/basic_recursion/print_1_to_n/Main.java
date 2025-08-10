package step_1.part_5.basic_recursion.print_1_to_n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        number(1, n);
        scanner.close();
    }

    public static void number(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);

        number(i + 1, n);
    }
}
