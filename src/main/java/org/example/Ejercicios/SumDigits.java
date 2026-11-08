package org.example.Ejercicios;

public class SumDigits {
    public static int sumOfDigits (int number) {
        int sum = 0;
        String cadena = String.valueOf(number);
        for (int i = 0; i < cadena.length(); i++) {
                sum += Character.getNumericValue(cadena.charAt(i));
        }
        return sum;
    }
}
