

// abstract keyword on class => we don't create object
// abstract keyword on method => only need to declare a function 
// must implement in subclass(child class)


// interface => blueprint for class 
// interface we don't create object 
interface Grace{
    void display();
    void redmi();
    void data();
}

class Baby implements Grace {

    int age;

    Baby(int age){
        this.age = age;
        System.out.println("Construcotr is called");
    }

    public  void display(){
        System.out.println("Display method from baby class");
     }
    public void redmi(){
        System.out.println("redmi method from baby class");
    }
    public void data(){
        System.out.println("data method from baby class");
    }
}



abstract class Malathi{

    int salary = 90000;

   abstract  void display();
   abstract void redmi();

   void greet(){
    System.out.println("Welcome to java ");
   }
}

class Vinitha extends Malathi{

    void display(){
        System.out.println("Vinitha");
    }
    void redmi(){
        System.out.println("Redmi");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Baby baby = new Baby(2);

        baby.display();
        baby.data();
        baby.redmi();

       Vinitha obj = new Vinitha();

       System.out.println(obj.salary);
       obj.display();
        
        System.out.println("Abstraction");
    }
}
