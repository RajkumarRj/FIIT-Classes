interface animal{ 
     void eat();
     void sound();
}

interface Bath{
    void water();
    void soap();
}

// multiple inheritance
class Tiger extends Elephant implements animal,Bath{
    
    public void eat(){        
        System.out.println("Tiger eats deer");
    }

    public void sound(){
        System.out.println("Tiger sounds");
    }

     public void water(){        
        System.out.println("Tiger bath with water");
    }

    public void soap(){
        System.out.println("Tiger bath without soap");
    }
}

// hybrid inheritance 

class Elephant {
    void display(){
        System.out.println("Elephant display method");
    }
}
public class Interface {
    // interface => we can achieve full abstraction 
    public static void main(String[] args) {

        Tiger obj = new Tiger();

        obj.water();
        obj.soap();
        obj.eat();
        obj.sound();
        obj.display();        
    }
}
