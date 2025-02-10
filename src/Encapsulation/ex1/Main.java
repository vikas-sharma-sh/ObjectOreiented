package Encapsulation.ex1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Vikas Sharma");
        s1.setId(1);
        s1.setCgpa(8.85f);


        System.out.println(s1.getName());
        System.out.println(s1.getCgpa());
    }
}
