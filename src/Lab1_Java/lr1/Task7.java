package Lab1_Java.lr1;

import java.time.Year;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст:");
        int age = in.nextInt();

        int birthYear = Year.now().getValue() - age;
        System.out.println("Год рождения: " + birthYear);
        in.close();
    }
}
