package Lab4_Java.lr4;

// Прямоугольный треугольник с помощью двумерного массива
public class Task4 {
    public static void main(String[] args) {
        int size = 8;
        char[][] array = new char[size][size];

        // символ '*' записывается в элементы, у которых j <= i
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
