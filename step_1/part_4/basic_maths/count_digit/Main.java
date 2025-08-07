package step_1.part_4.basic_maths.count_digit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = scanner.nextInt();
        int count = 0;
        while (digit > 0) {
            count = count + 1;
            digit = digit / 10;
        }
        System.out.println("Count of Digit is: " + count);
        scanner.close();
    }
}
