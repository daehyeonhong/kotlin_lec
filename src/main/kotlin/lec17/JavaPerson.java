package lec17;

public class JavaPerson {
    private final String firstName;
    private int age;

    public JavaPerson(final String firstName, final int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public int nextYearAge() {
        System.out.println("멤버 함수");
        return this.age + 1;
    }

    public int getAge() {
        return this.age;
    }
}
