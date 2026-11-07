/*
Проблема: 1409 Два бандита

Ввод
В единственной строке записано 2 числа —
количество банок, простреленных Гарри и Ларри соответственно.

Вывод
Выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.

исходные данные
4 7

результат
6 3
*/

import java.util.Scanner;

public class task1409 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harryShoot = input.nextInt();
        int larryShoot = input.nextInt();

        System.out.printf("%d %d\n", larryShoot - 1, harryShoot - 1);

    }

}