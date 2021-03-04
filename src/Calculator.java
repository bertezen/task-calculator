import numbers.ArabicNumeral;
import numbers.RomanNumeral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        String[] mass;
        int a = 0, b = 0, res;


        while (true) {
            System.out.println("Input:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine().toUpperCase();
            mass = str.split(" ");

            char[] c = mass[0].toCharArray();
            res = (int) c[0];

            if (res > 48 && res < 58) {
                a = Integer.parseInt(mass[0]);
                b = Integer.parseInt(mass[2]);
            } else if (res == 73 || res == 86 || res == 88) {
                a = RomanNumeral.valueOf(mass[0]).getI();
                b = RomanNumeral.valueOf(mass[2]).getI();
            }

            switch (mass[1]) {
                case "+":
                    System.out.println(new ArabicNumeral(a, b).sum());
                    break;
                case "-":
                    System.out.println(new ArabicNumeral(a, b).subtract());
                    break;
                case "*":
                    System.out.println(new ArabicNumeral(a, b).multi());
                    break;
                case "/":
                    System.out.println(new ArabicNumeral(a, b).division());
                    break;

            }
        }
    }
}
