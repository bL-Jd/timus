package Lab3_Java.lr3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        if (size < 1) {
            System.out.println("Введено некорректное значение");
            in.close();
            return;
        }

        int[] nums = new int[size];
        Random random = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(20);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // поиск минимального значения
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Минимальное значение: " + min);

        // вывод индексов всех элементов с минимальным значением
        System.out.print("Индексы минимальных элементов: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        in.close();
    }
}
