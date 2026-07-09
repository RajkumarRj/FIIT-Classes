class Parent{
    Parent(){ // default constructor 
        System.out.println("Parent constructor called");
    }
    Parent(String name){
        System.out.println(name);
    }
}
class Child extends Parent{
    Child(){
        super("Malathi");
        System.out.println("Child constructor called");
    }
}
public class Superclass {

    public static void main(String[] args) {

        Child obj = new Child();

        System.out.println("Super class");
        
    }
    
}
