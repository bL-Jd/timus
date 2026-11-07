/*
Проблема: 1639 Шоколад 2

Ввод
В единственной строке через пробел записаны
целые числа m и n (1 ≤ m, n ≤ 50) — длина и ширина шоколадки в дольках.

Вывод
Если для того, чтобы выиграть, Карлсону нужно ходить первым,
выведите в единственной строке «[:=[first]», иначе выведите «[second]=:]».

исходные данные
2 4
1 3

результат
[:=[first]
[second]=:]
*/

import java.util.Scanner;

public class task1639 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int column = input.nextInt();

        int numLines = (row * column) - 1;

        if (even(numLines))
            System.out.println("[second]=:]");
        else
            System.out.println("[:=[first]");
    }

    public static boolean even(int num)
    {
        return num % 2 == 0;
    }

}