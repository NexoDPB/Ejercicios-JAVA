package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNon {
    public static String FirstNonMethod (String cadena) {
        char[] arreglo = cadena.toLowerCase().toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            int cant = 0;
            for (char recorrido : arreglo) if (arreglo[i] == recorrido) cant++;
            if (cant == 1) return String.valueOf(arreglo[i]);
        }
        return "";
    }
    public static String FirstNonMethod2 (String cadena){
        Map<Character, Integer> mapa = new LinkedHashMap<>();
        for (char letra : cadena.toLowerCase().toCharArray())
            mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
        for (char letra : mapa.keySet())
            if (mapa.get(letra) == 1) return String.valueOf(letra);
        return "";
    }
}
