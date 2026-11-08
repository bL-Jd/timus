package Lab5_Java.lr5;

public class Task3 {
    public static void main(String[] args) {
        TwoInts x = new TwoInts();
        TwoInts y = new TwoInts(7);
        TwoInts z = new TwoInts(7, 15);

        System.out.print("Без аргументов:  ");
        x.show();
        System.out.print("Один аргумент:   ");
        y.show();
        System.out.print("Два аргумента:   ");
        z.show();
    }
}
