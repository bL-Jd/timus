package Lab3_Java.lr3;

import java.util.Scanner;

// Числа Фибоначчи, цикл for
public class Task3For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел (от 1 до 92):");
        int n = in.nextInt();
        if (n < 1 || n > 92) {
            System.out.println("Введено некорректное значение");
            in.close();
            return;
        }

        long prev = 1;
        long curr = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(prev + " ");
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println();
        in.close();
    }
}
