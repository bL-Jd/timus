/*
Проблема: 1000 A+B Проблема

Ввод
a и b

Вывод
a+b

исходные данные
1 5

результат
6
*/

import java.util.Scanner;

public class task1000 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.printf("%d\n", a + b);

    }

}