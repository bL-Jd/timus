package Lab6_Java.lr6;

import java.util.Arrays;

public class Task6 {

    // возвращает новый массив из первых count элементов исходного массива;
    // если count больше длины массива, возвращается копия исходного массива
    public static int[] take(int[] source, int count) {
        if (count < 0) {
            count = 0;
        }
        int length = Math.min(count, source.length);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = source[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] source = {5, 8, 13, 21, 34};
        System.out.println("Исходный массив: " + Arrays.toString(source));
        System.out.println("take(3):  " + Arrays.toString(take(source, 3)));
        System.out.println("take(5):  " + Arrays.toString(take(source, 5)));
        int[] copy = take(source, 100);
        System.out.println("take(100): " + Arrays.toString(copy));
        System.out.println("Это новый массив (не ссылка на исходный): " + (copy != source));
    }
}
