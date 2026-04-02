

final class Parent {
    final  void show(){
          System.out.println("Parent show method");
     }
}

class Child extends Parent{
     void show(){
          System.out.println("Child show method");
     }
}


public class finalExample {
    // final => key word 

    final int max = 100;

    void display(){
     // max = 1000;
     System.out.println(max);
    }

//     variable => cannot modify the values 
//     method => cannot override the method 
//     class => cannot inherit
     public static void main(String[] args) {

          finalExample obj = new finalExample();
          obj.display();

          Parent p = new Parent();
          p.show();

          // Child c= new Child();
          // c.show();
        
     }
}
