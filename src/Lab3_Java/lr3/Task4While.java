package Lab3_Java.lr3;

import java.util.Scanner;

// Числа от меньшего до большего, цикл while
public class Task4While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        in.close();
    }
}
