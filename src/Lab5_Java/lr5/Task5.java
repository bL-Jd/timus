package Lab5_Java.lr5;

public class Task5 {
    public static void main(String[] args) {
        LimitedValue v1 = new LimitedValue();
        System.out.println("Конструктор без аргументов: " + v1.getValue());

        LimitedValue v2 = new LimitedValue(57);
        System.out.println("Конструктор с аргументом 57: " + v2.getValue());

        LimitedValue v3 = new LimitedValue(250);
        System.out.println("Конструктор с аргументом 250: " + v3.getValue());

        v3.setValue(80);
        System.out.println("setValue(80): " + v3.getValue());
        v3.setValue(101);
        System.out.println("setValue(101): " + v3.getValue());
        v3.setValue();
        System.out.println("setValue(): " + v3.getValue());
    }
}
