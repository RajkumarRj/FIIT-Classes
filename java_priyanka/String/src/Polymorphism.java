class maths{
    // overloading => same method name,
    //  but different in paramter size , 
    // and also importantly we can achieve in same class
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c); 
    }
}

//overriding => runtime 

class payment{
    void pay(){
        System.out.println("paid");
    }
}

class UPI extends payment{
    
    void pay(){
        System.out.println("upi");
    }

}

class COD extends payment{

    void pay(){
        System.out.println("cod");
    }

}

public class Polymorphism {

    public static void main(String[] args) {

        // UPI upi = new UPI();
        // upi.pay();

        // COD cod = new COD();
        // cod.pay();

        payment paid = new UPI();
        payment paid2= new COD();

        paid.pay();
        paid2.pay();


        maths obj = new maths();

        obj.add(10,5);
        obj.add(10,10,10);
        
        System.out.println("polymorphism");

        // polmorphism => poly -> many 
        // same method
        // two types of polymorphism => compile-time, runtime polymorphism

        // compile -time => overloading
        // runtime => overriding
    }
    
}
