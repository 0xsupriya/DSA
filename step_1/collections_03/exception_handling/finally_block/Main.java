package step_1.collections_03.exception_handling.finally_block;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            int data = 100 / 0;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Exeption is: " + e);
        } finally {
            System.out.println("End block");
        }
        System.out.println("Bye World");
    }
}
