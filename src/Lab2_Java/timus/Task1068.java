package Lab2_Java.timus;

import java.util.Scanner;

// Timus 1068.
// Сумма всех целых чисел от 1 до N (при N < 1 – от N до 1).
public class Task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum;
        if (n >= 1) {
            sum = n * (n + 1) / 2;
        } else {
            sum = (1 + n) * (2 - n) / 2;
        }
        System.out.println(sum);
        in.close();
    }
}
