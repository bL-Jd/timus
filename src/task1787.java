/*
Проблема: 1787 Поворот на МЕГУ

Ввод
В первой строке записаны целые числа k и n (1 ≤ k, n ≤ 100) — количество машин,
успевающих повернуть на «МЕГУ» в течение минуты, и количество минут,
прошедших с начала наблюдений. Во второй строке через пробел записаны
целые числа a1, …, an (0 ≤ ai ≤ 100), где ai — количество машин, подъехавших к повороту
со стороны города в течение i-й минуты. Можно считать, что наблюдения начинаются рано утром,
когда машин, ожидающих на повороте, ещё нет.

Вывод
Выведите количество машин, стоящих в пробке на повороте через n минут после начала наблюдений.

исходные данные
5 3
6 7 2

5 3
20 0 0

результат
0
5
*/

import java.util.Scanner;

public class task1787 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mega = input.nextLine().split(" ");
        int carPassPerMinute = Integer.parseInt(mega[0]);

        String[] numCars = input.nextLine().split(" ");

        for (int i = 0; i < Integer.parseInt(mega[1]) - 1; i++)
        {
            int remaining = Integer.parseInt(numCars[i]) - carPassPerMinute;
            if (remaining > 0)
            {
                numCars[i + 1] = (Integer.parseInt(numCars[i + 1]) + remaining) + "";
            }
        }

        int remainingAtLast = Integer.parseInt(numCars[numCars.length - 1]) - carPassPerMinute;


        if (remainingAtLast < 0)
            remainingAtLast = 0;

        System.out.println(remainingAtLast);
    }

}