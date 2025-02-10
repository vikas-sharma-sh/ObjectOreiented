package Polymorphism;
//compile time polymorphism = overloading
// run time polymorphism = overriding
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        Circle c1 = new Circle();
        c1.area();
        System.out.println("-----------------------------------------");
        triangle t1 = new triangle();
        t1.area();
        System.out.println("-----------------------------------------");
        Square s1 = new Square();
        s1.area();
        System.out.println("-----------------------------------------");
        Shapes sh1 = new Shapes();
        sh1.area();
        //System.out.println(2<<2);//2*2power(2)

    }
}
