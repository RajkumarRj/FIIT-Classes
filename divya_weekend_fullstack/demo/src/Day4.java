abstract class AbstractClass {
     abstract void display();

     void greet(){
        System.out.println("non abstract method");
     }

     abstract void hello();
}

// abstract class doesn't provide full abstraction => it contains abstract and non abstract methods 
// interface  

class Child extends  AbstractClass{

    void display(){
        System.out.println("Child abstract class");
    }

    void hello(){
        System.out.println("hello method ");
    }
}


interface Payment{  // blueprint for class 
     void pay();
}

interface Mode   {
    void cod();
}

//mutliple inheritance 
class UpiPayment extends Child  implements  Mode, Payment{

    public void pay(){
        System.out.println("hello there");
    }

    public void cod(){
        System.out.println("COD");
    }
}

// public , private, default, protected 

// hybrid inheritance 
class Vehicle {
    void start(){
        System.out.println("Vehicle is moving");
    }
}

interface Engine{
    void rev();
}

interface  Battery{
    void charge();
}


class ElectricCar extends Vehicle implements Engine, Battery{
    public void rev(){

    }

    public void charge(){

    }
}



class InvalidAgeException extends  Exception{
    InvalidAgeException(String message){
        super(message);  // it calls parent constructor 
    }
}

public class Day4 {

    public static void main(String[] args) throws Exception {
        
        // Child ch = new Child();

        // ch.display();
        // ch.greet();


        // AbstractClass abs = new AbstractClass();

        // abs.display();

        // abstraction => hide internal implementation ,
        //  showing only necessary details 

        // abstract class => cannot create a object

        // abstract class => we have incomplete method\

        // checked (checked at compile time ) vs unchecked (arithmetic, )
        
        // examples => ioexception , classnotfoundexception , filenotfoundexception 
    

        System.out.println("Start");

        int a = 5;

        try{

            String input = "100k";

            int number = Integer.parseInt(input);

            int [] arr = {10,20};
            System.out.println(arr[10]); 

            String name  = null;

            System.out.println(name.length());

            System.out.println(a/0);
        }catch(ArithmeticException e){
                System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally");
        }

        
        int age = 15;
        
        if(age < 18){
            // throw new ArithmeticException("Not eligible ");
            throw new InvalidAgeException("Not eligible");
        }
        
        System.out.println("End");



        // throws 
    }
    
}
