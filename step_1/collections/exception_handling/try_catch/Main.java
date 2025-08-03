package step_1.collections.exception_handling.try_catch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            int n = 10 / 0;
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("exception is: " + e);
        }
        System.out.println("Bye World");
    }
}
