package lec04;

import org.jetbrains.annotations.NotNull;
import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney> {
    private final long amount;

    public JavaMoney(final long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull final JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final JavaMoney javaMoney = (JavaMoney) o;
        return amount == javaMoney.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
