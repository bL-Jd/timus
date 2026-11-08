package Lab3_Java.lr3;

public class Task8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        int index = 0;

        // перебираем заглавные буквы и пропускаем гласные
        for (char c = 'A'; c <= 'Z' && index < letters.length; c++) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                continue;
            }
            letters[index] = c;
            index++;
        }

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();
    }
}
