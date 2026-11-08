package Lab3_Java.lr3;

import java.util.Scanner;

// Числа Фибоначчи, цикл do-while
public class Task3DoWhile {
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
        int i = 1;
        do {
            System.out.print(prev + " ");
            long next = prev + curr;
            prev = curr;
            curr = next;
            i++;
        } while (i <= n);
        System.out.println();
        in.close();
    }
}
