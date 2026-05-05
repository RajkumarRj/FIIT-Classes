class Counter{
    int count =0;

    synchronized void increment(){
        count++;
    }
}

class Bank{
    int balance = 1000;

   synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -=  amount;
            System.out.println("Withdraw successfully");
        }else{
            System.out.println("insufficient balance");
        }
    }
}

public class multiSynchornized {

    public static void main(String[] args) throws InterruptedException{

        Counter c = new Counter();

        // c.increment();
        // c.increment();

        // lamda expresssion
        Thread t1 = new Thread( ()->{
            for(int i=1; i<=15000; i++){
                c.increment();
            }
        } );

        
        
        Thread t2 = new Thread( ()->{
            for(int i=1; i<=15000; i++){
                c.increment();
            }
        } );
        

        Thread t3 = new Thread( ()->{
            for(int i=1; i<=15000; i++){
                c.increment();
            }
        } );

        

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println(c.count);


        

    }
    
}
