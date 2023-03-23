package org.example.hw4;

/**
 * Дана строка, содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
 * является ли входная строка допустимой.
 * Входная строка допустима, если:
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
 *
 * Пример 1:
 * Ввод: s = "()"
 * Вывод: true
 *
 * Пример 2:
 * Ввод: s = "()[]{}"
 * Вывод: true
 *
 * Пример 3:
 * Ввод: s = "(]"
 * Вывод: false
 */
public class Ex2 {
    public static void main(String[] args) {
        String symbol = "(({}[]()";
        System.out.println(isValid(symbol));
    }
    public static boolean isValid(String symbol) {
        char[] charArray = new char[symbol.length()];
        charArray = symbol.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            if (charArray[i] == '[' && charArray[i + 1] != ']') {
                return false;
            } else if (charArray[i] == '{' && charArray[i + 1] != '}') {
                return false;
            } else if (charArray[i] == '(' && charArray[i + 1] != ')') {
                return false;
            }
        }
        return true;
    }
}
