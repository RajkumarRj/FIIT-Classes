// abstract class => not able to create object because
//  they might have incomplete abstract method 
// we cannot achieve full abstraction 
// interface => we can achieve full abstraction 
abstract class Employee{
   abstract void work();
    void increment(){
    System.out.println(1000);
   }
}

class Developer extends Employee{
    void work(){
        System.out.println("Developing a software ");
    }

}

class Testing extends Employee{
    void work(){
        System.out.println("Testing a software ");
    }
}

public class Abstraction {
    
    public static void main(String[] args) {
        // abstraction => hide the hides and show only the essential information 

        Developer obj = new Developer();
        
        obj.work();
        


    }
}
