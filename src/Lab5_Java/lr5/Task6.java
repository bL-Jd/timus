package Lab5_Java.lr5;

public class Task6 {
    public static void main(String[] args) {
        MaxMin m1 = new MaxMin(5);
        System.out.print("new MaxMin(5):         ");
        m1.show();

        MaxMin m2 = new MaxMin(20, 8);
        System.out.print("new MaxMin(20, 8):     ");
        m2.show();

        m2.set(30);
        System.out.print("set(30):               ");
        m2.show();

        m2.set(-4);
        System.out.print("set(-4):               ");
        m2.show();

        m2.set(12);
        System.out.print("set(12):               ");
        m2.show();

        m2.set(100, -50);
        System.out.print("set(100, -50):         ");
        m2.show();
    }
}
