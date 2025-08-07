package step_1.part_3.collections.exception_handling.types_of_exceptions.unchecked.arithmetic;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b; // This causes ArithmeticException
        System.out.println(c);
    }
}
