package step_1.part_6.hashing.character_hashing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String s = sc.next();

        // Pre-compute frequencies
        int[] hash = new int[256]; // for all ASCII characters
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        // Queries
        System.out.print("Enter how many character you want to check: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0); // read a single character
            System.out.println(hash[c]);
        }

        sc.close();
    }
}
