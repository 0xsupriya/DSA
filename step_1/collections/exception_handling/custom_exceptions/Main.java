public class Main {

    public static void checkAge(int age) throws MyException {
        if (age > 18) {
            System.out.println("You're Adult");
        } else {
            throw new MyException("You're not Adult");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}