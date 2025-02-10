package Polymorphism.CompileTIme;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Compile-Time Polymorphism = Overloading (same method name, different parameters).");
        System.out.println("-------------------------------------");
        c1.add(10,20);
        System.out.println("--------------------------------------");
        c1.add(10.0,20.0);
        System.out.println("---------------------------------------");
        c1.add(10,20,30);
        System.out.println("----------------------------------------");
    }
}
