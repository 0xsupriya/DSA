package step_1.basics.data_types;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Length: ");
        double length = scanner.nextInt();

        System.out.println("Enter Breadth: ");
        double breadth = scanner.nextInt();

        double area = length * breadth;
        System.out.println("Area of a recangle is: " + area);

        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of a recangle is: " + perimeter);

        scanner.close();
    }
}
