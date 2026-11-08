package Lab2_Java.lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = in.nextInt();

        if (n % 4 == 0 && n >= 10) {
            System.out.println("Число удовлетворяет критериям");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }
        in.close();
    }
}
