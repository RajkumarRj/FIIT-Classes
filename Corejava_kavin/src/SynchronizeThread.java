class Counter{

    int count = 0;

   synchronized void increment(){
        count++;
    }
}

public class SynchronizeThread {

    public static void main(String[] args) throws InterruptedException{

        Counter cnt = new Counter();

        
        
        Thread obj = new Thread( ()->{
            for(int i=1; i<=25000; i++){
                cnt.increment();
            }
        } );

          
        Thread obj1 = new Thread( ()->{
            for(int i=1; i<=25000; i++){
                cnt.increment();
            }
        } );
        
        
        obj.start();
        obj1.start();
        
        obj.join();
        obj1.join();
        
        System.out.println(cnt.count);
        System.out.println("Main thread");
    }
    
}
