package lec10;

public class JavaPenguin extends JavaAnimal {
    public JavaPenguin(final String species, final int legCount, final int wingCount) {
        super(species, 2);
        this.wingCount = 2;
    }

    private final int wingCount;

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다. 꿱꿱.");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.wingCount;
    }
}
