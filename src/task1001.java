/*
Проблема: 1001 Обратный корень

Ввод
Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018),
отделённых друг от друга произвольным количеством пробелов и переводов строк.
Размер входного потока не превышает 256 КБ.

Вывод
Для каждого числа Ai, начиная с последнего и заканчивая первым,
в отдельной строке вывести его квадратный корень не менее чем
с четырьмя знаками после десятичной точки.

исходные данные
 1427  0

   876652098643267843
5276538

результат
2297.0716
936297014.1164
0.0000
37.7757
*/

import java.util.ArrayList;
import java.util.Scanner;

public class task1001 {

    public static void main(String[] args)
    {
        reverseRoot();
    }

    public static void reverseRoot()
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<Long>();

        while(input.hasNext())
        {
            numbers.add(Long.valueOf(input.next()));
        }

        for (int i = numbers.size() -1; i >= 0; i--)
        {
            System.out.printf("%.4f\n" ,Math.sqrt(numbers.get(i).doubleValue()));
        }

        input.close();
    }

}