package lec03;


import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;
    private final int age;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Nullable
    public String getName() {
        return name;
    }
    @Nullable
    public int getAge() {
        return age;
    }
}
