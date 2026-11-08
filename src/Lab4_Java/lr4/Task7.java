package Lab4_Java.lr4;

// Заполнение двумерного массива «змейкой»
public class Task7 {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;
        int[][] array = new int[rows][cols];
        int number = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // чётная строка – слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = number++;
                }
            } else {
                // нечётная строка – справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = number++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
