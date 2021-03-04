import numbers.ArabicNumeral;
import numbers.RomanNumeral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        String[] mass;
        int a = 0, b = 0, pos, res;
        boolean roman = false;


        while (true) {
            System.out.println("Input:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine().toUpperCase();
            mass = str.split(" ");

            char[] c = mass[0].toCharArray();
            pos = (int) c[0];

            if (pos > 48 && pos < 58) {
                a = Integer.parseInt(mass[0]);
                b = Integer.parseInt(mass[2]);
                roman = false;
            } else if (pos == 73 || pos == 86 || pos == 88) {
                a = RomanNumeral.valueOf(mass[0]).getI();
                b = RomanNumeral.valueOf(mass[2]).getI();
                roman = true;
            }

            switch (mass[1]) {
                case "+":
                    res = new ArabicNumeral(a, b).sum();
                    System.out.println(roman ? RomanNumeral.toArabicNumeral(res) : res);
                    break;
                case "-":
                    res = new ArabicNumeral(a, b).subtract();
                    System.out.println(roman ? RomanNumeral.toArabicNumeral(res) : res);
                    break;
                case "*":
                    res = new ArabicNumeral(a, b).multi();
                    System.out.println(roman ? RomanNumeral.toArabicNumeral(res) : res);
                    break;
                case "/":
                    res = new ArabicNumeral(a, b).division();
                    System.out.println(roman ? RomanNumeral.toArabicNumeral(res) : res);
                    break;

            }
        }
    }
}
