package Lab4_Java.lr4;

import java.util.Scanner;

// Шифр Цезаря по кодовой таблице символов (используется класс Encrypt)
public class Task8 {

    // Пример из методических указаний: сдвиг символов строки по кодовой таблице
    public static class Encrypt {

        public static String getEncryptString(String encryptString, int shift) {
            // преобразуем переданную в метод строку в символьный массив
            char[] arrayChar = encryptString.toCharArray();
            // массив для преобразованных символов
            char[] arrayCharNew = new char[arrayChar.length];
            // в цикле прибавляем к коду каждого символа сдвиг (ключ)
            for (int i = 0; i < arrayChar.length; i++) {
                arrayCharNew[i] = (char) (arrayChar[i] + shift);
            }
            // преобразуем новый символьный массив в строку и возвращаем её
            return new String(arrayCharNew);
        }
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

        String encrypted = Encrypt.getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine().trim();
            if (answer.equals("y")) {
                String decrypted = Encrypt.getEncryptString(encrypted, -key);
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
