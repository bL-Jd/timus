package Lab5_Java.timus;

import java.util.Scanner;

// Timus 1581. Работа в команде
public class Task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            // считаем длину серии одинаковых чисел
            int j = i;
            while (j < n && numbers[j] == numbers[i]) {
                j++;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(j - i).append(' ').append(numbers[i]);
            i = j;
        }
        System.out.println(sb);
        in.close();
    }
}
