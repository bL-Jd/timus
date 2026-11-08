package Lab5_Java.lr5;

public class Task1 {
    public static void main(String[] args) {
        CharHolder holder = new CharHolder();

        holder.setSymbol('A');
        holder.show();
        System.out.println("Метод getCode() вернул: " + holder.getCode());

        holder.setSymbol('я');
        holder.show();
        System.out.println("Метод getCode() вернул: " + holder.getCode());
    }
}
