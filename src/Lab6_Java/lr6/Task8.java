package Lab6_Java.lr6;

public class Task8 {

    // среднее значение элементов массива
    public static double average(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println("Среднее {1, 2, 3, 4}: " + average(new int[]{1, 2, 3, 4}));
        System.out.println("Среднее {10, -4, 7}: " + average(new int[]{10, -4, 7}));
        try {
            average(new int[0]);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
