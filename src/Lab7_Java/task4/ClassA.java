package Lab7_Java.task4;

public class ClassA {
    public char symbol;

    // конструктор на основе значения поля
    public ClassA(char symbol) {
        this.symbol = symbol;
    }

    // конструктор создания копии
    public ClassA(ClassA other) {
        this.symbol = other.symbol;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": symbol = " + symbol;
    }
}
