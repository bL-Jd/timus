package Lab2_Java.lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = in.nextInt();

        // floorMod, чтобы остаток не был отрицательным у отрицательных чисел
        if (Math.floorMod(n, 5) == 2 && Math.floorMod(n, 7) == 1) {
            System.out.println("Число удовлетворяет критериям");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }
        in.close();
    }
}
