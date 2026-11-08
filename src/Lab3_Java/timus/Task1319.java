package Lab3_Java.timus;

import java.util.Scanner;

// Timus 1319. Отель
public class Task1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] table = new int[n][n];

        int number = 1;
        // diff = j - i: диагонали идут справа налево, начиная с правого верхнего угла
        for (int diff = n - 1; diff >= -(n - 1); diff--) {
            // внутри диагонали номера идут сверху вниз
            for (int i = Math.max(0, -diff); i <= Math.min(n - 1, n - 1 - diff); i++) {
                table[i][i + diff] = number;
                number++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(table[i][j]);
                if (j < n - 1) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
        in.close();
    }
}
