package step_1.input_output;

import java.util.Scanner;

class Main {
    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        System.out.print(number);
        scanner.close();
    }

    public static void main(String[] args) {
        printNumber();
    }
}
