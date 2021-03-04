package numbers;

public class ArabicNumeral {
    private final int a;
    private final int b;

    public ArabicNumeral(int a, int b) {
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

}
