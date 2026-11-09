package Lab7_Java.task4;

public class ClassB extends ClassA {
    public String text;

    public ClassB(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public ClassB(ClassB other) {
        super(other);
        this.text = other.text;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": symbol = " + symbol + ", text = " + text;
    }
}
