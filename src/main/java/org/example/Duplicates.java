package org.example;
import java.util.Arrays;

public class Duplicates {
    public static int[] removeDuplicates(int[] array) {
        int[] arrayCopy = new int[array.length];
        int cantElemento = 0;
        for (int i = 0; i < array.length; i++) {
            boolean yaIncluido = false;
            for (int j = 0; j < cantElemento; j++) {
                if (array[i] == arrayCopy[j]) yaIncluido = true;
            }
            if (!yaIncluido) {
                arrayCopy[i] = array[i];
                cantElemento++;
            }
        }
        return Arrays.copyOf(arrayCopy, cantElemento);
    }
}
