package Lab7_Java.task3;

public class ClassA {
    public int num;

    public ClassA(int num) {
        this.num = num;
    }

    public void set(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + ", num = " + num;
    }
}
