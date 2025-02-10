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
