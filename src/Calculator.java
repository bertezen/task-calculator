import my_exception.InvalidNumberException;
import numbers.CalculationNumeral;
import numbers.ConversionToInt;
import numbers.RomanNumeral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws InvalidNumberException, IOException {
        String[] mass;
        int[] a;
        int res;

        while (true) {

            System.out.println("Input:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            mass = br.readLine().toUpperCase().split(" ");
            try {
                a = ConversionToInt.convertToInt(mass[0], mass[2]);
                if (a[0] > 10 || a[1] > 10) {
                    throw new InvalidNumberException("Variables cannot be more than 10");
                }

                System.out.println("Output:");
                res = new CalculationNumeral(a[0], a[1]).select(mass[1]);
                printResult(res, ConversionToInt.roman);
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect operator");
                break;
            }
        }
    }

    private static void printResult(int res, boolean roman) {
        System.out.println(roman ? RomanNumeral.toRomeNumeral(res) : res);
    }
}
