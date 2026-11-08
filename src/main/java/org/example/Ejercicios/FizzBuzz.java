package org.example.Ejercicios;

public class FizzBuzz {
    public static String multiples() {
        StringBuilder numeros = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numeros.append("FizzBuzz \t");
            continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    numeros.append("Fizz \t");
                } else {
                    numeros.append("Buzz \t");
                }
                continue;
            }
            numeros.append(i).append("\t");
        }
        return numeros.toString();
    }
}
