// Write a Java program to find the vowels in a given string.

package step_1.basics.strings;

public class Main {
    public static void main(String[] args) {
        String name = "Supriya Debnath";
        for (char i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(name.charAt(i));
            }
        }
    }
}
