package Interface.ex1;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        int x = c1.age;
        c1.brake();
        c1.engine();
        c1.stop();

//        Brake b1 = new Car();
//        b1.start(); cant access child class as car is child of brake, engine as it implements it  but can
    }

}
/*
 By default, an interface can only have abstract methods (methods without a body). However, starting from Java 8,
  interfaces can also have default methods (methods with a body) and static methods.
  But the default methods are still abstract if they're not defined in the interface.

  interface Animal {
    void sound();  // abstract method (no body)

    // Default method (Java 8 and onwards)
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Static method
    static void breathe() {
        System.out.println("Animal is breathing");
    }
}

 */
