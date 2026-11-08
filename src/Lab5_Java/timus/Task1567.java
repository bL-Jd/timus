package Lab5_Java.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Timus 1567. SMS-спам
public class Task1567 {

    // стоимость набора одного символа: число нажатий на кнопку
    static int cost(char c) {
        if (c >= 'a' && c <= 'z') {
            // буквы по три на кнопку (abc, def, ...), последняя кнопка yz – две буквы
            return (c - 'a') % 3 + 1;
        }
        switch (c) {
            case '.':
                return 1;
            case ',':
                return 2;
            case '!':
                return 3;
            default:
                return 1; // пробел
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        int total = 0;
        for (int i = 0; i < line.length(); i++) {
            total += cost(line.charAt(i));
        }
        System.out.println(total);
    }
}
