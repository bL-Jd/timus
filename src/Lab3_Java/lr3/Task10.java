package Lab3_Java.lr3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
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
        System.out.print("Исходный массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // сортировка пузырьком по убыванию
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }

        System.out.print("После сортировки по убыванию: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
