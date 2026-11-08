package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = in.next();
        System.out.println("Введите год рождения:");
        int birthYear = in.nextInt();

        int age = Year.now().getValue() - birthYear;
        System.out.println(name + ", ваш возраст: " + age);
        in.close();
    }
}
