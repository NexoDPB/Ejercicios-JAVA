package org.example.Ejercicios;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedMethod (String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char element  : cadena.toCharArray()) {
            if (element == '(' || element == '[' || element == '{') pila.push(element);
            else if (element == '}' || element == ']' || element == ')') {
                if (pila.isEmpty()) return false;
                char top = pila.pop();
                if (element == ']' && top != '[' ) return false;
                if (element == '}' && top != '{' ) return false;
                if (element == ')' && top != '(' ) return false;
            }
        }
        return true;
    }
}
