package inheritance;


public class Main {
    public static void main(String[] args) {
        Box a1 = new Box();

        System.out.println(a1.height+" "+a1.width+" "+a1.length);
        System.out.println("_______________________________________________________________________");

        System.out.println("THESE IS EXAMPLE OF SINGLE LEVEL OF INHERITANCE");

        boxWeight bw1 = new boxWeight();
        System.out.println(bw1.height+" "+bw1.width+" "+bw1.length+" "+ bw1.weight);

        Box a2 = new Box(4.0,5.0,10.0);
        System.out.println(a2.height+" "+a2.width+" "+a2.length);

        boxWeight bw2 = new boxWeight(4.0,5.0,10.0,300.0);
        System.out.println(bw2.height+" "+ bw2.length+" "+ bw1.width+" "+ bw1.weight);


        System.out.println("_______________________________________________________________________");


        System.out.println("THESE IS EXAMPLE OF REFERENCE");

        Box a3 = new boxWeight(4.0,5.0,10.0,20.0);
        System.out.println(a3);

//        Box a3 = new boxWeight(4.0,5.0,10.0,20.0);
//        System.out.println(a3.weight); // these causes error but not for a3.length;
//        Super class i.e parent care doesn't have idea what's child class contains but child class have idea of//
//        what parent class contains


        //example of multilevel inheritance

        System.out.println("_______________________________________________________________________");
        System.out.println(" MULTILEVEL INHERITANCE ");
        boxPrice bp1 = new boxPrice(10,20,30,40,50);
        System.out.println(bp1.height + " "+ bp1.length + " "+ bp1.weight +" "+ bp1.width +" "+ bp1.price);

    }
}
