abstract class abstractExample {

    abstract void abs(); // incomplete method 

    void display(){
        System.out.println("This is non abstract method ");
    }

}

class abstractChild extends abstractExample {

    void abs(){
        System.out.println("Abstract child method ");
    }
}

class abstractChild1 extends abstractExample{

    void abs(){
        System.out.println("Abstract child 1 method");
    }


}

public class abstraction {

    public static void main(String[] args) {
        System.out.println("Abstraction");

        // java doesn't allow to create object for abstract class 
        // abstractExample obj = new abstractExample();
        // obj.abs();


        abstractChild obj = new abstractChild();
        obj.abs();

        abstractChild1 obj1 = new abstractChild1();
        obj1.abs();

    }
    
}
