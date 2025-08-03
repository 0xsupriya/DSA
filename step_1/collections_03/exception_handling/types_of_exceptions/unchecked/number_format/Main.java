package step_1.collections_03.exception_handling.types_of_exceptions.unchecked.number_format;

public class Main {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int num = Integer.parseInt(s); // NumberFormatException
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
