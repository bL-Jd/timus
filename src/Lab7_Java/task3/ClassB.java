package Lab7_Java.task3;

public class ClassB extends ClassA {
    public char symbol;

    public ClassB(int num, char symbol) {
        super(num);
        this.symbol = symbol;
    }

    // перегрузка метода суперкласса
    public void set(int num, char symbol) {
        super.set(num);
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() +
                ", num = " + num + ", symbol = " + symbol;
    }
}
