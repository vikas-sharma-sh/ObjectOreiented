package Interface.ex2MultipleInheritance;

public interface Swim {

    default void swim(){
        System.out.println("SWIMMING!!!");
    }
}
