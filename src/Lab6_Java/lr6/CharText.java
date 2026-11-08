package Lab6_Java.lr6;

// Класс с символьным и текстовым полями и перегруженным методом присваивания
public class CharText {
    private char symbol;
    private String text;

    // символьный аргумент – значение символьного поля
    public void set(char symbol) {
        this.symbol = symbol;
    }

    // текстовый аргумент – значение текстового поля
    public void set(String text) {
        this.text = text;
    }

    // символьный массив: из одного элемента – символьное поле, иначе – строка из символов массива
    public void set(char[] array) {
        if (array.length == 1) {
            this.symbol = array[0];
        } else {
            this.text = new String(array);
        }
    }

    public void show() {
        System.out.println("Символьное поле: " + symbol + ", текстовое поле: " + text);
    }
}
