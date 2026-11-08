package Lab6_Java.lr6;

public class Counter {
    private static int count = 0;

    // отображает текущее значение статического поля и увеличивает его на единицу
    public static void next() {
        System.out.println("Текущее значение: " + count);
        count++;
    }
}
