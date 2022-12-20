package lec08;

public class Lec08Main {
    public static void main(String[] args) {
        repeat("2", 1, true);
        repeat("2", 1);
        repeat("2", false);
    }

    public static void repeat(final String str, final int num, final boolean useNewLine) {
        for (int i = 0; i <= num; i++)
            if (useNewLine) System.out.println(str);
            else System.out.print(str);
    }

    public static void repeat(final String str, final int num) {
        repeat(str, num, true);
    }

    public static void repeat(final String str, final boolean useNewLine) {
        repeat(str, 13, useNewLine);
    }
}
