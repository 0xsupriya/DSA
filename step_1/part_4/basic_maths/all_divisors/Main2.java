package step_1.part_4.basic_maths.all_divisors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                list.add(i);
                if (i != number / i) {
                    list.add(number / i);
                }
            }
        }
        Collections.sort(list);
        System.out.print(list);
        scanner.close();
    }
}
