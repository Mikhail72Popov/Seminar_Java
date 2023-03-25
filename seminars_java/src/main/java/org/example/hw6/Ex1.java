package org.example.hw6;

import org.example.hw6.model.Laptop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
 * выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
 * также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Ex1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 8, 650, "Windows", "yellow");
        Laptop laptop2 = new Laptop("HP", 16, 550, "Windows", "red");
        Laptop laptop3 = new Laptop("Asus", 8, 450, "Linux", "black");
        Laptop laptop4 = new Laptop("Apple", 16, 750, "MAC", "red");
        Laptop laptop5 = new Laptop("HP", 8, 650, "Windows", "gold");
        Laptop laptop6 = new Laptop("Lenovo", 8, 650, "Windows", "blue");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);


        System.out.println("1 - Модель\n" +
                "2 - ОЗУ\n" +
                "3 - Объем ЖД\n" +
                "4 - Операционная система\n" +
                "5 - Цвет");
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Введите производителя ноутбука: ");
                Scanner sc1 = new Scanner(System.in);
                String prod = sc1.nextLine();
                for (Laptop laptop : laptopList) {
                    if (laptop.getProducer().equals(prod))
                        System.out.println(laptop.toString());
                }
                break;

            case 2:
                System.out.print("Введите минимальный объём ОЗУ: ");
                Scanner sc2 = new Scanner(System.in);
                int random = sc2.nextInt();
                for (Laptop laptop : laptopList) {
                    if (laptop.getRandomMemory() >= random)
                        System.out.println(laptop.toString());
                }
                break;

            case 3:
                System.out.print("Введите минимальный объём жёсткого диска: ");
                Scanner sc3 = new Scanner(System.in);
                int disk = sc3.nextInt();
                for (Laptop laptop : laptopList) {
                    if (laptop.getHardDisk() >= disk)
                        System.out.println(laptop.toString());
                }
                break;

            case 4:
                System.out.print("Введите требуемую ос: ");
                Scanner sc4 = new Scanner(System.in);
                String oper= sc4.nextLine();
                for (Laptop laptop : laptopList) {
                    if (laptop.getOperSystem().equals(oper))
                        System.out.println(laptop.toString());
                }
                break;

            case 5:
                System.out.print("Введите цвет: ");
                Scanner sc5 = new Scanner(System.in);
                String color = sc5.nextLine();
                for (Laptop laptop : laptopList) {
                    if (laptop.getColor().equals(color))
                        System.out.println(laptop.toString());
                }
                break;
            default:
                System.out.println("Не соответствует необходимому критерию");
                break;

        }

    }
}

