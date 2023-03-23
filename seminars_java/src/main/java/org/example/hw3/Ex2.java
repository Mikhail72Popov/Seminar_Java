package org.example.hw3;

import org.example.hw3.model.Namgrad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */


public class Ex2 {
    public static void main(String[] args) {
        Namgrad namgrad1 = new Namgrad("bread", "RU", 0.5, 150.0, "высший");
        Namgrad namgrad2 = new Namgrad("butter", "KZ", 1.0, 1500.0, "первый");
        Namgrad namgrad3 = new Namgrad("bread", "CN", 0.5, 120.0, "второй");
        Namgrad namgrad4 = new Namgrad("meat", "AM", 1.0, 1700.0, "высший");
        Namgrad namgrad5 = new Namgrad("butter", "BY", 1.0, 1200.0, "второй");
        Namgrad namgrad6 = new Namgrad("bread", "RU", 0.5, 130.0, "первый");
        Namgrad namgrad7 = new Namgrad("butter", "KZ", 1.0, 1800.0, "высший");
        Namgrad namgrad8 = new Namgrad("bread", "KG", 0.5, 160.0, "второй");

        List<Namgrad> namgradList = new ArrayList<>();
        namgradList.add(namgrad1);
        namgradList.add(namgrad2);
        namgradList.add(namgrad3);
        namgradList.add(namgrad4);
        namgradList.add(namgrad5);
        namgradList.add(namgrad6);
        namgradList.add(namgrad7);
        namgradList.add(namgrad8);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый, второй или высший сорт :" );
        String searchGrade = scanner.nextLine();
        double minPrice = 5000.0;
        List<String> product = new ArrayList<>();
        for (int i = 0; i < namgradList.size(); i++) {
            for (Namgrad namgrad : namgradList){
                if (namgrad.getGrade().equals(searchGrade)){
                    if (minPrice > namgrad.getPrice()) {
                        minPrice = namgrad.getPrice();
                        product.add(namgradList.get(i).getProduct());
                    }
                }
            }
        }
        System.out.println(" product: " + product);
        System.out.println("наименьшая цена товаров = " + minPrice);
    }
}
