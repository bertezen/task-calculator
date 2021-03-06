package numbers;

public enum RomanNumeral {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5),
    VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10);

    private final int i;

    RomanNumeral(String s, int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static String toRomeNumeral(int a) {

        int[] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letters = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            while (a >= numbers[i]) {
                roman.append(letters[i]);
                a -= numbers[i];
            }
        }
        return roman.toString();

    }
}
