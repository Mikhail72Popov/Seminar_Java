package org.example.cw3;
import org.example.cw3.model.Coub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/** 4. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */
public class Ex4 {
    public static void main(String[] args) {
        Coub coub1 = new Coub("зеленый", 13, "деревянный");
        Coub coub2 = new Coub("желтый", 73, "металлический");
        Coub coub3 = new Coub("красный", 23, "картонный");
        Coub coub5 = new Coub("красный", 23, "картонный");
        Coub coub6 = new Coub("красный", 23, "картонный");
        Coub coub4 = new Coub("желтый", 3, "металлический");

        List<Coub> listCoub = new ArrayList<>();
        listCoub.add(coub1);
        listCoub.add(coub2);
        listCoub.add(coub3);
        listCoub.add(coub4);
        listCoub.add(coub5);
        listCoub.add(coub6);
        System.out.println("коллекция " + listCoub.size());
        System.out.println("уникальная коллекция : " + unicumCollections(listCoub).size());

    }

    private static Collection<Coub> unicumCollections(List<Coub> listCoub) {
        return new HashSet<>(listCoub);
    }
}
