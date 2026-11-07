/*
Проблема: 1877 Велосипедные коды

Ввод
В первой строке записан код, установленный на первом замке, во второй строке — код,
установленный на втором замке. Оба кода — строки длины 4, состоящие из цифр от 0 до 9.

Вывод
Выведите «yes», если злоумышленник рано или поздно взломает замок, и «no» в противном случае.

исходные данные
0001
0000
0002
0001

результат
no
yes
*/

import java.util.Scanner;

public class task1877 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstLock = Integer.parseInt(input.next());
        int secondLock = Integer.parseInt(input.next());
        boolean match = false;

        int thiefCode = 0;

        while(thiefCode <= firstLock || thiefCode <= secondLock)
        {
            if (even(thiefCode) && thiefCode == firstLock)
            {
                System.out.println("yes");
                match = true;
                break;
            }
            else if (!even(thiefCode) && thiefCode == secondLock)
            {
                System.out.println("yes");
                match = true;
                break;
            }

            thiefCode++;

        }
        if (!match)
            System.out.println("no");
    }

    public static boolean even(int num)
    {
        return num % 2 == 0;
    }

}