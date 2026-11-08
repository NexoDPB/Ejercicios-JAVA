package org.example.Ejercicios;

import java.util.Arrays;

public class Anagram {
    public static boolean AnagramChecker (String primeraCad, String segundaCad) {
        char[] primerArregloChar = primeraCad.replace(" ", "").toLowerCase().toCharArray();
        char[] segundoArregloChar = segundaCad.replace(" ", "").toLowerCase().toCharArray();
        if (primerArregloChar.length != segundoArregloChar.length) return false;
        for (char elementoBase : primerArregloChar) {
            int contarElementoBase = 0;
            int contarElementoSegundo = 0;
            for (char elementoRecorrido : primerArregloChar) {
                if (elementoBase == elementoRecorrido) contarElementoBase++;
            }
            for (char elementoRecorrido : segundoArregloChar) {
                if (elementoBase == elementoRecorrido) contarElementoSegundo++;
            }
            if (contarElementoBase != contarElementoSegundo) return false;
        }
        return true;
    }
    public static boolean AnagramCheckerArrays (String primeraCad, String segundaCad) {
        char[] primerArregloChar = primeraCad.replace(" ", "").toLowerCase().toCharArray();
        char[] segundoArregloChar = segundaCad.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(primerArregloChar);
        Arrays.sort(segundoArregloChar);
        return Arrays.equals(primerArregloChar, segundoArregloChar);
    }
}
