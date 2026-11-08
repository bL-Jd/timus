package Lab6_Java.lr6;

// Статические методы с произвольным количеством аргументов (или массивом)
public class Stats {

    public static int max(int... numbers) {
        check(numbers);
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static int min(int... numbers) {
        check(numbers);
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < result) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static double average(int... numbers) {
        check(numbers);
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    private static void check(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Не передано ни одного числа");
        }
    }
}
