package ABstractions.Abstract2ex;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        car c1 = new car();
        c1.start();
        c1.stop();

        System.out.println("----------------------------------------------------------------");
        bike b1 = new bike();
        b1.start();
        b1.stop();
        System.out.println("----------------------------------------------------------------");
    }
}
