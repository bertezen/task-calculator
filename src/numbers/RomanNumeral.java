package numbers;

public enum RomanNumeral {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), XI("IX", 9), X("X", 10);
    private int i;
    private String s;

     RomanNumeral(String s, int i) {
        this.i = i;
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }
}
