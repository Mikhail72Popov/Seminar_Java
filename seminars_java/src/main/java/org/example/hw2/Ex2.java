/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */

package org.example.hw2;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите целые числа: ");
        System.out.println("Верно ли, что последовательность является возрастающей: " + condition(n));
    }

    private static boolean condition(int n) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (b <= a) return false;
            a = b;
        }
        return true;
    }
}
