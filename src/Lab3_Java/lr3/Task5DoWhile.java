package Lab3_Java.lr3;

import java.util.Scanner;

// Сумма чисел: остаток 2 при делении на 5 ИЛИ остаток 1 при делении на 3, цикл do-while
public class Task5DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в сумме:");
        int count = in.nextInt();
        if (count < 1) {
            System.out.println("Введено некорректное значение");
            in.close();
            return;
        }

        long sum = 0;
        int found = 0;
        long x = 1;
        do {
            if (x % 5 == 2 || x % 3 == 1) {
                System.out.print(x + " ");
                sum += x;
                found++;
            }
            x++;
        } while (found < count);
        System.out.println();
        System.out.println("Сумма: " + sum);
        in.close();
    }
}
