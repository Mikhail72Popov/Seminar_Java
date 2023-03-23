package org.example.hw4;

import java.util.LinkedList;
import java.util.List;


/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Ex1 {

    public static void main(String[] args) {
        List<Integer> nList = new LinkedList<Integer>(List.of(1, 2, 3, 4, -5, 6, 7));
        System.out.println(nList);
        for (int i = nList.size() - 1; i >= 0; i--) {
            System.out.print(nList.get(i)+"  " );
        }
    }
}
