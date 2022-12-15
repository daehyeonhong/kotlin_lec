package lec04;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {
    private final long amount;

    public JavaMoney(final long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull final JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }
}
