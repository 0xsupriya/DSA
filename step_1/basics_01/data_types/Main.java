package step_1.basics_01.data_types;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = scanner.nextInt();

        System.out.print("Enter Breadth: ");
        double breadth = scanner.nextInt();

        double area = length * breadth;
        System.out.print("Area of a recangle is: " + area);

        double perimeter = 2 * (length + breadth);
        System.out.print("Perimeter of a recangle is: " + perimeter);

        scanner.close();
    }
}
