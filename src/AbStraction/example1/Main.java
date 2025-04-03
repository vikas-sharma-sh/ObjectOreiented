package AbStraction.example1;

public class Main {
    public static void main(String[] args) {
        System.out.println("___________________________________________________");
        Son son = new Son();
        son.umar(20);
        son.career();
        son.gender();
        System.out.println("________________________________________________________");
        Daughter dg = new Daughter();
        dg.career();
        dg.gender();
    }
}
/*
An abstract class can have both abstract and non-abstract methods.
The non-abstract methods (methods with a body) can have implementation.
 From Java 8 onwards, abstract classes can also have default and static methods.
 An abstract class can implement an interface.
  This means an abstract class can provide some or all of the implementation required by an interface.
  Feature	Interface	Abstract Class
Methods	Only abstract methods (until Java 8); from Java 8 onwards, can have default and static methods.	Can have both abstract and non-abstract methods (with implementation).
Final Variables	All variables are implicitly public, static, and final.	Can have final and non-final variables.
Type of Variables	All variables are public, static, and final.	Can have public, protected, private, static, and non-static variables.
Implementation	Cannot provide implementation of methods.	Can provide partial implementation (abstract methods with or without implementation).
Inheritance	Interface can be implemented using implements keyword.	Abstract class can be extended using extends keyword.
Multiple Inheritance	Can implement multiple interfaces.	Can extend only one abstract class but can implement multiple interfaces.
Access Control	All members are public by default.	Members can have different access modifiers (private, protected, public).
Conclusion:
Use an interface when you want to define a contract or behavior that multiple classes can implement, particularly when you expect the classes to behave in a similar way but don't need shared implementation.

Use an abstract class when you want to share code among multiple related classes while still enforcing some common behavior in subclasses.
 */
