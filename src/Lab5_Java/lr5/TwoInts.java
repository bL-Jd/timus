package Lab5_Java.lr5;

// Класс с двумя целочисленными полями и тремя конструкторами
public class TwoInts {
    private int a;
    private int b;

    // без аргументов: оба поля равны нулю
    public TwoInts() {
        this.a = 0;
        this.b = 0;
    }

    // один аргумент: значение получает первое поле, второе равно нулю
    public TwoInts(int a) {
        this.a = a;
        this.b = 0;
    }

    // два аргумента
    public TwoInts(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void show() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
