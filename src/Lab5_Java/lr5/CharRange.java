package Lab5_Java.lr5;

// Класс с двумя символьными полями и методом, выводящим символы между ними
public class CharRange {
    private char first;
    private char second;

    public CharRange(char first, char second) {
        this.first = first;
        this.second = second;
    }

    // выводит все символы кодовой таблицы от одного значения поля до другого включительно
    public void showRange() {
        char from = (char) Math.min(first, second);
        char to = (char) Math.max(first, second);
        for (int c = from; c <= to; c++) {
            System.out.print((char) c + " ");
        }
        System.out.println();
    }
}
