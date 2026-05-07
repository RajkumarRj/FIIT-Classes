class Counter {

    int count =0;

    synchronized void increment(){
        count++;
    }
}


public class lambda {

    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("lambda expression above");

        Counter ct = new Counter();
        // System.out.println(ct.count);

        // ct.increment();

        // System.out.println(ct.count);
        Thread obj = new Thread( ()->{
            for(int i=1; i<=30000; i++){
               ct.increment();
            }
        });

         Thread obj2 = new Thread( ()->{
            for(int i=1; i<=20000; i++){
               ct.increment();
            }
        });

        obj.start();
        obj2.start();


        obj.join();
        obj2.join();

        System.out.println(ct.count);

        System.out.println("Lambda expression below");



      
    }
}
