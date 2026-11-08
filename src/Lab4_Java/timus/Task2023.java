package Lab4_Java.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Timus 2023. Дональд-почтальон
public class Task2023 {

    // номер шкафа (0 – левый, 1 – средний, 2 – правый) по первой букве имени адресата
    static int cabinet(String name) {
        char c = name.charAt(0);
        if (c == 'A' || c == 'P' || c == 'O' || c == 'R') {
            return 0;
        } else if (c == 'B' || c == 'M' || c == 'S') {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine().trim());

        int position = 0; // Дональд стоит у самого левого шкафа
        int steps = 0;
        for (int i = 0; i < n; i++) {
            int target = cabinet(in.readLine().trim());
            steps += Math.abs(target - position);
            position = target;
        }
        System.out.println(steps);
    }
}
