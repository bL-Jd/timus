package Lab5_Java.lr5;

// Класс с закрытым символьным полем и тремя открытыми методами
public class CharHolder {
    private char symbol;

    // присваивает значение полю
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // возвращает код символа
    public int getCode() {
        return symbol;
    }

    // выводит символ и его код
    public void show() {
        System.out.println("Символ: " + symbol + ", код: " + (int) symbol);
    }
}
