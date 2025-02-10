package inheritance;

public class Box {
    double length;
    double width;
    double height;

    public Box (){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    public Box(double length,double width){
        this.length = length;
        this.width = width;
        System.out.println("These is a square/rectangle : "+ length*width);
    }


    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("These is a cube : "+ length*width*height);
    }
}
