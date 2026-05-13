class Operator{
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class Payment{

    void pay(){
        System.out.println("Payment is done");
    }
}


class UPI extends Payment{
    void pay(){
        System.out.println("UPI payment successfull");
    }

}

class Card extends Payment{
    void pay(){
        System.out.println("Card payment successfull");
    }

}

class COD extends Payment{
    void pay(){
        System.out.println("Cash on delivery");
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("Polymorphism");

        // poly -> many forms

        // same method different implementation

        // polymorphism -> compile time, runtime 

        // compile time -> method overloading ( same name with different paremeter)
        // runtime -> method overriding ( same name overrides in subclasses)

        Operator obj = new Operator();

        obj.add(10,20);

        obj.add(40,50,60);


        Payment obj1 = new UPI();
        Payment obj2 = new COD();

        obj1.pay();
        obj2.pay();  
    }
    
}
