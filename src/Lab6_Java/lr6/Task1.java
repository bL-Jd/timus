package Lab6_Java.lr6;

public class Task1 {
    public static void main(String[] args) {
        CharText obj = new CharText();

        obj.set('Q');
        obj.show();

        obj.set("Привет, Java!");
        obj.show();

        obj.set(new char[]{'z'});
        obj.show();

        obj.set(new char[]{'J', 'a', 'v', 'a'});
        obj.show();
    }
}
