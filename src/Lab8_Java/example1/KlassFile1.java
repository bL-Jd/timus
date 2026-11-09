package Lab8_Java.example1;

import java.io.File;

public class KlassFile1 {
    public static void main(String[] args) {
        try {
            // Создание файла в текущей папке (где расположен проект)
            File f1 = new File("src/Lab8_Java/example1/MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) { // проверка существования файла
                System.out.println("Создан!!!!");
                System.out.println("Полный путь 1: " + f1.getAbsolutePath());
            }

            // Создание файла в папке disk (вместо диска E:) и вывод полного пути
            new File("src/Lab8_Java/example1/disk").mkdirs();
            File f2 = new File("src/Lab8_Java/example1/disk/MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            // Создание нескольких вложенных папок
            File f3 = new File("src/Lab8_Java/example1/disk/Papka1/Papka2/Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e);
        }
    }
}
