package lec04;

public class Lec04Main {
    public static void main(String[] args) {
        final JavaMoney money1 = new JavaMoney(2_000L);
        final JavaMoney money2 = new JavaMoney(1_000L);
        if (money1.compareTo(money2) > 0) {
            System.out.println("money1의 금액이 money2의 금액보다 금액이 큽니다.");
        }
    }
}
