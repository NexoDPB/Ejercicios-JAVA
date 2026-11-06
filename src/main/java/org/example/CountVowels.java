package org.example;

public class CountVowels {
    public static int countVowels (String text) {
        String cadena = text.toLowerCase();
        int count = 0;
        for (char element : cadena.toCharArray()) {
            if (element == 'a' || element ==  'e' || element ==  'i' || element ==  'o' || element ==  'u') count++;
        }
        return count;
    }
}
