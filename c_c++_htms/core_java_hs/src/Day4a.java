abstract class Abstraction{

    abstract void display(); // incomplete method 
    abstract void fiit();

    void showDetails(){
        System.out.println("Show details");
    }
}

class Child extends Abstraction{

    void display(){
        System.out.println("DIsplay method from child class");
    }
    void fiit(){
        System.out.println("Fiit ");
    }
}
// this and super


class Student{

    String name;

    Student(String name){
        this.name = name;
        System.out.println("Student COnstructor called");
        System.out.println(this.name);
    }
}

class PT extends Student{

    PT(){
        super("Harish"); // parent constructor 
        System.out.println("PT constructor called");
    }
}

public class Day4a {
    
    public static void main(String[] args) {

    PT obj = new PT();
    
    System.out.println("Abstraction");
    }
}
