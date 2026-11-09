package Lab7_Java.task5;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // отображает название класса и значение поля
    public void show() {
        System.out.println("Class name: " + getClass().getSimpleName() + ", text = " + text);
    }
}
