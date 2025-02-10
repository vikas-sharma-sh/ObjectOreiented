package inheritance;

public class boxPrice extends boxWeight{
    double price;

    boxPrice(){
        super();
        this.price = -1;
    }

    public boxPrice(double price) {
        this.price = price;
    }

    public boxPrice(double weight, double price) {
        super(weight);
        this.price = price;
    }


    public boxPrice(double length, double width, double weight, double price) {
        super(length, width, weight);
        this.price = price;
    }

    public boxPrice(double length, double width, double height, double weight, double price) {
        super(length, width, height, weight);
        this.price = price;
    }
}
