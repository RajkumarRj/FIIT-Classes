
interface Animal{
  void sound();
}

interface Father{
    void xyz();
}
interface Mother{
    void xyz();
}
//multiple inheritance 
class Child implements Father, Mother{
    public void xyz (){
        System.out.println("Child");
    }
}

class Food {
   
    public Food(){
        System.out.println("Food constructor is called ");
    }
    public Food(String fname){
        System.out.println(fname);
    }

    void eat(){
        System.out.println("Eating");
    }
}
//hybrid inheritance 
class Dog extends Food implements Animal{

    public Dog(){
        System.out.println("Dog constructor is called");
    }
//this -> current object 
//super => parent class or object 
    public Dog(String fname, String extra){
        super(fname);
        System.out.println(fname+ " "+ extra);
        
    }
    public void sound(){
        System.out.println("Bow Bow");
    }
}

public class Interface {
    
    public static void main(String[] args) {
        System.out.println("Interface");

        Dog obj = new Dog("pedigree", "bone");

        obj.sound();
        obj.eat();

        Child fiit = new Child();
        fiit.xyz();
    }
}
