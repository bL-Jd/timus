package Lab6_Java.lr6;

import java.util.Arrays;

public class Task10 {

    // возвращает массив из двух элементов: наибольшее и наименьшее значения среди аргументов
    public static int[] maxMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Не передано ни одного числа");
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] result = maxMin(7, -3, 15, 0, 9);
        System.out.println("Аргументы 7, -3, 15, 0, 9: " + Arrays.toString(result)
                + " (наибольшее = " + result[0] + ", наименьшее = " + result[1] + ")");
        System.out.println("Один аргумент 4: " + Arrays.toString(maxMin(4)));
    }
}
