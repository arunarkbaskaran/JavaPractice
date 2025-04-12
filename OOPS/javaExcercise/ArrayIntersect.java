package javaExcercise;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersect {
    public static void main(String args[]) {
        int[] a1 = new int[]{4, 6, 8, 5, 2, 6, 8};
        int[] a2 = new int[]{4, 10, 8, 18, 2, 6, 8};
        Map<Integer, Integer> uniqueMap = new HashMap<>();
        for (int i:a1)
        {
            uniqueMap.put(i,uniqueMap.getOrDefault(i,0)+1);
        }for (int j:a2)
        {
            uniqueMap.put(j,uniqueMap.getOrDefault(j,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : uniqueMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
}}}
