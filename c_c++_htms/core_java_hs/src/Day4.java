class Arithmetic{ // 
    Arithmetic(){
        System.out.println("COnstructor called");
    }
    Arithmetic(int a , int b){
        System.out.println(a+b);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class Payment{
  
    void pay(){
        System.out.println("Payment paid");
    }
}

class UPI extends Payment{
    void pay(){
            System.out.println("Payment paid using UPI");
    }
}



class Parent{

    int salary = 50000;

}


class Child extends Parent{

}

class Child1 extends Parent{

}

class Bank{
     private int accountNumber = 123;

     public void getter(){
        System.out.println(accountNumber);
     }

     public void setter(int acct){
        accountNumber = acct;
     }
}



public class Day4 {
    
    public static void main(String[] args) {



        Bank bank = new Bank();

        // System.out.println(bank.accountNumber);
        bank.setter(300);
        bank.getter();










        Arithmetic arith = new Arithmetic(10,20);

        arith.add(10, 20);
        arith.add(10,20,30);

        Child obj = new Child();

        System.out.println(obj.salary);



        // System.out.println("String");

        // string is immutable 

        // stringbuilder and stringbuffer => mutable 

        // StringBuilder sb = new StringBuilder("Hello world");

        // sb.append(" Java");
        // sb.insert(0, "Java ");
        // sb.delete(0, 5);  // n-1 (5-1) => 4
        // System.out.println(sb);

        // StringBuffer sb1 = new StringBuffer("FIIT");

        // // synchronized , thread-safe

        // sb1.append(" Java");
        // sb1.insert(0, "Institute ");

        // System.out.println(sb1);


        // listen => 'l', 'i', 's', 't'


    }
}
