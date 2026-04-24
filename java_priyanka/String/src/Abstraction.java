abstract class abs{ // it doesn't allow for object creation 
    // we won't achieve full abstraction because we have non-abstract method also 
    abstract void absMethod(); //incomplete methods only function declaration 
    abstract void store();
    void display(){
      System.out.println("Abstraction method class");  
    }
}

class nonabs extends abs{

    void absMethod() {
        System.out.println("Abstraction method ");
    }   
    void store(){
        System.out.println("Store method");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        nonabs obj = new nonabs();
        obj.display();
        obj.absMethod();
        obj.store();
        // System.out.println("Abstraction");
        // abs obj = new abs(); //store in heap 
        // stack => obj 
        // heap => object of abs 
        // obj.display();
        // obj.absMethod();
    }
    
}
