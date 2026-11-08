package Lab6_Java.lr6;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Counter.next();
        }
        // значение поля общее для класса, а не для объектов
        Counter.next();
        Counter.next();
    }
}
