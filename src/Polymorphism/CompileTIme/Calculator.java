package Polymorphism.CompileTIme;

public class Calculator {

    void add(int a, int b){
        System.out.println("THESE IS INT VALUE WITH 2 DATA SUM IS : "+ (a+b));
    }

    void add(double x, double y){
        System.out.println(" THESE IS DOUBLE VALUE WITH 2 DATA SUM IS :  "+ (x+y));
    }

    void add( int x1, int x2, int x3){
        System.out.println(" I HAVE 3 INT VALUES  SUM IS : "+ (x1+x2+x3));
    }
}
