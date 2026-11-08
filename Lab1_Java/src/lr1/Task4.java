package lr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String month = in.next();
        System.out.println("Введите количество дней в этом месяце:");
        int days = in.nextInt();

        System.out.println("В месяце " + month + " " + days + " дней.");
        in.close();
    }
}
