package step_1.part_4.basic_maths.armstrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        int duplicate = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            number = number / 10;
        }
        if (duplicate == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }

        scanner.close();
    }
}
