final class finalClass {

    final int count = 10;
    final void display(){
        System.out.println("final class method");
    }
}

class finalClassChild extends finalClass{

    // void display(){
    //     System.out.println("finalclass child");
    // }

}


// final (field)=> we don't able to change the value of it
// final (method)=> we can't override in subclass
// final (class) => we can't inherit that class

public class FinalKey {
    
    public static void main(String[] args) {
        
        System.out.println("Hello there");

        finalClass obj = new finalClass();

        // obj.count = 20;
        System.out.println(obj.count);


        finalClassChild obj1 = new finalClassChild();
        
        obj1.display();
    }
    
}
