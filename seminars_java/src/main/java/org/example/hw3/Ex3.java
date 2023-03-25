package org.example.hw3;
import org.example.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;



/** 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и
 * год издания после 2010 г, включительно.
*/
public class  Ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Лес", "Иванов", 100.0, 2050, 101);
        Book book2 = new Book("Война", "Петров", 120.0, 1990, 99);
        Book book3 = new Book("Океан", "Сидоров", 99.9, 2000, 50);
        Book book4 = new Book("Жизнь", "Смирнов", 130.5, 1945, 100);
        Book book5 = new Book("Берег", "Лоуренс", 150.0, 1600, 165);
        Book book6 = new Book("Лето", "Райкин", 133.6, 2012, 97);
        Book book7 = new Book("Утопия", "Бенс", 55.0, 2010, 25);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        for (Book book : bookList) {
                if (book.getAuthor().contains("А") | book.getAuthor().contains("а")
                        & book.getYear() >= 2010 & serching(book.getPage())) {
                        System.out.println(book.getName());
                }
        }

    }
    public static boolean serching(int a) {
        Double sq = Math.sqrt(a);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
