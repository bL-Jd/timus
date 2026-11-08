package Lab1_Java.lr1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = in.next();
        System.out.println("Введите возраст:");
        int age = in.nextInt();

        System.out.println("Вас зовут " + name + ", вам " + age + " лет(года).");
        in.close();
    }
}
