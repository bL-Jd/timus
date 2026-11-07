/*
Проблема: 1197 Один в поле воин

Ввод
В первой строке находится единственное число N, 1 ≤ N ≤ 64 — количество тестов.
В каждой из последующих N строк содержится очередной тест:
два символа (маленькая латинская буква от 'a' до 'h' и цифра от 1 до 8) —
стандартное шахматное обозначение клетки, на которой стоит конь.
При этом буква обозначает вертикаль, а цифра — горизонталь.

Вывод
Выведите N строк: в каждой из них должно находиться единственное число —
количество клеток шахматной доски, находящихся под боем коня.

исходные данные
3
a1
d4
g6

результат
2
8
6
*/

import java.util.Scanner;

public class task1197 {

    static final int VALUEa = 97;
    static final int BOARD_ROW = 8;
    static final int BOARD_COLUMN = 8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] chessBoard = new int[BOARD_ROW][BOARD_COLUMN];

        int numCases = input.nextInt();

        for (int i = 0; i < numCases; i++)
        {
            String position = input.next();
            int knightRow = (position.charAt(0) - VALUEa + 1) - 1;
            int knightColumn = Integer.parseInt(position.charAt(1) + "") - 1;


            int possibleMoves = 0;


            if ( inBounds(knightRow + 2, knightColumn - 1))
                possibleMoves++;
            if (inBounds(knightRow + 2, knightColumn + 1))
                possibleMoves++;
            if (inBounds(knightRow - 2,knightColumn - 1))
                possibleMoves++;
            if (inBounds(knightRow - 2,knightColumn + 1))
                possibleMoves++;

            if ( inBounds(knightRow + 1,knightColumn + 2 ))
                possibleMoves++;
            if (inBounds(knightRow - 1,knightColumn + 2))
                possibleMoves++;
            if (inBounds(knightRow - 1, knightColumn - 2))
                possibleMoves++;
            if ( inBounds(knightRow + 1, knightColumn - 2))
                possibleMoves++;

            System.out.println(possibleMoves);
        }

    }

    public static boolean inBounds(int row, int column)
    {
        return ( (row < BOARD_ROW && row >= 0 ) && (column < BOARD_COLUMN && column >= 0));
    }

}