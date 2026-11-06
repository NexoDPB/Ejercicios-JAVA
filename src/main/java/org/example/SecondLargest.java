package org.example;

public class SecondLargest {
    public static Integer secondLargestNumber (int[] number) {
        if (number.length == 1) return null;
        Integer primero = null;
        Integer segundo = null;
        for (int i = 0; i < number.length; i++) {
            if (primero == null  || primero < number[i]){
                segundo = primero;
                primero = number[i];
            } else if (number[i] != primero && (segundo == null || number[i] > segundo)) segundo = number[i];
        }
        return segundo;
    }
}
