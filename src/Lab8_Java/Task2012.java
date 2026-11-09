package Lab8_Java;

import java.util.Scanner;

public class Task2012 {

    static final int TOTAL_PROBLEMS = 12;
    static final int TOTAL_HOURS = 5;
    static final int TIME_FOR_EACH = 45;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numProbInFirstHour = input.nextInt();

        // оставшиеся проблемы после первого часа
        int numProbRemaining = TOTAL_PROBLEMS - numProbInFirstHour;

        // время для вычисления количества задач в часах, отведенное на решение каждой задачи в минутах
        double totalTimeReq = (numProbRemaining * TIME_FOR_EACH) / 60.0;

        if (totalTimeReq <= (TOTAL_HOURS - 1))
            System.out.println("YES");
        else
            System.out.println("NO");

        input.close();
    }
}