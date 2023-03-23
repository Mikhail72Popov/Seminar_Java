package org.example.cw5;
import java.util.HashMap;
import java.util.Map;

public class Ex2 {

    /** 2)Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     В противном случае (false).
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        System.out.println(searchDubl2(arr));
    }

    private static boolean searchDubl(int[] arr) {
        Map<Integer, Integer> testMass= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (testMass.containsKey(arr[i])){
                return false;
            }else testMass.put(arr[i], 1);
        }
        return true;
    }

    private static boolean searchDubl2(int[] arr){
        Map<Integer, Integer> testMass= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            testMass.put(arr[i], 1);
        }

        return (testMass.size()==arr.length);
    }
}

