package Lab7_Java.task2;

public class Main {
    public static void main(String[] args) {
        SuperClass a = new SuperClass("Hello");
        System.out.println("Superclass text: " + a.getText() + ", length = " + a.length());
        a.set("Hello, world");
        System.out.println("Superclass text: " + a.getText() + ", length = " + a.length());

        SubClass b = new SubClass(10, "Java");
        System.out.println("Subclass: text = " + b.getText() + ", number = " + b.number + ", length = " + b.length());

        b.set("Inheritance");
        System.out.println("set(String): text = " + b.getText() + ", number = " + b.number);

        b.set(25);
        System.out.println("set(int): text = " + b.getText() + ", number = " + b.number);

        b.set("Overload", 7);
        System.out.println("set(String, int): text = " + b.getText() + ", number = " + b.number);

        b.set();
        System.out.println("set(): text = \"" + b.getText() + "\", number = " + b.number);
    }
}
