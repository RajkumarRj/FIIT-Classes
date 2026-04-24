class Animal{
    void eat(){
        System.out.println("Animal will eat");
    }
}


//single inheritance 
class Dog extends Animal{
    // void eat(){
    //     System.out.println("Dog will eat");
    // }
}
class Rat extends Dog{


}
//hierarchical inheritance 
class Cat extends Animal{

}


public class InheritanceAbstractionPolyInterface {
    public static void main(String[] args) {
        // System.out.println("Hello there");

        // inheritance => single , multi-level, hierarchical, hybrid, multiple  
        Dog  obj = new Dog();
        obj.eat();
        Cat obj1 = new Cat();
        obj1.eat();

        Rat obj2 = new Rat();
        obj2.eat();

    }
    
    // parent => child //single 
    // parent => multiple child  //hierarchical
    // parent => child => grandchild //multi-level
    // hybrid and multiple inheritance achieved using interface 
}
