package step_1.collections.exception_handling.throws_keyword;

public class Main {
    public static void checkAge(int age) throws Exception {
        if (age > 18) {
            System.out.println("You're Adult");
        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(21);
        } catch (Exception e) {
            System.out.println("Invalid " + e);
        }
    }
}
