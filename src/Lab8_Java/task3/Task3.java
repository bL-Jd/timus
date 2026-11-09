package Lab8_Java.task3;

import java.io.*;

public class Task3 {
    private static final String CONSONANTS = "бвгджзйклмнпрстфхцчшщ";

    // слово начинается с согласной буквы?
    private static boolean startsWithConsonant(String word) {
        return CONSONANTS.indexOf(Character.toLowerCase(word.charAt(0))) >= 0;
    }

    // убирает знаки препинания в начале и в конце слова
    private static String clean(String word) {
        int start = 0;
        int end = word.length();
        while (start < end && !Character.isLetter(word.charAt(start))) start++;
        while (end > start && !Character.isLetter(word.charAt(end - 1))) end--;
        return word.substring(start, end);
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("src/Lab8_Java/task3/pushkin.txt"), "UTF-8"));
             PrintWriter out = new PrintWriter("src/Lab8_Java/task3/result.txt", "UTF-8")) {

            int lineNumber = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // выделяем слова методом split()
                StringBuilder selected = new StringBuilder();
                int count = 0;
                for (String w : words) {
                    String word = clean(w);
                    if (!word.isEmpty() && startsWithConsonant(word)) {
                        selected.append(word).append(' ');
                        count++;
                    }
                }
                out.println("Строка " + lineNumber + ": " + selected.toString().trim());
                out.println("Количество слов: " + count);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
