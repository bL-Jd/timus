package Lab7_Java.task1;

public class SubClass extends SuperClass {
    // дополнительное закрытое текстовое поле
    private String str2;

    // конструктор с одним текстовым аргументом
    public SubClass(String str1) {
        super(str1);
        this.str2 = "";
    }

    // конструктор с двумя текстовыми аргументами
    public SubClass(String str1, String str2) {
        super(str1);
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1 = " + getStr1() + "\n" +
                "str2 = " + str2;
    }
}
