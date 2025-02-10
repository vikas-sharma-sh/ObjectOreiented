package Interface.nestedint;

public class Car implements Vehicle.Engine{
    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }
}
