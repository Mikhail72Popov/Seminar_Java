/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 * Простое число — это натуральное число больше 1, у которого есть всего два делителя: единица и само число.
 */

package org.example.hw2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите целые числа: ");
        System.out.println("Сумма простых чисел = " + sumSimple(n));
    }

    public static int sumSimple(int n){
            Scanner sc = new Scanner(System.in);
            int rez = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (simple(a)) rez += a;
            }
            return rez;
        }

    static boolean simple(int a) {
            int p = 0;
            if ((a != 2 && a % 2 == 0)||(a > 10 && a % 10 == 5) || (a == 1)) {
                return false;
            }
            else {
                for (int j = 3; j <= Math.sqrt(a); j += 2) {
                    if (a % j == 0) {
                        p += 1; break;
                    }
                }
            }
            if (p > 0) {
                return false;
            } else return true;

        }

    }

