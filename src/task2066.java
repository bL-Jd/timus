/*
Проблема: 2066 Простое выражение

Ввод
Даны целые неотрицательные числа a, b, c
в неубывающем порядке (0 ≤ a ≤ b ≤ c ≤ 100), каждое в отдельной строке.

Вывод
Выведите одно целое число — минимальное значение выражения.

исходные данные
1
2
3

результат
-5
*/

import java.util.Scanner;

public class task2066 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long min = Long.MAX_VALUE;

        // Перебираем все возможные расстановки операций
        char[] ops = {'+', '-', '*'};

        for (char op1 : ops) {
            for (char op2 : ops) {

                long result;

                // Умножение имеет приоритет
                if (op1 == '*' && op2 == '*') {
                    result = a * b * c;
                } else if (op1 == '*' && op2 == '+') {
                    result = a * b + c;
                } else if (op1 == '*' && op2 == '-') {
                    result = a * b - c;
                } else if (op1 == '+' && op2 == '*') {
                    result = a + b * c;
                } else if (op1 == '-' && op2 == '*') {
                    result = a - b * c;
                } else if (op1 == '+' && op2 == '+') {
                    result = a + b + c;
                } else if (op1 == '+' && op2 == '-') {
                    result = a + b - c;
                } else if (op1 == '-' && op2 == '+') {
                    result = a - b + c;
                } else {
                    result = a - b - c;
                }

                min = Math.min(min, result);
            }
        }

        System.out.println(min);

        sc.close();
    }
}
