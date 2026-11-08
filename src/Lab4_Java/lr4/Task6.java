package Lab4_Java.lr4;

import java.util.Random;

// Удаление случайной строки и случайного столбца из двумерного массива
public class Task6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = i * 10 + j;
            }
        }

        Random random = new Random();
        int delRow = random.nextInt(rows);
        int delCol = random.nextInt(cols);

        System.out.println("Исходный массив:");
        print(array);
        System.out.println("Удаляем строку " + delRow + " и столбец " + delCol);

        int[][] result = new int[rows - 1][cols - 1];
        int ni = 0;
        for (int i = 0; i < rows; i++) {
            if (i == delRow) {
                continue; // пропускаем удаляемую строку
            }
            int nj = 0;
            for (int j = 0; j < cols; j++) {
                if (j == delCol) {
                    continue; // пропускаем удаляемый столбец
                }
                result[ni][nj] = array[i][j];
                nj++;
            }
            ni++;
        }

        System.out.println("Новый массив:");
        print(result);
    }

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}
