package Polymorphism.Runtime;

public class dog extends Animal {

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks bhow..... bhow.....");
    }
}
