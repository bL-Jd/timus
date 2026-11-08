package Lab5_Java.lr5;

// Класс с закрытым целочисленным полем, значение которого не превышает 100
public class LimitedValue {
    private int value;

    // конструктор работает так же, как метод setValue
    public LimitedValue() {
        setValue();
    }

    public LimitedValue(int value) {
        setValue(value);
    }

    // без аргументов: поле получает нулевое значение
    public void setValue() {
        value = 0;
    }

    // с аргументом: значение больше 100 заменяется на 100
    public void setValue(int newValue) {
        if (newValue > 100) {
            value = 100;
        } else {
            value = newValue;
        }
    }

    // позволяет проверить значение поля
    public int getValue() {
        return value;
    }
}
