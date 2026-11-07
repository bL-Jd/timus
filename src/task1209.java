/*
Проблема: 1209 1, 10, 100, 1000...

Ввод
В первой строке находится целое число N (1 ≤ N ≤ 65535).
В i-й из N последующих строк записано целое число Ki —
номер позиции в последовательности (1 ≤ Ki ≤ 231 − 1).

Вывод
Выведите через пробел N цифр. i-я цифра должна равняться цифре,
которая находится в описанной выше последовательности на позиции с номером Ki.

исходные данные
4
3
14
7
6

результат
0 0 1 0
*/

import java.util.Scanner;

public class task1209 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTimes = input.nextInt();
        String format;

        for (int i = 0; i < numTimes; i++)
        {
            long num = input.nextInt();
            format = (i == numTimes - 1) ? "" : " ";

            if (fastN(num))
                System.out.print(1 + format);
            else
                System.out.print(0 + format);
        }

        input.close();

    }

    public static boolean fastN(long k)
    {
        double n = (Math.sqrt(8*k - 7) -1) / 2;
        if (n % 1 == 0)
            return true;
        else
            return false;
    }

    public static long getImmediateN(long num)
    {
        long high = num;
        long low = 1;

        long n = (high + low) / 2;


        while (! (getN(n) <= num) || ! (getN(n+1) > num))
        {
            if (getN(n) > num)
            {
                high = n;
                n = (high + low) / 2;
            }
            else if (getN(n) < num)
            {
                low = n;
                n = (high + low) / 2;
            }
        }

        return getN(n);
    }

    public static long getN(long n)
    {
        return n * (n+1) / 2;
    }
}