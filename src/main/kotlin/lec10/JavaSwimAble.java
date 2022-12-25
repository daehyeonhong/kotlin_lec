package lec10;

public interface JavaSwimAble {
    default void act() {
        System.out.println("움파 움파.");
    }
}
