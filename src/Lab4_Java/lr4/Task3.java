package Lab4_Java.lr4;

// Прямоугольник из цифр 2 с помощью двумерного массива
public class Task3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 12;
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 2;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
