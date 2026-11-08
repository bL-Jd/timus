package Lab3_Java.lr3;

import java.util.Scanner;

// Версия на операторе выбора switch
public class Task2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели:");
        String day = in.next().toLowerCase();

        switch (day) {
            case "понедельник":
                System.out.println("Порядковый номер дня: 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер дня: 2");
                break;
            case "среда":
                System.out.println("Порядковый номер дня: 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер дня: 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер дня: 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер дня: 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер дня: 7");
                break;
            default:
                System.out.println("Такого дня нет");
        }
        in.close();
    }
}
