package Lab3_Java.lr3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;

        // повторяем ввод, пока не будет введено корректное значение
        while (size <= 0) {
            System.out.println("Введите размер массива (целое число больше 0):");
            try {
                size = in.nextInt();
                if (size <= 0) {
                    System.out.println("Ошибка: размер должен быть больше 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: нужно ввести целое число");
                in.next(); // пропускаем некорректный ввод
            }
        }

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 5 * i; // 2, 7, 12, 17, ...
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
