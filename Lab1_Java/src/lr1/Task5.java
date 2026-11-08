package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения:");
        int birthYear = in.nextInt();

        int age = Year.now().getValue() - birthYear;
        System.out.println("Ваш возраст: " + age);
        in.close();
    }
}
