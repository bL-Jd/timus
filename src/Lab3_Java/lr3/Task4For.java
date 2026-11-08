package Lab3_Java.lr3;

import java.util.Scanner;

// Числа от меньшего до большего, цикл for
public class Task4For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        long min = Math.min(a, b);
        long max = Math.max(a, b);
        for (long i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        in.close();
    }
}
