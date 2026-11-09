package Lab7_Java.task2;

public class SuperClass {
    // закрытое текстовое поле
    private String text;

    // конструктор с одним текстовым аргументом
    public SuperClass(String text) {
        this.text = text;
    }

    // метод для присваивания значения полю
    public void set(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // длина текстовой строки
    public int length() {
        return text.length();
    }
}
