package step_1.collections_03.exception_handling.types_of_exceptions.unchecked.null_pointer;

public class Main {
    public static void main(String[] args) {
        try {
            // ---------NullPointerException--------

            // String str = null;
            // int length = str.length();
            // System.out.println(length);

            // not an NullPointerException
            String str = "Supriya";
            System.out.println(str);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
