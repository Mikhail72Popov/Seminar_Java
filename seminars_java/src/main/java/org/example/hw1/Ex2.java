package org.example.hw1;
//        Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
//        после которых следует отрицательное число.
//        Пример ввода:

import java.util.Scanner;

 public class Ex2 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Введите числа (ввод 0 прекратит этот цикл): ");
          int sum = 0;
          int a = scanner.nextInt();
          while (a != 0) {
              int b = scanner.nextInt();
                  if(b < 0 && a > 0){
                      sum = sum + a;
                  }
                  a = b;
          }
          System.out.printf("Сумма равна:");
          System.out.println(sum);
          scanner.close();
      }
 }