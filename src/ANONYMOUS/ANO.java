package ANONYMOUS;

interface Greeting {
    void greet();
    void name();
}

interface Seating{
    void sit();
}



public class ANO {
    public static void main(String[] args) {
        // Anonymous class implementing Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, welcome!");
            }

            @Override
            public void name() {
                System.out.println("Name!!!!!");
            }
        };

        Seating seat = new Seating(){

            @Override
            public void sit() {
                System.out.println("seated!!!!!!");
            }
        };

        greeting.greet();
        greeting.name();
        seat.sit();
    }
}

/*
class GreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello, welcome!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the named class
        Greeting greeting = new GreetingImpl();
        greeting.greet();  // Outputs: Hello, welcome!
    }
}
Comparison with Named Class:
In the named class version, we had to create a class (GreetingImpl) and instantiate it before using it.

In the anonymous class version, we directly defined the class and instantiated it in one step, without the need to create a named class.
 */
