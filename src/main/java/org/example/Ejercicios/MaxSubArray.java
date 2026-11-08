package org.example.Ejercicios;

public class MaxSubArray {
    public static int Kadane (int[] arreglo) {
        int sumaActual = arreglo[0];
        int sumaMaximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];
            sumaActual = Math.max(actual, sumaActual + actual);
            sumaMaximo = Math.max(sumaActual, sumaMaximo);
        }
        return sumaMaximo;
    }
}
