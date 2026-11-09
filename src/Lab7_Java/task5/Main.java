package Lab7_Java.task5;

public class Main {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass("super text");
        SubClassOne one = new SubClassOne("text one", 42);
        SubClassTwo two = new SubClassTwo("text two", 'Z');

        sup.show();
        one.show();
        two.show();

        System.out.println("Call via superclass reference:");
        SuperClass ref;
        ref = one;
        ref.show();
        ref = two;
        ref.show();
    }
}
