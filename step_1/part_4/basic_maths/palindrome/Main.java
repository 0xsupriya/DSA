package step_1.part_4.basic_maths.palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        int duplicate = number;
        int reverseNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }
        if (reverseNumber == duplicate) {
            System.out.print(reverseNumber + " is a Palindrome Number ");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        scanner.close();
    }
}
