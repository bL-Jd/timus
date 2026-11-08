package Lab5_Java.lr5;

// Класс с полями max и min; max никогда не меньше min
public class MaxMin {
    private int max;
    private int min;

    // конструктор работает по тому же принципу, что и метод set
    public MaxMin(int a) {
        max = a;
        min = a;
    }

    public MaxMin(int a, int b) {
        max = Math.max(a, b);
        min = Math.min(a, b);
    }

    // с одним аргументом: из текущих max, min и аргумента выбираются наибольшее и наименьшее значения
    public void set(int a) {
        int newMax = Math.max(max, a);
        int newMin = Math.min(min, a);
        max = newMax;
        min = newMin;
    }

    // с двумя аргументами: наибольшее из четырёх значений идёт в max, наименьшее – в min
    public void set(int a, int b) {
        int newMax = Math.max(Math.max(max, min), Math.max(a, b));
        int newMin = Math.min(Math.min(max, min), Math.min(a, b));
        max = newMax;
        min = newMin;
    }

    public void show() {
        System.out.println("max = " + max + ", min = " + min);
    }
}
