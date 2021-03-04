package numbers;

public class ConversionToInt {
    static public boolean roman = false;

    public static int convers(String mass) {
        char[] c = mass.toCharArray();
        int a = 0;
        int pos = (int) c[0];
        if (pos > 48 && pos < 58) {
            a = Integer.parseInt(mass);
            roman = false;
        } else if (pos == 73 || pos == 86 || pos == 88) {
            a = RomanNumeral.valueOf(mass).getI();
            roman = true;
        }
        return a;
    }
}
