package Lab4_Java.lr4;

import java.util.Random;

// Транспонирование двумерного массива
public class Task5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int[][] array = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив (" + rows + " x " + cols + "):");
        print(array);

        // строки становятся столбцами
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }

        System.out.println("После транспонирования (" + cols + " x " + rows + "):");
        print(transposed);
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
