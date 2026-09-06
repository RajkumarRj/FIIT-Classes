class Student{  // doesn't crreate space in memory 
    int id ;
    String name  ;
    // field 

    // constructor method name should be same as class name 
    // default constructor
    Student(){
        id = 1;
        name = "Guest";
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    // parameterized constructor 
    // function => argument, parameter 

    // methods 
    void display(){
        System.out.println(id + " "+ name);
    }
}


// inheritance => inherits properties of parent class 

class Parent {
    int salary = 50000;

    void greet(){
        System.out.println("Welcome to our project");
    }
}


class Child extends  Parent {
   
}

class Grandparent{

}
class Parent1 extends Grandparent{

}
class child1 extends Parent1{

}

class Father {

}

class ChildA extends Father{

}

class ChildB extends Father{

}

// single  parent - child
// multilevel
// hierarchical
// multiple
// hybrid 

class Bank {
    private String mobile = "542095834905";


    public  void setMobile(String mobile){
        this.mobile = mobile;
    } 

    public void getMobile(){
        System.out.println(mobile);
    }
}


// polymorphism => many forms 
    // compile time (method overloading) same class 
    // runtime  (method overriding) different class 

class Arithmetic{

    void add(int a, int b){
        System.out.println("method 1");
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println("method 2");
        System.out.println(a+b+c);
    }
}


class Payment{
    void pay(){
        System.out.println("Payment paid successfully");
    }
}

class UPI extends Payment{
    void pay(){
        System.out.println("Payment paid using UPI successfully");
    }

}

class COD extends Payment{
    void pay(){
        System.out.println("Payment will be paid using COD successfully");
    }
}

public class Day3 {
    public static void main(String[] args) {

        UPI upi = new UPI();

        upi.pay();

        COD cod = new COD();
        cod.pay();




        Arithmetic arith = new Arithmetic();
        arith.add(10,10);
        arith.add(10,10,10);



        Bank bank = new Bank();
        bank.getMobile();

        bank.setMobile("3248342905");

        bank.getMobile();
        // System.out.println(bank.mobile);

        





        Child child = new Child();

        System.out.println(child.salary);
        child.greet();



































        Student stu = new Student(1, "FIIT");
        Student stu1 = new Student(2, "Divya");
        

        // stu.id = 12;
        // stu.name = "FIIT";
        System.out.println(stu.id);
        System.out.println(stu.name);
        stu.display();

        System.out.println(stu1.id);
        System.out.println(stu1.name);
        stu1.display();

        // oop => object oriented programming 
        
        // class object 
        // oops have four pillars => inheritance, encapsulation, poly, abstraction

    //    what is class => 1 bytes

    // class defines  = variables , methods (function)




    // void add(int a , int b ){  // parameter

    //     System.out.println( a+ b);
    // }


    // add(10,20); argument 

    }
    
}
