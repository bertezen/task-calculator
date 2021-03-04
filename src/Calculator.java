import my_exception.InvalidNumberException;
import my_exception.InvalidOperationException;
import numbers.ArabicNumeral;
import numbers.RomanNumeral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;

public class Calculator {

    public static void main(String[] args) throws InvalidNumberException, IOException {
        String[] mass;
        int a = 0, b = 0, pos, res;
        boolean roman = false;

        while (true) {
            System.out.println("Input:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            mass = br.readLine().toUpperCase().split(" ");
            try {
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
            } catch (NumberFormatException | IllegalFormatException e) {
                e.printStackTrace();
                break;
            }

            if (a + b > 20) {
                throw new InvalidNumberException("Variables cannot be more than 10");
            }

            System.out.println("Output:");
            switch (mass[1]) {
                case "+":
                    res = new ArabicNumeral(a, b).sum();
                    printResult(res, roman);
                    break;
                case "-":
                    res = new ArabicNumeral(a, b).subtract();
                    printResult(res, roman);
                    break;
                case "*":
                    res = new ArabicNumeral(a, b).multi();
                    printResult(res, roman);
                    break;
                case "/":
                    res = new ArabicNumeral(a, b).division();
                    printResult(res, roman);
                    break;
                default:
                    throw new InvalidOperationException("Wrong operation");

            }
        }
    }

    private static void printResult(int res, boolean roman) {
        System.out.println(roman ? RomanNumeral.toArabicNumeral(res) : res);
    }
}
