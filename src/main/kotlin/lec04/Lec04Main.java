package lec04;

public class Lec04Main {
    public static void main(String[] args) {
        final JavaMoney money1 = new JavaMoney(1_000L);
        final JavaMoney money2 = money1;
        final JavaMoney money3 = new JavaMoney(1_000L);
        System.out.println(money1 == money2);
        System.out.println(money1 == money3);
        System.out.println(money2 == money3);

        System.out.println(money1.equals(money2));
        System.out.println(money1.equals(money3));
        System.out.println(money2.equals(money3));
    }
}
