package org.example.Ejercicios;

import java.util.Arrays;

public class MissingNumber {
        /*
        * Stream permite trabajar con listas y colecciones sin tener que utilizar tantos bucles for o while.
        * filter, forEach, map, sorted, boxed: int -> Integer, min, max, anyMatch: comprueba si cumplen la condicion, allMatch: comprueba si todos cumplen, noneMatch, count, sum, findFirst.
        */

    public static Integer MissingNumberMethodStream (int[] arreglo) {
        int menor = Arrays.stream(arreglo).min().orElseThrow();
        int mayor = Arrays.stream(arreglo).max().orElseThrow();
        for (int i = menor; i <= mayor; i++) {
            int numero = i;
            boolean existe = Arrays.stream(arreglo).anyMatch(n -> n == numero);
            if (!existe) return i;
        }
        return null;
    }
}
