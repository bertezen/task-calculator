package numbers;

import my_exception.InvalidOperationException;

public class CalculationNumeral {
    private final int a;
    private final int b;

    public CalculationNumeral(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multi() {
        return a * b;
    }

    public int division() {
        return a / b;
    }

    public int select(String s) throws InvalidOperationException {
        switch (s) {
            case "+":
                return sum();
            case "-":
                return subtract();
            case "*":
                return multi();
            case "/":
                return division();
            default:
                throw new InvalidOperationException("Wrong operation");
        }
    }

}
