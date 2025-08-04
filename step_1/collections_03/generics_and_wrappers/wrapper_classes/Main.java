package step_1.collections_03.generics_and_wrappers.wrapper_classes;

public class Main {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // manual boxing

        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar);

        System.out.println("Integer Wrapper: " + wrapperInt);
        System.out.println("Character Wrapper: " + wrapperChar);

        // Using wrapper methods
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Binary of 10: " + Integer.toBinaryString(10));
    }
}
