/*
Проблема: 2066 Простое выражение

Ввод
В первой строке вводится одно целое число n — количество друзей Маршалла и Лили,
которым они отослали приглашение (1 ≤ n ≤ 20).
Затем в n строках описываются ответы на приглашения. Каждый ответ имеет вид name[+one].
Это имя приглашённого друга и +one, если друг отметил этот вариант.
Гарантируется, что длина каждого имени не превосходит 20,
и каждое имя состоит только из букв латинского алфавита.

Вывод
Выведите одно целое число — стоимость обеда в долларах.

исходные данные
3
Ted+one
Robin
Barney

6
Alice+one
Bob+one
carl
Debora+one
Enrique+one
FRED+one

результат
600
1400
*/

import java.util.Scanner;

public class task2100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Маршалл и Лили
        int guests = 2;

        for (int i = 0; i < n; i++) {
            String answer = sc.next();

            // Каждый приглашенный друг
            guests++;

            // Если друг приходит со своей парой
            if (answer.endsWith("+one")) {
                guests++;
            }
        }

        // Если всего 13 человек, добавляем манекен
        if (guests == 13) {
            guests++;
        }

        // Стоимость обслуживания одного человека — 100 долларов
        int cost = guests * 100;

        System.out.println(cost);

        sc.close();
    }
}
