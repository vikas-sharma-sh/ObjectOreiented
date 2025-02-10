package AbStraction.example1;

public class Son extends Parent {
    public void umar (int age){
        this.age= age;
        System.out.println("SONS AGE : " + age);
    }

    @Override
    void career() {
        System.out.println("i want to become engineer!!!");
    }

    @Override
    void gender() {
        System.out.println(" Male ");
    }
}
