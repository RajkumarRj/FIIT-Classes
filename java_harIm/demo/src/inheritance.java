// class Parent{
//     int speed = 10;

//     void display(){
//         System.out.println("Parent class");
//     }
// }


// class Child extends Parent {
//     void def(){
//         System.out.println("Child method");
//     }
// }


// class Child2 extends Parent{
//     void ghi(){
//         System.out.println("Child2 method");
//     }
// }


class Grandpa{
    void xyz(){
        System.out.println("Grandpa ");
    }
}

class Parent extends Grandpa{
    void abc(){
        System.out.println("parent ");
    }
}

class Child extends Parent{
    void def(){
        System.out.println("child");
    }
}

// single level inheritance one parent - one child 
// multi level   - > grandparent -> parent -> child 
// hierarchical  -> one parent -> multiple child

// multiple  -> multiple parents -> one child (through interface) will thought in next class
// hybrid -> combination of multiple and hierarchical 

public class inheritance {

    public static void main(String[] args) {
        
        System.out.println("Inheritance");


        // Child obj = new Child();

        // obj.def();
        // obj.display();
        // System.out.println(obj.speed);


        Child obj = new Child();
        obj.def();
        obj.abc();
        obj.xyz();


    }
    
}
