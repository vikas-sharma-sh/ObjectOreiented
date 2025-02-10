package Polymorphism.Runtime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Runtime Polymorphism = Overriding (same method signature, resolved at runtime).");
        System.out.println("Runtime polymorphism requires inheritance ");
        System.out.println("--------------------------------------------------");
        Animal a1 = new Animal();
        a1.sound();
        System.out.println("--------------------------------------------------");
        cat c1 = new cat();
        c1.sound();
        System.out.println("--------------------------------------------------");
        dog d1 = new dog();
        d1.sound();
        System.out.println("--------------------------------------------------");
    }
}
