package Lab1_Java.lr1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели:");
        String weekday = in.next();
        System.out.println("Введите название месяца:");
        String month = in.next();
        System.out.println("Введите дату (номер дня в месяце):");
        int day = in.nextInt();

        System.out.println("Сегодня: " + weekday + ", дата " + day + ", месяц " + month + ".");
        in.close();
    }
}
