package lr2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = in.nextInt();

        if (n >= 5 && n <= 10) {
            System.out.println("Число входит в диапазон от 5 до 10");
        } else {
            System.out.println("Число не входит в диапазон от 5 до 10");
        }
        in.close();
    }
}
