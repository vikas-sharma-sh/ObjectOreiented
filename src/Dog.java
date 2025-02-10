
//class, objects, constructor,method

public class Dog {
    String name;
    int age;
    //default you can add these
    /*
     public Dog(){
        this.name = "DUUgguu";
        this.age = 4;
    }
     */
    public Dog(){

    }
   //constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark(){
        System.out.println(name + " says : woof! ");
        hungry();
    }

   static void hungry(){
        System.out.println(" i am static method i dont need objects and instance !!!");

    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Bunny";
        myDog.age = 3;
        myDog.bark();


        Dog myDog1 = new Dog("COCO",1);
        myDog1.bark();//in static method to use non static method we have to create instance
        hungry();//in static method to access static method we dont need to create instance

    }
}
