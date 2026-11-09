package Lab7_Java.task3;

public class ClassC extends ClassB {
    public String text;

    public ClassC(int num, char symbol, String text) {
        super(num, symbol);
        this.text = text;
    }

    // перегрузка метода суперкласса
    public void set(int num, char symbol, String text) {
        super.set(num, symbol);
        this.text = text;
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() +
                ", num = " + num + ", symbol = " + symbol + ", text = " + text;
    }
}
