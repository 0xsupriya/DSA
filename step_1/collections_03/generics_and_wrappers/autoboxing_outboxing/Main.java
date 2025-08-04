package step_1.collections_03.generics_and_wrappers.autoboxing_outboxing;

public class Main {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper
        int num = 100;
        Integer obj = num; // autoboxing

        // Unboxing: wrapper to primitive
        Integer wrapper = Integer.valueOf(200);
        int primitive = wrapper; // unboxing

        System.out.println("Autoboxed Integer: " + obj);
        System.out.println("Unboxed int: " + primitive);
    }
}
