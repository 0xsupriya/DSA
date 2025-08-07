package step_1.part_4.basic_maths.prime_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.print("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
        scanner.close();
    }
}
