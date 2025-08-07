package step_1.part_4.basic_maths.reverse_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        int reverseNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }
        System.out.print(reverseNumber);
        scanner.close();
    }
}
