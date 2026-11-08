package Lab6_Java.lr6;

public class Task4 {

    // двойной факториал: n * (n - 2) * (n - 4) * ... (последний множитель 1 или 2)
    public static long doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = n; i > 1; i -= 2) {
            result = Math.multiplyExact(result, (long) i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {0, 1, 5, 6, 7, 10};
        for (int n : tests) {
            System.out.println(n + "!! = " + doubleFactorial(n));
        }
        try {
            doubleFactorial(100);
        } catch (ArithmeticException e) {
            System.out.println("100!! не помещается в тип long");
        }
    }
}
