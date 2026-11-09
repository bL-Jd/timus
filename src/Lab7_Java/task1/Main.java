package Lab7_Java.task1;

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("text 1");
        System.out.println(obj1);
        System.out.println();

        SubClass obj2 = new SubClass("text 2");
        System.out.println(obj2);
        System.out.println();

        SubClass obj3 = new SubClass("text 3", "text 4");
        System.out.println(obj3);
    }
}
