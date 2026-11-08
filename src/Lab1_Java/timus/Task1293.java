package Lab1_Java.timus;

import java.util.Scanner;

/*
 * Timus 1293. Eniya
 * N панелей размером A x B метров, обрабатываются обе стороны,
 * на 1 кв. метр одной стороны нужен 1 нг. Ответ: 2 * N * A * B.
 */
public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(2 * n * a * b);
        in.close();
    }
}
