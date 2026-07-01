// abstract keyword 

// interface => able to achieve full abstraction 

interface exampleDemo{

    void display();
    void greet();
}

// class to class => extends
// interface to class => implements

class InterfaceDemo implements exampleDemo{

    public void display(){
        System.out.println("Display mmethod from interfaceDemo");
    }
   public  void greet(){
        System.out.println("Display method from interfaceDemo ");
    }
}
 

abstract class AbstractDemo{

    int data = 10;
    // abstract class allows => non-abstract and 
    // abstract method 
    void display(){
        System.out.println("DIsplay method ");
    }

    abstract void greet(); // method declaration 
    // (abstract method)
    abstract void welcome();
}

class ChildAbstract extends AbstractDemo{
    void greet(){
        System.out.println("Greet method");
    }
    void welcome(){
        System.out.println("Welcome method");
    }
}



public class Abstraction {
    
    public static void main(String[] args) {

        InterfaceDemo demo = new InterfaceDemo();

        demo.greet();
        demo.display();
        
        // System.out.println("Abstraction");

        // ChildAbstract obj = new ChildAbstract();

        // System.out.println(obj.data);
        // obj.display();
 
    }
}
