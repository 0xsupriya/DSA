package step_1.collections_03.generics_and_wrappers.bounded_generic_methods;

// T must be a subclass of Number
class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(10, 20);
        System.out.println("Integer sum: " + intCalc.add());

        Calculator<Double> doubleCalc = new Calculator<>(5.5, 2.5);
        System.out.println("Double sum: " + doubleCalc.add());
    }
}
