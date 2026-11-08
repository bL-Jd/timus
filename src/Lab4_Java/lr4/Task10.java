package Lab4_Java.lr4;

import java.util.Scanner;

// Шифр Цезаря с собственным алфавитом
public class Task10 {
    // собственный алфавит: русские и латинские буквы обоих регистров, цифры, знаки и пробел
    static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
            + "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789 .,!?-";

    // сдвиг каждого символа по номеру в алфавите; символы вне алфавита не меняются
    static String shift(String text, int key) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = ALPHABET.indexOf(chars[i]);
            if (index >= 0) {
                int newIndex = Math.floorMod(index + key, ALPHABET.length());
                chars[i] = ALPHABET.charAt(newIndex);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();

        int key;
        while (true) {
            System.out.println("Введите ключ");
            if (in.hasNextInt()) {
                key = in.nextInt();
                in.nextLine(); // переход на следующую строку после числа
                break;
            }
            System.out.println("Ключ должен быть целым числом");
            in.nextLine(); // пропускаем некорректный ввод
        }

        String encrypted = shift(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine().trim();
            if (answer.equals("y")) {
                String decrypted = shift(encrypted, -key);
                System.out.println("Текст после обратного преобразования: " + decrypted);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        in.close();
    }
}
