package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        long n = in.nextLong();

        long first = n - 1;
        long second = n;
        long third = n + 1;
        long sum = first + second + third;
        long fourth = sum * sum;

        System.out.println(first + " " + second + " " + third + " " + fourth);
        in.close();
    }
}
