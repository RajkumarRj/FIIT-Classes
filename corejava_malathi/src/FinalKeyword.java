final class Malathi{

   final int secretCode = 123;

    final void display(){
    System.out.println("Display method");
   }
}
class Child extends Malathi{
    // void display(){
    //     System.out.println("Display method from child class");
    // }
}
public class FinalKeyword {
    public static void main(String[] args) {

        Child child = new Child();
        child.display();
        Malathi obj = new Malathi();
        // obj.secretCode = 345;
        System.out.println(obj.secretCode);
        
        System.out.println("Final keyword");
    }
    
}
