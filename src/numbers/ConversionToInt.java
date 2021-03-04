package numbers;

public class ConversionToInt {
    static public boolean roman = false;

    public static int[] convertToInt(String mass, String mass1) {
        char[] c = mass.toCharArray();
        int[] a = new int[2];
        int pos = c[0];
        if (pos > 48 && pos < 58) {
            a[0] = Integer.parseInt(mass);
            a[1] = Integer.parseInt(mass1);
            roman = false;
        } else if (pos == 73 || pos == 86 || pos == 88) {
            a[0] = RomanNumeral.valueOf(mass).getI();
            a[1] = RomanNumeral.valueOf(mass1).getI();
            roman = true;
        }
        return a;
    }
}
