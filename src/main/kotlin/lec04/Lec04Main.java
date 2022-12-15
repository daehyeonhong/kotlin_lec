package lec04;

public class Lec04Main {
    public static void main(String[] args) {
        final JavaMoney money1 = new JavaMoney(1_000L);
        final JavaMoney money2 = new JavaMoney(2_000L);
        System.out.println(money1.plus(money2).toString());
    }
}
