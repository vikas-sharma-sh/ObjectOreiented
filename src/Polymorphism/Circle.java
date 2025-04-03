package Polymorphism;

public class Circle extends Shapes{
    @Override
    void area() {
        super.area();
        System.out.println("AREA OF CIRCLE Math.pi*r*r");
    }
}
