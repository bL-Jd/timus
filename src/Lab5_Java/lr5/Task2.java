package Lab5_Java.lr5;

public class Task2 {
    public static void main(String[] args) {
        CharRange range1 = new CharRange('A', 'D');
        range1.showRange();

        CharRange range2 = new CharRange('a', 'k');
        range2.showRange();

        // порядок значений полей не важен
        CharRange range3 = new CharRange('9', '0');
        range3.showRange();
    }
}
