package Lab7_Java.task4;

public class Main {
    public static void main(String[] args) {
        ClassC original = new ClassC('Q', "original", 100);
        ClassC copy = new ClassC(original);

        System.out.println(original);
        System.out.println(copy);

        // изменяем копию - оригинал не меняется
        copy.symbol = 'W';
        copy.text = "copy";
        copy.number = 200;
        System.out.println("After changing the copy:");
        System.out.println(original);
        System.out.println(copy);

        ClassA a = new ClassA('a');
        ClassB b = new ClassB('b', "text b");
        System.out.println(new ClassA(a));
        System.out.println(new ClassB(b));
    }
}
