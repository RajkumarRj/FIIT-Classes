class Poly{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b , int c){
       return a+b+c;
    }
}


class Payment{
    void pay(){
        System.out.println("payment paid");
    }
}

class UPI extends Payment{
    // method overriding 
    void pay(){
        System.out.println("Payment paid using UPI");
    }
}

class COD extends Payment{
    void pay(){
        System.out.println("pament paid using COD");
    }

}
public class PolyAbst {
    public static void main(String[] args) {

       Payment upi = new UPI();
       upi.pay();

       Payment cod = new COD();
       cod.pay();





        System.out.println("Polymorphism");

        Poly obj = new Poly();

        int result = obj.add(10,20);

        result = obj.add(10,20,30);

        System.out.println(result);



        // poly => many forms (allow same name , but must be 
        // different in parameters)
        // compile time polymorphism (method overloading )
        // run time polymorphism
    }
}
