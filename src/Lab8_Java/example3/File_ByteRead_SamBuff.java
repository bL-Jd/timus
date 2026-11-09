package Lab8_Java.example3;

import java.io.*;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    // Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) { // если не конец файла
                System.out.println("количество = " + count + ", buff = "
                        + Arrays.toString(buff) + ", str = "
                        + new String(buff, 0, count, "cp1251")); // данные буфера преобразуются в строку
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "MyFile1.txt";
        InputStream inFile = null; // объявляется до секции try, чтобы не ограничивать область видимости
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally { // корректное закрытие потока
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /**/
                }
            }
        }
    }
}
