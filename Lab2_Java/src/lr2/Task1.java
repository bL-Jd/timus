package lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = in.nextInt();

        if (n % 3 == 0) {
            System.out.println("Число " + n + " делится на 3");
        } else {
            System.out.println("Число " + n + " не делится на 3");
        }
        in.close();
    }
}
