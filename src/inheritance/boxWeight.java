package inheritance;

public class boxWeight extends Box{
    double weight;

    public boxWeight() {
        this.weight = -1;
    }

    public boxWeight(double weight) {
        this.weight = weight;
    }

    public boxWeight(double length, double width, double weight) {
        super(length, width);
        this.weight = weight;
    }

    public boxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
        System.out.println(" The weight of cube is :" + this.weight );
    }
}
