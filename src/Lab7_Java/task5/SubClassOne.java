package Lab7_Java.task5;

public class SubClassOne extends SuperClass {
    protected int number;

    public SubClassOne(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void show() {
        System.out.println("Class name: " + getClass().getSimpleName() +
                ", text = " + getText() + ", number = " + number);
    }
}
