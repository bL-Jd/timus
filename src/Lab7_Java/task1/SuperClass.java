package Lab7_Java.task1;

public class SuperClass {
    // закрытое текстовое поле
    private String str1;

    // конструктор с текстовым параметром
    public SuperClass(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1 = " + str1;
    }
}
