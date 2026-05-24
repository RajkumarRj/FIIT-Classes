package user;

public class Accessspecificier {

    private int data = 10;

    protected String name = "FIIT";

    public void greet(){
        System.out.println("Welcome to FIIT");
    }
    

    void display(){
        System.out.println("Display method from AccessSpecifier class");
    }
}
