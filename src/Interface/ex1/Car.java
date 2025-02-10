package Interface.ex1;

public class Car implements Brake,Engine{

    int age = 18;

    public void stop(){
        System.out.println("CAR IS STOPpED");
    }

    @Override
    public void brake() {
        System.out.println("i brake as a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car!!!");
    }

    @Override
    public void engine() {
        System.out.println("i have a cars engine!!!!!!!");
    }
}
