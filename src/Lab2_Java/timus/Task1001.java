package Lab2_Java.timus;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Timus 1001.
public class Task1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();
        while (input.hasNextLong()) {
            numbers.add(input.nextLong());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            sb.append(String.format(Locale.US, "%.4f%n", Math.sqrt(numbers.get(i))));
        }
        System.out.print(sb);
        input.close();
    }
}
