// throw = I am throwing the exception now!

package step_1.collections.exception_handling.throw_keyword;

public class Main {
    static void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        checkAge(16);

    }
}
