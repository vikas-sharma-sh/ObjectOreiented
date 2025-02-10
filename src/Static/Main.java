package Static;

class Demo {
    static int value;


    Demo() {
        value += 100;
        System.out.println("constructor called! " + value);

    }

    // Static block - executes once when the class is loaded
    static {
        value += 100;  // Initializing a static variable
        System.out.println("Static block executed! " + value);
    }

    static void display() {
        value += 100;
        System.out.println("Method Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Creating an object (but static block runs before this)
        System.out.println("_____________________");
        Demo obj = new Demo();

        Demo obj1 = new Demo();

        // Calling a static method
        System.out.println("__________________________");
        Demo.display();
        System.out.println("__________________________");
        Demo.display();
        System.out.println("__________________________");
        obj.display();
    }
}

