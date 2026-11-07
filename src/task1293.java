/*
Проблема: 1293 Эния

Ввод
Единственная строка содержит целые числа
N (1 ≤ N ≤ 100), A (1 ≤ A ≤ 100), B (1 ≤ B ≤ 100).

Вывод
Выведите вес необходимого для обработки сульфида тория в нанограммах.

исходные данные
5 2 3

результат
60
*/

import java.util.Scanner;

public class task1293 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numRectangle = input.nextInt();
        int length = input.nextInt();
        int width = input.nextInt();

        System.out.println(numRectangle * length * width * 2);

    }

}