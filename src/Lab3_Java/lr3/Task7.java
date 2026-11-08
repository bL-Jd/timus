package Lab3_Java.lr3;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char[] letters = new char[size];

        // буквы «через одну»: a, c, e, g, ...
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + 2 * i);
        }

        System.out.print("Прямой порядок: ");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        System.out.print("Обратный порядок: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();
    }
}
