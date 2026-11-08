package Lab6_Java.lr6;

import java.util.Arrays;

public class Task9 {

    // меняет элементы местами: первый с последним, второй с предпоследним и т.д.
    public static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        char[] even = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println("До:    " + Arrays.toString(even));
        reverse(even);
        System.out.println("После: " + Arrays.toString(even));

        char[] odd = {'1', '2', '3', '4', '5'};
        System.out.println("До:    " + Arrays.toString(odd));
        reverse(odd);
        System.out.println("После: " + Arrays.toString(odd));
    }
}
