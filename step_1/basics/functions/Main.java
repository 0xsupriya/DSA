//Create a function that takes a number and returns its square.

package step_1.basics.functions;

import java.util.Scanner;

public class Main {

    public static void Square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int square = number * number;
        scanner.close();
        System.out.print("Square of " + number + " is: " + square);

    }

    public static void main(String[] args) {
        Square();
    }

}
