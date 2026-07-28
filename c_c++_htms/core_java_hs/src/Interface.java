interface Student{
     void display();
}

interface Teacher extends Student{

}

// same => extends
// different => implement

class PET implements Student{
    public void display(){
        System.out.println("Hello there");
    }
}


class Multiple implements Student , Teacher{
    public void display(){
        System.out.println("Display method");
    }
}

class WoH {

}

class Hybrid extends WoH implements Student{

    public void display(){
        System.out.println("Hello world");
    }
}



 final class FinalKeyword{

    final int data = 10; // field 

    final void display(){
        System.out.println("Display method from finalKeyword class");
    }
}

class Subclass extends FinalKeyword{

    void display(){
        System.out.println(10);
    }
}

// field => don't allow to modify values 
// method => don't allow to override in subclass
// class => don't allow class to inherit

public class Interface {

    public static void main(String[] args) {

        FinalKeyword fkey = new FinalKeyword();
        // fkey.data = 40;
        System.out.println(fkey.data);

        fkey.display();



        PET obj = new PET();

        obj.display();

    }

    
}
