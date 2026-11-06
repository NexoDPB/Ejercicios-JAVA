package org.example;

public class Palindrome {
    public static boolean isPalindrome (String text) {
        String cadena = text.trim().replace(" ", "").toLowerCase();
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) return false;
        }
        return true;
    }
}
