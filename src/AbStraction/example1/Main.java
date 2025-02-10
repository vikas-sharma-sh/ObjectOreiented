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
