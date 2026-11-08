package Lab3_Java.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Timus 1585. Пингвины
public class Task1585 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine().trim());

        int emperor = 0;
        int little = 0;
        int macaroni = 0;

        for (int i = 0; i < n; i++) {
            String line = in.readLine().trim();
            if (line.startsWith("Emperor")) {
                emperor++;
            } else if (line.startsWith("Little")) {
                little++;
            } else {
                macaroni++;
            }
        }

        if (emperor > little && emperor > macaroni) {
            System.out.println("Emperor Penguin");
        } else if (little > emperor && little > macaroni) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}

