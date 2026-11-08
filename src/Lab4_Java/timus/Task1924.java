package Lab4_Java.timus;

import java.util.Scanner;

// Timus 1924. Четыре чертёнка
// Знак + или − не меняет чётность результата, поэтому чётность итога всегда
// совпадает с чётностью суммы 1 + 2 + ... + n = n(n+1)/2 и не зависит от игры.
public class Task1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = n * (n + 1) / 2;
        if (sum % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
        in.close();
    }
}
