package Lab3_Java.lr3;

import java.util.Scanner;

// Версия на вложенных условных операторах
public class Task2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели:");
        String day = in.next().toLowerCase();

        if (day.equals("понедельник")) {
            System.out.println("Порядковый номер дня: 1");
        } else if (day.equals("вторник")) {
            System.out.println("Порядковый номер дня: 2");
        } else if (day.equals("среда")) {
            System.out.println("Порядковый номер дня: 3");
        } else if (day.equals("четверг")) {
            System.out.println("Порядковый номер дня: 4");
        } else if (day.equals("пятница")) {
            System.out.println("Порядковый номер дня: 5");
        } else if (day.equals("суббота")) {
            System.out.println("Порядковый номер дня: 6");
        } else if (day.equals("воскресенье")) {
            System.out.println("Порядковый номер дня: 7");
        } else {
            System.out.println("Такого дня нет");
        }
        in.close();
    }
}
