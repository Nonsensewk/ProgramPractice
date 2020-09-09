package rabit;

public class TestMain {
    public static void main(String[] args) {
        Rabits r = new Rabits();
        Tortoise t = new Tortoise();
        r.start();
        t.start();
    }
}
