package lec10;

public interface JavaFlyAble {
    default void act() {
        System.out.println("파닥 파닥.");
    }

    void fly();
}
