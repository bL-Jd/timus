package Lab8_Java.task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        // 1. Программное создание исходного файла: две строки UTF-8 и 5 чисел double
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("src/Lab8_Java/task2/source.dat"))) {
            out.writeUTF("Первая строка исходного файла");
            out.writeUTF("Вторая строка исходного файла");
            double[] numbers = {12.5, -3.7, 0.0, 8.25, -1.1};
            for (double d : numbers) {
                out.writeDouble(d);
            }
        } catch (IOException e) {
            System.out.println("Ошибка создания исходного файла: " + e);
            return;
        }

        // 2. Чтение исходного файла и запись в результирующий:
        //    вторая строка и положительные числа
        try (DataInputStream in = new DataInputStream(new FileInputStream("src/Lab8_Java/task2/source.dat"));
             DataOutputStream out = new DataOutputStream(new FileOutputStream("src/Lab8_Java/task2/result.dat"))) {
            String first = in.readUTF();  // первая строка пропускается
            String second = in.readUTF(); // вторая строка переписывается
            out.writeUTF(second);
            for (int i = 0; i < 5; i++) {
                double d = in.readDouble();
                if (d > 0) {
                    out.writeDouble(d);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка переписывания данных: " + e);
            return;
        }

        // 3. Проверка: вывод содержимого обоих файлов
        System.out.println("Исходный файл source.dat:");
        try (DataInputStream in = new DataInputStream(new FileInputStream("src/Lab8_Java/task2/source.dat"))) {
            System.out.println("  строка 1: " + in.readUTF());
            System.out.println("  строка 2: " + in.readUTF());
            for (int i = 0; i < 5; i++) {
                System.out.println("  число " + (i + 1) + ": " + in.readDouble());
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e);
        }

        System.out.println("Результирующий файл result.dat:");
        try (DataInputStream in = new DataInputStream(new FileInputStream("src/Lab8_Java/task2/result.dat"))) {
            System.out.println("  строка: " + in.readUTF());
            try {
                while (true) {
                    System.out.println("  число: " + in.readDouble());
                }
            } catch (EOFException e) {
                // конец файла
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e);
        }
    }
}
