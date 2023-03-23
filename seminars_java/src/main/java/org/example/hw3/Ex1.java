package org.example.hw3;

import org.example.hw3.model.Cost;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/** 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1-го или 2-го сорта среди товаров, название которых содержит «высший».
 */

public class Ex1 {
    public static void main(String[] args) {
        Cost cost1 = new Cost("bread", 100.23, "первый");
        Cost cost2 = new Cost("butter", 5000.0, "высший");
        Cost cost3 = new Cost("meat высший", 1900.0, "первый");
        Cost cost4 = new Cost("fish", 1500.0, "высший");
        Cost cost5 = new Cost("bread", 150.0, "высший");
        Cost cost6 = new Cost("butter высший", 4000.0, "первый");
        Cost cost7 = new Cost("meat", 2500.0, "высший");
        Cost cost8 = new Cost("fish", 1100.0, "второй");

        List<Cost> costList = new ArrayList<>();
        costList.add(cost1);
        costList.add(cost2);
        costList.add(cost3);
        costList.add(cost4);
        costList.add(cost5);
        costList.add(cost6);
        costList.add(cost7);
        costList.add(cost8);

        double maxPrice = 0;
        for (int i = 0; i < costList.size(); i++) {
            for (Cost cost : costList) {
                int indexJava = cost.getProduct().indexOf("высший");
                if (indexJava != -1) {
                    if (cost.getGrade().equals("первый") || cost.getGrade().equals("второй")) {
                        if (maxPrice < cost.getPrice()) maxPrice = cost.getPrice();
                    }
                }
            }
        }
        System.out.println("наибольшая цена товаров (согласно условия) = " + maxPrice);
    }
}
