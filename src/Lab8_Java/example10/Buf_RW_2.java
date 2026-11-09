package Lab8_Java.example10;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/Lab8_Java/example10/MyFile1.txt"), "cp1251"));

            out = new PrintWriter("src/Lab8_Java/example10/MyFile2.txt", "cp1251");
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
            br.close();
            out.flush();
            out.close();

            // Вывод информации из файла на монитор через PrintWriter и System.out
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/Lab8_Java/example10/MyFile1.txt"), "cp1251"));
            PrintWriter console = new PrintWriter(System.out);
            lineCount = 0;
            while ((s = br.readLine()) != null) {
                lineCount++;
                console.println(lineCount + ": " + s);
            }
            console.flush();
            br.close();
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
    }
}
