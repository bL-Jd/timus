package Lab7_Java.task3;

public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA(1);
        ClassB b = new ClassB(2, 'x');
        ClassC c = new ClassC(3, 'y', "abc");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a.set(10);
        b.set(20, 'z');
        c.set(30, 'w', "new text");
        System.out.println("After changing values:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
