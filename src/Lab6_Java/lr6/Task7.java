package Lab6_Java.lr6;

import java.util.Arrays;

public class Task7 {

    // массив кодов символов
    public static int[] codes(char[] chars) {
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'a', '0', 'я'};
        System.out.println("Символы: " + Arrays.toString(chars));
        System.out.println("Коды:    " + Arrays.toString(codes(chars)));
    }
}
