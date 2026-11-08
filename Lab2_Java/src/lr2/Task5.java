package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        long n = Math.abs(in.nextLong());

        // четвёртая цифра справа: делим на 1000 и берём последнюю цифру
        long thousands = (n / 1000) % 10;
        System.out.println("Тысяч в числе: " + thousands);
        in.close();
    }
}
