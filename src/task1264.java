/*
Проблема: 1264 Трудовые будни

Ввод
Единственная строка содержит целые числа N (0 ≤ N ≤ 40000) и M (0 ≤ M ≤ 40000).

Вывод
Выведите число секунд, требуемых Петечкину на написание функции.

исходные данные
3 1

результат
6
*/

import java.util.Scanner;

public class task1264 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int timePerLine = 1;

        int totalLines = 0;

        for (int i = 0; i <= m; i++)
        {
            totalLines += n;
        }

        int totalTime = totalLines * timePerLine;

        System.out.println(totalTime);


    }

}