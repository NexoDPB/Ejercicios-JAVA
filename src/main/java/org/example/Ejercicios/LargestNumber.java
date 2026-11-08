package org.example.Ejercicios;

public class LargestNumber {
    public static int largest (int a, int b, int c) {
        int numberLargs;
        if (a > b && a > c) numberLargs = a;
        else if (b > a && b > c) numberLargs = b;
        else numberLargs = c;
        return numberLargs;
    }
}
