package step_1.part_3.collections.generics_and_wrappers.generic_classes;

// Generic class with type T
class Box<T> {
    private T value;

    public void set(T val) {
        this.value = val;
    }

    public T get() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Generics in Java");
        System.out.println("String: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer: " + intBox.get());
    }
}
