package step_1.part_5.basic_recursion.print_name;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int count = scanner.nextInt();
        name(1, count);
        scanner.close();
    }

    public static void name(int i, int n) {
        if (i > n)
            return;
        System.out.println("supriya");
        name(i + 1, n);
    }

}
