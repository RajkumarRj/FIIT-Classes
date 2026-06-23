class Parent{
    float salary = 50000;

    void display(){
        System.out.println("DIsplay method from Parent");
    }
}

class Child extends Parent{

}

class child2 extends Parent{

}
// hierarchical inheritance 

// class Child1 extends Child{

// }

class Encap{
   private int password = 12345;


   public void setPassword(int pass){
    password = pass;
   }

   public void getPassword(){
    System.out.println(password);
   }

}

public class InheritanceEncapsulation {
    public static void main(String[] args) {

        Encap malathi = new Encap();
        malathi.setPassword(5678);
        malathi.getPassword();

        // System.out.println(malathi.password);

        Child obj = new Child();

        System.out.println(obj.salary);
        obj.display();


        // Child1 ch = new Child1();

        // System.out.println(ch.salary);

        // Encapsulation in Java is an object-oriented programming
        //  (OOP) concept that bundles variables (data) and 
        //  methods (behavior)
        //   into a single unit—a class—while restricting 
        //   direct access to the internal data





        // System.out.println("Hello there");
    }
    
}
