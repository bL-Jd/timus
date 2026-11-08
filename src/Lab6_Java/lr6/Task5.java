package Lab6_Java.lr6;

public class Task5 {

    // сумма квадратов 1^2 + 2^2 + ... + n^2
    public static long sumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] tests = {1, 3, 5, 10, 100};
        for (int n : tests) {
            long byLoop = sumOfSquares(n);
            long byFormula = (long) n * (n + 1) * (2 * n + 1) / 6;
            System.out.println("n = " + n + ": цикл = " + byLoop + ", формула = " + byFormula);
        }
    }
}
