package step_1.part_4.basic_maths.gcd_or_lcf;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number 1: ");
        int number_1 = scanner.nextInt();
        System.out.print("Enter a Number 2: ");
        int number_2 = scanner.nextInt();
        while (number_1 > 0 && number_2 > 0) {
            if (number_1 > number_2)
                number_1 = number_1 % number_2;
            number_2 = number_2 % number_1;

            if (number_1 == 0)
                System.out.println(number_2);
            System.out.println(number_1);
        }
        scanner.close();
    }
}
