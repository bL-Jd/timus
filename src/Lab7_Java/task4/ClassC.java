package Lab7_Java.task4;

public class ClassC extends ClassB {
    public int number;

    public ClassC(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    public ClassC(ClassC other) {
        super(other);
        this.number = other.number;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": symbol = " + symbol +
                ", text = " + text + ", number = " + number;
    }
}
