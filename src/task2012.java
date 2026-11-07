/*
Проблема: 2012 Про Гришу Н

Ввод
В единственной строке записано целое число f —
сколько задач хочет решить Гриша за первый час соревнования (1 ≤ f ≤ 11).

Вывод
Выведите «YES», если Грише в одиночку удастся решить все предложенные задачи,
и «NO» в противном случае.

исходные данные
7
5

результат
YES
NO
*/

import java.util.Scanner;

public class task2012 {

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