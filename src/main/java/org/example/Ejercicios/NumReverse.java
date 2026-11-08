package org.example.Ejercicios;

public class NumReverse {
    public static int reverseNumber (int number) {
        int numberCopy = Math.abs(number);
        // Java se pregunta: con 5 no ingresa al bucle y nunca se asigna el vlaor a reverse
        int reverse = 0;
        while(numberCopy > 0) {
            reverse = (reverse * 10) + (numberCopy % 10);
            numberCopy = (int) numberCopy / 10;
        }
        if (number < 0) return (reverse * -1);
        else return reverse;
    }
}
