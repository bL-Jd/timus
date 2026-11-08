package Lab6_Java.lr6;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Аргументы 4, -2, 9, 7:");
        System.out.println("max = " + Stats.max(4, -2, 9, 7));
        System.out.println("min = " + Stats.min(4, -2, 9, 7));
        System.out.println("average = " + Stats.average(4, -2, 9, 7));

        int[] array = {10, 20, 30, 45};
        System.out.println("Массив 10, 20, 30, 45:");
        System.out.println("max = " + Stats.max(array));
        System.out.println("min = " + Stats.min(array));
        System.out.println("average = " + Stats.average(array));

        try {
            Stats.max();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
