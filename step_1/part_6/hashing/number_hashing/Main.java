package step_1.part_6.hashing.number_hashing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: read how many numbers you will input
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the Array: ");
        int[] arr = new int[n];

        // Step 2: read the n numbers
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: precompute frequencies
        // 'hash' size 13 means valid numbers are 0..12 only
        int[] hash = new int[13];

        // for each value x in arr, increment the count at index x
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++; // same as: hash[arr[i]] = hash[arr[i]] + 1
        }

        // Step 4: answer queries
        System.out.print("Enter how many quaries you want to check: ");
        int q = sc.nextInt(); // how many queries?
        System.out.print("Enter the number to check: ");
        int number;
        while (q-- > 0) { // run q times
            number = sc.nextInt(); // the number to ask about
            System.out.println(hash[number]); // print how many times it appeared
        }
        sc.close();
    }
}