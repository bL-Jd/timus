/*
Проблема: 1820 Уральские бифштексы

Ввод
В единственной строке через пробел записаны целые числа n и k (1 ≤ n, k ≤ 1000).

Вывод
Выведите минимальное количество минут, за которое повар сможет приготовить n бифштексов.

исходные данные
3 2

результат
3
*/

import java.util.Scanner;

public class task1820 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());
        int k = Integer.parseInt(input.next());

        int minutes;

        if (n > k)
            minutes = (int) Math.ceil((n*2.0) / k);
        else
            minutes = 2;


        System.out.println(minutes);

    }

}