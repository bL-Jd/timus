package Lab7_Java.task2;

public class SubClass extends SuperClass {
    // открытое целочисленное поле
    public int number;

    // конструктор: сначала целое число, затем текст
    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    // перегрузка: без параметров (значения по умолчанию)
    public void set() {
        super.set("");
        number = 0;
    }

    // переопределение метода суперкласса: с текстовым параметром
    @Override
    public void set(String text) {
        super.set(text);
    }

    // перегрузка: с целочисленным параметром
    public void set(int number) {
        this.number = number;
    }

    // перегрузка: с текстовым и целочисленным параметрами
    public void set(String text, int number) {
        super.set(text);
        this.number = number;
    }
}
