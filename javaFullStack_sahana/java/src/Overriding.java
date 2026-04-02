// class Python {
//     void level(){
//         System.out.println("Easy");
//     }
// }

// class Cpp extends Python {
//     void level(){
//         System.out.println("Hard");
//     }
// }
 class Payment{
     void pay(){
        System.out.println("Paid");
    }
 }

 class UPI extends Payment{
    void pay(){
        System.out.println("UPI payment");
    }
 }
  class Card extends Payment{
    void pay(){
        System.out.println("Card payment");
    }
 }

public class Overriding {
    public static void main(String[] args) {
        // polymorphism => inherit + method overriding 
        // Python p = new Python();
        // Cpp c = new Cpp();

        // p.level();
        // c.level();

        Payment p = new UPI();
        Payment p1 = new Card();
        p.pay();
        p1.pay();



    }
}
