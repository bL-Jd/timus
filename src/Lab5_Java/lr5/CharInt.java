package Lab5_Java.lr5;

import java.math.BigDecimal;

// Класс с символьным и целочисленным полем
public class CharInt {
    private char symbol;
    private int number;

    // целое число и символ определяют значения полей
    public CharInt(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    // целая часть аргумента – код символа, десятые и сотые доли дробной части – целочисленное поле
    // (65.1267 -> символ 'A' с кодом 65, число 12)
    public CharInt(double value) {
        BigDecimal bd = BigDecimal.valueOf(Math.abs(value));
        int code = bd.intValue();
        // дробная часть, сдвинутая на два разряда; отбрасываем всё, что дальше сотых
        int fraction = bd.remainder(BigDecimal.ONE).movePointRight(2).intValue();
        this.symbol = (char) code;
        this.number = fraction;
    }

    public void show() {
        System.out.println("Символ: " + symbol + " (код " + (int) symbol + "), число: " + number);
    }
}
