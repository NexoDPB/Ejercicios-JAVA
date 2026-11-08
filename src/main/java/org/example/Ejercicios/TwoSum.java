package org.example.Ejercicios;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] TwoSumMethod (int[] arreglo, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arreglo.length; i++) {
            int complement = target - arreglo[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(arreglo[i], i);
        }
        return new int[]{};
    }
}
