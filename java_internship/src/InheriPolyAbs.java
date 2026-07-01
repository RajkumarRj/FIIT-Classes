// class Admin{
//     private String secretKey = "123";

//     void getter(){
//         System.out.println(secretKey);
//     }
// }


// class Parent{
//     int salary = 50000;

//     void display(){
//         System.out.println("Parent method");
//     }
// }

// class Child extends Parent{

// }

// class Demooo{

//     void add(int a, int b){
//         System.out.println(a+b);
//     }

//      void add(int a, int b, int c){
//         System.out.println(a+b+c);
//     }
// }

class Payment{
    void pay(){
        System.out.println("Payment paid");
    }
}
class UPI extends Payment{
    void pay(){
        System.out.println("Payment paid using UPI");y
    }
}
class COD extends Payment{
    void pay(){
        System.out.println("Payment paid using COD");
    }
}

public class InheriPolyAbs {
    public static void main(String[] args) {

        UPI upi = new UPI();

        upi.pay();

        COD cod = new COD();

        cod.pay();
        // Demooo demo = new Demooo();

        // demo.add(10, 20);
        // demo.add(10, 20, 30);


        // polymorphism 
        // poly => many forms 

        // compile time (method overloading)
        // run time (method overriding)


        // Child obj = new Child();

        // System.out.println(obj.salary);
        // obj.display();

        // System.out.println("Inheritance");


        // object creation 
        // Admin admin = new Admin();

        // System.out.println(admin.secretKey);

        // admin.getter();

    }
}
