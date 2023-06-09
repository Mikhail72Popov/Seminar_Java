/*  1. Задача:
Учитывая входную строку s, измените порядок слов в обратном порядке.
Слово определяется как последовательность символов, не содержащих пробелов.
Слова в s будут разделены по крайней мере одним пробелом.
Возвращает строку слов в обратном порядке, объединенную одним пробелом.
Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов
между двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова.
Не включайте никаких дополнительных пробелов.

Пример 1:
Входные данные: s = "the sky is blue"
Вывод: "blue is sky the"

Пример 2:
Ввод: s = "  hello world  "
Результат: "world hello"
Пояснение: Ваша перевернутая строка не должна содержать начальных или завершающих пробелов.

Пример 3:
Входные данные: s = "a good   example"
Вывод: "example good a"
Объяснение:
Вам нужно сократить несколько пробелов между двумя словами до одного пробела в перевернутой строке.

Ограничения:
1 <= s.length <= 10^4
s содержит английские буквы (заглавные и строчные), цифры и пробелы ' '.
В s есть по крайней мере одно слово.
Продолжение:
Если строковый тип данных является изменяемым в вашем языке,
можете ли вы решить его на месте с помощью O (1) дополнительного пробела
*/

package org.example.cw1;
import java.util.Scanner;
import java.lang.String;
  public class Ex1 {
         public static void main(String[] args) {
             Scanner iScanner = new Scanner(System.in);
             System.out.printf("Введите строку: ");
             String s = iScanner.nextLine();
             iScanner.close();
             //String s = "the sky is blue";
             //String s = "  hello world  ";
             //String s = "a good   example";
             String[] words = s.split("\\s+");
             String outText = "";
             for (int i = words.length - 1; i >= 0; i--) {
                 outText += words[i] + " ";
             }
             System.out.println(outText);
         }
  }



