package Lab7_Java.task5;

public class SubClassTwo extends SuperClass {
    protected char symbol;

    public SubClassTwo(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        System.out.println("Class name: " + getClass().getSimpleName() +
                ", text = " + getText() + ", symbol = " + symbol);
    }
}
