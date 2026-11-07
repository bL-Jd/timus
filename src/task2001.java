/*
Проблема: 2001 Математики и ягоды

Ввод
Входные данные состоят из трёх строк. В i-й строке (1 ≤ i ≤ 3)
записаны целые числа ai и bi (0 ≤ ai, bi ≤ 10 000).

Вывод
В единственной строке выведите пару целых чисел через пробел — массу ягод,
собранных, соответственно, первым и вторым математиком.

исходные данные
1 2
2 1
0 3

результат
1 1
*/

import java.util.Scanner;

public class task2001 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int berryaPlusBasketa = input.nextInt();
        int berrybPlusBasketb = input.nextInt();

        input.nextInt();
        int basketb = input.nextInt();
        int basketa = input.nextInt();

        int berrya = berryaPlusBasketa - basketa;
        int berryb = berrybPlusBasketb - basketb;

        System.out.printf("%d %d\n", berrya, berryb);

        input.close();
    }
}